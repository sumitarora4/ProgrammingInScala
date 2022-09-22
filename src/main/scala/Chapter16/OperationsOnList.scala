package Chapter16

object OperationsOnList {

  def main(args: Array[String]): Unit = {

    var patientIdOpt = Some("patient 0")
    if(patientIdOpt.isDefined){
      val patientId = patientIdOpt.get
      patientIdOpt = Some(s"$patientId is cured")
    }
    println( patientIdOpt.contains("patient 0 is cured"))
  }
}
