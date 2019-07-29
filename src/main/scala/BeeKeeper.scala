import akka.actor.{Actor, ActorRef}

class BeeKeeper(val workplace: ActorRef) extends Actor{
  def receive:PartialFunction[Any, Unit] = {
    case _ => println("undefined")
  }
}
