
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Post],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(member : String, lposts:List[Post]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.38*/("""

"""),_display_(Seq[Any](/*3.2*/main("KTwiter")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
	<header class="row"> 
		"""),_display_(Seq[Any](/*5.4*/header(member))),format.raw/*5.18*/("""
	</header>
	<nav class="row">
		"""),_display_(Seq[Any](/*8.4*/if(member!=null)/*8.20*/{_display_(Seq[Any](format.raw/*8.21*/("""
		<form class="form form-signup" role="form">
			<div class="form-group">
				<div class="input-group col-md-8 col-md-offset-2">
					<input type="text" class="form-control"  id="ipt-post" placeholder="What's on your mind?" autofocus/>
					<a href="#" class="input-group-addon btn btn-sm btn-primary btn-block btn-post-submit" role="button">Post !</a>
				</div>
			</div>
		</form>
		""")))})),format.raw/*17.4*/("""
	</nav>
	<section class="row">
		<article id="article" class="container col-md-8 col-md-offset-2">
			"""),_display_(Seq[Any](/*21.5*/if(member==null)/*21.21*/{_display_(Seq[Any](format.raw/*21.22*/("""
				"""),_display_(Seq[Any](/*22.6*/signin())),format.raw/*22.14*/("""
			""")))}/*23.5*/else/*23.9*/{_display_(Seq[Any](format.raw/*23.10*/("""
				"""),_display_(Seq[Any](/*24.6*/posts(member,lposts))),format.raw/*24.26*/("""
			""")))})),format.raw/*25.5*/("""	
		</article>
	</section>
	<footer class="row">
	</footer>
""")))})),format.raw/*30.2*/("""
"""))}
    }
    
    def render(member:String,lposts:List[Post]): play.api.templates.HtmlFormat.Appendable = apply(member,lposts)
    
    def f:((String,List[Post]) => play.api.templates.HtmlFormat.Appendable) = (member,lposts) => apply(member,lposts)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/index.scala.html
                    HASH: f2db429b2aae2316598e250f077d8590e7c0d048
                    MATRIX: 785->1|915->37|952->40|975->55|1014->57|1075->84|1110->98|1178->132|1202->148|1240->149|1659->537|1798->641|1823->657|1862->658|1903->664|1933->672|1956->677|1968->681|2007->682|2048->688|2090->708|2126->713|2218->774
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|36->8|36->8|36->8|45->17|49->21|49->21|49->21|50->22|50->22|51->23|51->23|51->23|52->24|52->24|53->25|58->30
                    -- GENERATED --
                */
            