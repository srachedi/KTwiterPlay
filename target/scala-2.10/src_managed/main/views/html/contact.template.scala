
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
object contact extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<br><br><br><br><br>
<div class="offset4 span4">
	<address>
		<strong>Ramtane HIDJA</strong><br>
		<abbr title="Phone">P:</abbr> (33) 622-994-726<br>
		<a href="mailto:#">rhidja@gmail.com</a>
	</address>
	<br>
	
	<address>
		<strong>Said RACHEDI</strong><br>
		<abbr title="Phone">P:</abbr> (33) 668-969-885<br>
		<a href="mailto:#">said.rachedi87@gmail.com</a>
	</address>
	<br>
	
	<address>
		<strong>Takfarines SIDER</strong><br>
		<abbr title="Phone">P:</abbr> (33) 635-444-276<br>
		<a href="mailto:#">takfarines.sider@gmail.com</a>
	</address>
	<br>		
</div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/contact.scala.html
                    HASH: 4a35cb53039bd2af7693365dc48a3ae2688c8ed7
                    MATRIX: 857->0
                    LINES: 29->1
                    -- GENERATED --
                */
            