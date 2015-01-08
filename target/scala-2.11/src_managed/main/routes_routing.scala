// @SOURCE:/home/marcos/workspace/playIntro/conf/routes
// @HASH:60a68bf854289cf54eb11068d979f646c58bd5f4
// @DATE:Thu Jan 08 16:42:44 ART 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_HelloWorld_hoy1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("hoy"))))
private[this] lazy val controllers_HelloWorld_hoy1_invoker = createInvoker(
controllers.HelloWorld.hoy(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.HelloWorld", "hoy", Nil,"GET", """""", Routes.prefix + """hoy"""))
        

// @LINE:11
private[this] lazy val controllers_Articulos_getArticulo2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articulos/"),DynamicPart("codigo", """[^/]+""",true))))
private[this] lazy val controllers_Articulos_getArticulo2_invoker = createInvoker(
controllers.Articulos.getArticulo(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Articulos", "getArticulo", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """articulos/$codigo<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_Articulos_getArticulos3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articulos"))))
private[this] lazy val controllers_Articulos_getArticulos3_invoker = createInvoker(
controllers.Articulos.getArticulos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Articulos", "getArticulos", Nil,"GET", """""", Routes.prefix + """articulos"""))
        

// @LINE:14
private[this] lazy val controllers_WeatherApi_aTimeDemandingService4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aTimeDemandingService"))))
private[this] lazy val controllers_WeatherApi_aTimeDemandingService4_invoker = createInvoker(
controllers.WeatherApi.aTimeDemandingService(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WeatherApi", "aTimeDemandingService", Nil,"GET", """""", Routes.prefix + """aTimeDemandingService"""))
        

// @LINE:18
private[this] lazy val controllers_Assets_at5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """hoy""","""controllers.HelloWorld.hoy()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articulos/$codigo<[^/]+>""","""controllers.Articulos.getArticulo(codigo:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articulos""","""controllers.Articulos.getArticulos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aTimeDemandingService""","""controllers.WeatherApi.aTimeDemandingService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:9
case controllers_HelloWorld_hoy1_route(params) => {
   call { 
        controllers_HelloWorld_hoy1_invoker.call(controllers.HelloWorld.hoy())
   }
}
        

// @LINE:11
case controllers_Articulos_getArticulo2_route(params) => {
   call(params.fromPath[Integer]("codigo", None)) { (codigo) =>
        controllers_Articulos_getArticulo2_invoker.call(controllers.Articulos.getArticulo(codigo))
   }
}
        

// @LINE:12
case controllers_Articulos_getArticulos3_route(params) => {
   call { 
        controllers_Articulos_getArticulos3_invoker.call(controllers.Articulos.getArticulos())
   }
}
        

// @LINE:14
case controllers_WeatherApi_aTimeDemandingService4_route(params) => {
   call { 
        controllers_WeatherApi_aTimeDemandingService4_invoker.call(controllers.WeatherApi.aTimeDemandingService())
   }
}
        

// @LINE:18
case controllers_Assets_at5_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     