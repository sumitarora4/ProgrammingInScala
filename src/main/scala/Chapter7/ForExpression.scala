package Chapter7

import java.io.File

object ForExpression extends App {

  val filesHere: Array[File] = (new java.io.File("./src/main/scala/Chapter6")).listFiles()
  println("fileSize=" + filesHere.size)

  def grep(str: String) = {

    for (
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala");

      line <- fileLines(file);
      trimmed = line.trim
      if trimmed.matches(str)
    )
      println(s"file:$trimmed")
  }

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toArray

  grep(".*Rational.*")

  def scalaFiles =
    for{
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

  println("file ==="+scalaFiles)


}
