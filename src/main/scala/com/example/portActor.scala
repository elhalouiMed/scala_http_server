
package bSuccess.bconnect.port

import akka.http.scaladsl._
import akka.http.scaladsl.model.ws.{Message, TextMessage}
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.{ HttpResponse, Uri, HttpRequest,StatusCode }
import akka.stream._
import scala.concurrent.Await
import akka.http.scaladsl.model._
import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import scala.concurrent.duration._



case class PortActor(port : Int , url : String , html : String) {
  implicit val system2 = ActorSystem()
         implicit val materializer = ActorMaterializer()


        def route =
		    path(url) {
		       complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, 
		          html))
		    }
		  //val binding = Http().bindAndHandle(route, "0.0.0.0", 6521)
		  val binding =  Await.result(Http().bindAndHandle(route, "0.0.0.0", port), 3600.seconds)
		  println("Port "+port+" open")

    
}
