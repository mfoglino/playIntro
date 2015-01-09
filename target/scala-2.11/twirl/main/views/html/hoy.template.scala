
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object hoy extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fecha: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<h2>
Hoy es: """),_display_(/*4.10*/fecha),format.raw/*4.15*/("""
"""),format.raw/*5.1*/("""</h2>

"""))}
  }

  def render(fecha:String): play.twirl.api.HtmlFormat.Appendable = apply(fecha)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (fecha) => apply(fecha)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jan 09 11:15:59 ART 2015
                  SOURCE: /home/marcos/workspace/playIntro/app/views/hoy.scala.html
                  HASH: e22e08442b53b9f483942a5d3e759177908ad976
                  MATRIX: 721->1|824->16|852->18|892->32|917->37|944->38
                  LINES: 26->1|29->1|31->3|32->4|32->4|33->5
                  -- GENERATED --
              */
          