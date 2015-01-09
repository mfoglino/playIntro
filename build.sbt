name := """playIntro"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaWs,  
  javaJdbc,
  javaJpa,    
  "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
  "org.projectlombok" % "lombok" % "1.14.8",
  "org.springframework" % "spring-core" % "4.1.4.RELEASE"
)
