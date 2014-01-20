
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
object admin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Member],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(members: List[Member]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.25*/("""
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*2.46*/routes/*2.52*/.Assets.at("css/admin.css"))),format.raw/*2.79*/("""">
<script src=""""),_display_(Seq[Any](/*3.15*/routes/*3.21*/.Assets.at("js/admin.js"))),format.raw/*3.46*/("""" type="text/javascript"></script>

<div class="container">
	<div class="well col-md-8">
        """),_display_(Seq[Any](/*7.10*/for((member, i) <- members.zipWithIndex) yield /*7.50*/ {_display_(Seq[Any](format.raw/*7.52*/("""
        <div class="row user-row">
            <div class="col-md-1">
                <img class="img-circle" src=""""),_display_(Seq[Any](/*10.47*/routes/*10.53*/.Assets.at("img/avatar.png"))),format.raw/*10.81*/("""" alt="User Pic">
            </div>
            <div class="col-md-10">
                <strong>"""),_display_(Seq[Any](/*13.26*/member/*13.32*/.getLogin)),format.raw/*13.41*/("""</strong><br>
                <span class="text-muted">User level: Administrator</span>
            </div>
            <div class="col-md-1 dropdown-user" data-for="."""),_display_(Seq[Any](/*16.61*/member/*16.67*/.getLogin)),format.raw/*16.76*/("""">
                <i class="glyphicon glyphicon-chevron-down text-muted"></i>
            </div>
        </div>
        <div class="row user-infos """),_display_(Seq[Any](/*20.37*/member/*20.43*/.getLogin)),format.raw/*20.52*/("""">
            <div class="col-md-10 col-md-offset-1">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">User information</h3>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-3 hidden-sm">
                                <img class="img-circle" src=""""),_display_(Seq[Any](/*29.63*/routes/*29.69*/.Assets.at("img/avatar.png"))),format.raw/*29.97*/("""" alt="User Pic">
                            </div>
                            <div class=" col-md-9 hidden-sm">
                                <strong>"""),_display_(Seq[Any](/*32.42*/member/*32.48*/.getLogin)),format.raw/*32.57*/("""</strong><br>
                                <table class="table table-user-information">
                                    <tbody>
                                    <tr>
                                        <td>User level:</td>
                                        <td>Administrator</td>
                                    </tr>
                                    <tr>
                                        <td>Registered since:</td>
                                        <td>11/12/2013</td>
                                    </tr>
                                    <tr>
                                        <td>Email : </td>
                                        <td>"""),_display_(Seq[Any](/*45.46*/member/*45.52*/.getEmail)),format.raw/*45.61*/("""</td>
                                    </tr>
                                    <tr>
                                        <td>Warnings</td>
                                        <td>0</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="panel-footer">
                        <button class="btn btn-sm btn-primary" type="button" data-toggle="tooltip" data-original-title="Send message to user">
                                <i class="glyphicon glyphicon-envelope"></i>
                        </button>
                        <span class="pull-right">
	                        <button class="btn btn-sm btn-warning" type="button"
	                                    data-toggle="tooltip"
	                                    data-original-title="Edit this member">
	                                    <i class="glyphicon glyphicon-edit"></i>
	                        </button>
	                        <button class="btn btn-sm btn-danger mbr-delete" type="button"
	                                    data-toggle="tooltip"
	                                    data-original-title="Remove this member">
	                                    <i class="glyphicon glyphicon-remove"></i>
	                        </button>
                        </span>
                    </div>
                </div>
            </div>
        </div> 
        """)))})),format.raw/*76.10*/("""       
    </div>
</div>
        
"""))}
    }
    
    def render(members:List[Member]): play.api.templates.HtmlFormat.Appendable = apply(members)
    
    def f:((List[Member]) => play.api.templates.HtmlFormat.Appendable) = (members) => apply(members)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/admin.scala.html
                    HASH: b1afc58ff9ca877058d93e6e072e9904784fd452
                    MATRIX: 780->1|897->24|978->70|992->76|1040->103|1092->120|1106->126|1152->151|1285->249|1340->289|1379->291|1532->408|1547->414|1597->442|1731->540|1746->546|1777->555|1980->722|1995->728|2026->737|2211->886|2226->892|2257->901|2753->1361|2768->1367|2818->1395|3010->1551|3025->1557|3056->1566|3788->2262|3803->2268|3834->2277|5430->3841
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|35->7|35->7|35->7|38->10|38->10|38->10|41->13|41->13|41->13|44->16|44->16|44->16|48->20|48->20|48->20|57->29|57->29|57->29|60->32|60->32|60->32|73->45|73->45|73->45|104->76
                    -- GENERATED --
                */
            