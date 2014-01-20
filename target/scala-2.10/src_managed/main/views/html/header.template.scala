
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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(member : String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
<div class="container">
<div class="row">
	<h1>KTwiter</h1>
</div>

<div class="row">
    <nav class="navbar navbar-default" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span> 
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">
            	"""),_display_(Seq[Any](/*18.15*/if(member==null)/*18.31*/{_display_(Seq[Any](format.raw/*18.32*/("""
            		IPS Project
            	""")))}/*20.15*/else/*20.19*/{_display_(Seq[Any](format.raw/*20.20*/("""
            		Azul <span>"""),_display_(Seq[Any](/*21.27*/member)),format.raw/*21.33*/("""</span>!
            	""")))})),format.raw/*22.15*/("""
            </a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active">
                	<a href="#" class="btn-home"><span class="glyphicon glyphicon-home btn-home"></span>Home</a>
                </li>
                <li>
                	<a class="btn-about" href="#">About</a>
                </li>
                <li>
                	<a class="btn-contact" href="#">Contact</a>
                </li>
                <li class="dropdown">
                	<a href="#" class="dropdown-toggle" data-toggle="dropdown">
                		<span class="glyphicon glyphicon-search"></span>Search <b class="caret"></b>
                	</a>
                    <ul class="dropdown-menu" style="min-width: 300px;">
                        <li>
                            <div class="row">
                                <div class="col-md-12">
                                    <form class="frm-search navbar-form navbar-left" role="search">
                                    <div class="input-group">
                                        <input type="text" id="ipt-search" name="ipt-search" class="form-control" placeholder="Search" />
                                        <span class="input-group-btn">
                                            <button class="btn btn-primary btn-search" type="button"> Go!</button>
                                        </span>
                                    </div>
                                    </form>
                                </div>
                            </div>
                        </li>
                    </ul>
                </li>
            </ul>
            """),_display_(Seq[Any](/*59.14*/if(member==null)/*59.30*/{_display_(Seq[Any](format.raw/*59.31*/("""
            	"""),_display_(Seq[Any](/*60.15*/nav())),format.raw/*60.20*/("""
            """)))}/*61.14*/else/*61.18*/{_display_(Seq[Any](format.raw/*61.19*/("""
            	"""),_display_(Seq[Any](/*62.15*/mnav())),format.raw/*62.21*/("""
            """)))})),format.raw/*63.14*/("""
        </div>
        <!-- /.navbar-collapse -->
    </nav>
</div>
</div>
"""))}
    }
    
    def render(member:String): play.api.templates.HtmlFormat.Appendable = apply(member)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (member) => apply(member)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/header.scala.html
                    HASH: 7a610c5a98b7b0f1dba9f90e177826b2bab8f0a0
                    MATRIX: 775->1|886->18|1577->673|1602->689|1641->690|1701->731|1714->735|1753->736|1816->763|1844->769|1899->792|3779->2636|3804->2652|3843->2653|3894->2668|3921->2673|3954->2687|3967->2691|4006->2692|4057->2707|4085->2713|4131->2727
                    LINES: 26->1|29->1|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|50->22|87->59|87->59|87->59|88->60|88->60|89->61|89->61|89->61|90->62|90->62|91->63
                    -- GENERATED --
                */
            