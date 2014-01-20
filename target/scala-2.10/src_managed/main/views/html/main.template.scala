
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("css/bootstrap.css"))),format.raw/*8.91*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.48*/routes/*9.54*/.Assets.at("css/main.css"))),format.raw/*9.80*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("img/berbere.gif"))),format.raw/*10.94*/("""">
    </head>
    <body class="well">
		<div class="container">
			"""),_display_(Seq[Any](/*14.5*/content)),format.raw/*14.12*/("""
		</div>
	    <script src=""""),_display_(Seq[Any](/*16.20*/routes/*16.26*/.Assets.at("js/jquery-1.9.0.min.js"))),format.raw/*16.62*/("""" type="text/javascript"></script>
	    <script src=""""),_display_(Seq[Any](/*17.20*/routes/*17.26*/.Assets.at("js/jquery-ui-1.10.3.js"))),format.raw/*17.62*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("js/bootstrap.js"))),format.raw/*18.58*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("js/script.js"))),format.raw/*19.55*/("""" type="text/javascript"></script>
    	
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:12 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/main.scala.html
                    HASH: eda6015f7eb552a95c26b29818fcb4e5ec4cd909
                    MATRIX: 778->1|902->31|990->84|1016->89|1113->151|1127->157|1179->188|1264->238|1278->244|1325->270|1422->331|1437->337|1488->366|1592->435|1621->442|1686->471|1701->477|1759->513|1849->567|1864->573|1922->609|2015->666|2030->672|2081->701|2174->758|2189->764|2237->790
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19
                    -- GENERATED --
                */
            