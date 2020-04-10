name := """model"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.7"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += ehcache
libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.6"
libraryDependencies += jdbc
libraryDependencies += evolutions
libraryDependencies += "org.scalikejdbc" %% "scalikejdbc"  % "3.4.1"
libraryDependencies += "org.scalikejdbc" %% "scalikejdbc-config" % "3.4.1"
libraryDependencies += "org.scalikejdbc" %% "scalikejdbc-play-dbapi-adapter" % "2.6.0-scalikejdbc-3.0"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
libraryDependencies += "org.im4java" % "im4java" % "1.4.0"
libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.1"