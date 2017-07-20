package com.example

import bSuccess.bconnect.port._
import akka.http.scaladsl._
import akka.http.scaladsl.model.ws.{Message, TextMessage}
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.{ HttpResponse, Uri, HttpRequest,StatusCode }
import akka.stream._
import scala.concurrent.Await
import akka.http.scaladsl.model._
import akka.actor.{Actor, ActorRef, ActorSystem, Props}


object Hello {
  def main(args: Array[String]): Unit = {


var html : String = "<h3><strong>Akka http example</strong></h3>"+
              "<h4> simple HTTP server </h4>"+
              "<p>@author : <strong>ELHALOUI Mohammed</strong></p>"

    PortActor(6521,"about",html)
  }
}
