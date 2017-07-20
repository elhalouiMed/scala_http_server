name := """openPort"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
//libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
libraryDependencies += "org.scalaj" % "scalaj-http_2.11" % "2.3.0"
libraryDependencies += "com.typesafe.akka" %% "akka-http-core" % "2.4.9"
libraryDependencies += "com.typesafe.akka" %% "akka-http-experimental" % "2.4.9"
// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"



fork in run := true