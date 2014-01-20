
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
object signin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<br><br><br>
<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-2">
			<div class="panel panel-primary">
				<div class="panel-header">
					<h3 class="text-center"> Please SIGN IN </h3>
				</div>
				<div class="panel-body">
                    <form class="form form-signup" role="form">
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                            <input type="text" class="form-control"  id="ipt_login" placeholder="Login" required autofocus/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                            <input type="password" class="form-control" id="ipt_password" placeholder="Password" required/>
                        </div>
                    </div>                   
                </div>
                <a href="#" class="btn btn-sm btn-primary btn-block signin_frm" role="button"> SIGN IN </a> 
				</form>
            </div>
        </div>
    </div>
</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/signin.scala.html
                    HASH: 8080c34f272148980313328c0a4ed74f5d66f85c
                    MATRIX: 856->0
                    LINES: 29->1
                    -- GENERATED --
                */
            