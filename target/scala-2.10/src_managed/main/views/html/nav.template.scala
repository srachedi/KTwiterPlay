
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
object nav extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<ul class="nav navbar-nav navbar-right">
	<li class="dropdown">
		<a href="#" class="dropdown-toggle" data-toggle="dropdown">
			<span class="glyphicon glyphicon-user"></span>Member <b class="caret"></b>
		</a>
		<ul class="dropdown-menu">
			<li><a href="#" class="signin_frm"><span class="glyphicon glyphicon-log-in"></span>  Signin</a></li>
			<li><a href="#" class="signup_frm"><span class="glyphicon glyphicon-log-in"></span>  Signup</a></li>
			<li class="divider"></li>
			<li><a href="#" class="btn-admin"><span class="glyphicon glyphicon-user"></span> Admin</a></li>
		</ul>
	</li>
</ul>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/nav.scala.html
                    HASH: 6507e36f27ff64a6d7ee6c7b5fae2f8baa259db7
                    MATRIX: 853->0
                    LINES: 29->1
                    -- GENERATED --
                */
            