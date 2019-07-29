import akka.actor.Actor

class LegislativeArea extends Actor{
  var legislative:scala.collection.mutable.Map[String, String] = scala.collection.mutable.Map()
  override def receive:PartialFunction[Any, Unit] = {
    case RegulationChanged(regulations, value, _) =>
      legislative += (regulations -> value)

  }
}

case class RegulationChanged (regulations: String, newVal: String, descript: String)
