import akka.actor.{Actor, ActorSystem, Props}

object BeeStack{
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("BeeStack")

    val sk = system.actorOf(Props[LegislativeArea], "Slovakia")
    sk ! RegulationChanged("MaxHivesPerBeeKeeper", "2", "")
    sk ! RegulationChanged("MaxHivesPerBeeKeeper", "3", "")
    system.terminate()
  }
}
