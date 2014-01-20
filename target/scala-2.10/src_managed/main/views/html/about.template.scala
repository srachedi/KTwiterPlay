
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
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
object about extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<br><br><br><br><br><br>

<div class="offset3 span4">
	<h3>KTwiter</h3><br>
	<b>KTwiter</b> veut dire <b>"Kabyle Twitter"</b> est un projet realise par 3 etudiants du 
	master 2 Informattique Pour les Sciences.
	<ul>
    	<li>Mr. HIDJA Ramtane</li>
    	<li>Mr. Rachedi Said</li>
    	<li>Mr. Sidder Takfarinas</li>
    </ul>
    avec le framework <b>PLAY</b>
</div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/about.scala.html
                    HASH: 230b565d0b2178287058bdb2bcaacbcee25a933a
                    MATRIX: 855->0
                    LINES: 29->1
                    -- GENERATED --
                */
            