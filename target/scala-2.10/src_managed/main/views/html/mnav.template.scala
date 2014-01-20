
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
object mnav extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<ul class="nav navbar-nav navbar-right">
	<li>
		<a href="#" class="btn-all">All</a>
	</li>
	<li>
		<a href="#" class="btn-wall">Wall</a>
	</li>

	<li>
		<a href="#" class="btn-messages"><span class="glyphicon glyphicon-envelope"></span> Inbox</a>
	</li>	
	                
	<li class="dropdown">
		<a href="#" class="dropdown-toggle" data-toggle="dropdown">
			<span class="glyphicon glyphicon-user"></span><b class="caret"></b>
		</a>
		<ul class="dropdown-menu">
			<li>
				<a href="#" class="signup_frm">
					<span class="glyphicon glyphicon-cog"></span> Settings
				</a>
			</li>
			<li>
				<a href="#" class="view-profile">
					<span class="glyphicon glyphicon-user"></span> Profile
				</a>
			</li>
			<li class="divider"></li>
			<li class="active">
				<a href="#" class="btn-logout">
					<span class="glyphicon glyphicon-log-out"></span> Log out
				</a>
			</li>
		</ul>
	</li>
</ul>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/mnav.scala.html
                    HASH: a0105936ef0fc4fc7ef206f69f4312e16acf54ae
                    MATRIX: 854->0
                    LINES: 29->1
                    -- GENERATED --
                */
            