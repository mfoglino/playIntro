// @SOURCE:/home/marcos/workspace/playIntro/conf/routes
// @HASH:60a68bf854289cf54eb11068d979f646c58bd5f4
// @DATE:Thu Jan 08 16:42:44 ART 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:18
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:18
class ReverseAssets {


// @LINE:18
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:12
// @LINE:11
class ReverseArticulos {


// @LINE:12
def getArticulos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "articulos")
}
                        

// @LINE:11
def getArticulo(codigo:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "articulos/" + implicitly[PathBindable[Integer]].unbind("codigo", codigo))
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:14
class ReverseWeatherApi {


// @LINE:14
def aTimeDemandingService(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aTimeDemandingService")
}
                        

}
                          

// @LINE:9
class ReverseHelloWorld {


// @LINE:9
def hoy(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "hoy")
}
                        

}
                          
}
                  


// @LINE:18
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:18
class ReverseAssets {


// @LINE:18
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:12
// @LINE:11
class ReverseArticulos {


// @LINE:12
def getArticulos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Articulos.getArticulos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articulos"})
      }
   """
)
                        

// @LINE:11
def getArticulo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Articulos.getArticulo",
   """
      function(codigo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articulos/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("codigo", codigo)})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:14
class ReverseWeatherApi {


// @LINE:14
def aTimeDemandingService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WeatherApi.aTimeDemandingService",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aTimeDemandingService"})
      }
   """
)
                        

}
              

// @LINE:9
class ReverseHelloWorld {


// @LINE:9
def hoy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HelloWorld.hoy",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hoy"})
      }
   """
)
                        

}
              
}
        


// @LINE:18
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:18
class ReverseAssets {


// @LINE:18
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:12
// @LINE:11
class ReverseArticulos {


// @LINE:12
def getArticulos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Articulos.getArticulos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Articulos", "getArticulos", Seq(), "GET", """""", _prefix + """articulos""")
)
                      

// @LINE:11
def getArticulo(codigo:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Articulos.getArticulo(codigo), HandlerDef(this.getClass.getClassLoader, "", "controllers.Articulos", "getArticulo", Seq(classOf[Integer]), "GET", """""", _prefix + """articulos/$codigo<[^/]+>""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:14
class ReverseWeatherApi {


// @LINE:14
def aTimeDemandingService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WeatherApi.aTimeDemandingService(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WeatherApi", "aTimeDemandingService", Seq(), "GET", """""", _prefix + """aTimeDemandingService""")
)
                      

}
                          

// @LINE:9
class ReverseHelloWorld {


// @LINE:9
def hoy(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HelloWorld.hoy(), HandlerDef(this.getClass.getClassLoader, "", "controllers.HelloWorld", "hoy", Seq(), "GET", """""", _prefix + """hoy""")
)
                      

}
                          
}
        
    