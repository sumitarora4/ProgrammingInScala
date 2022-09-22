package Chapter9

import java.io.File

object FileMatcher extends App{

 private def filesHere = (new File(".")).listFiles()

//  1) Normal approach: different function for every task
 def filesEnding(query: String) =
   for(file <- filesHere; if file.getName.endsWith(query))
   yield file

  def filesContaining(query: String) =
    for(file <- filesHere; if file.getName.contains(query))
      yield file

  def filesRegex(query: String) =
    for(file <- filesHere; if file.getName.matches(query))
      yield  file

//  2) Using Function values:
//   to remove above three redundant searching functions we can use function values
//   which can calls the method for you.
  def fileMatchingHelper(query: String, matcher: (String, String)=> Boolean) ={
    for(file <- filesHere; if matcher(file.getName, query))
      yield file
  }

//  now we can simplify above three searching functions by having them call the helper method
  def simpleFilesEnding(query: String) =
    fileMatchingHelper(query, _.endsWith(_))

  def simpleFilesContaining(query: String) =
    fileMatchingHelper(query,_.contains(_))

  def simpleFileRegex(query: String) =
    fileMatchingHelper(query, _.matches(_))

//  3) more concise way:
  //  new helper and above three searching functions without query parameter

  def NewFileMatchingHelper(newMatcher:(String) => Boolean)=
    for(file <- filesHere; if newMatcher(file.getName))
     yield file

  def NewSimpleFilesEnding(query: String) =
    NewFileMatchingHelper(_.endsWith(query))

  def NewSimpleFilesContaining(query: String) =
    NewFileMatchingHelper(_.contains(query))

  def NewSimpleFileRegex(query: String) =
    NewFileMatchingHelper(_.matches(query))




}

