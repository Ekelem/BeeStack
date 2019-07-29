import akka.actor.{Actor, ActorRef}

class BeeHive(val place:ActorRef) extends Actor{
  def receive:PartialFunction[Any, Unit] = {
    case _ => println("undefined")
    case "start" => println("simulation started")
      place ! "error"
  }
}
