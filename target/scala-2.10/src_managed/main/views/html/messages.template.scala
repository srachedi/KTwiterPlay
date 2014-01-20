
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
object messages extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Message],List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(received_msgs : List[Message],sent_msgs : List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*2.46*/routes/*2.52*/.Assets.at("css/messages.css"))),format.raw/*2.82*/("""">

<div class="col-md-12">
	<div class="panel panel-primary">
		<div class="panel-heading">
			<span class="glyphicon glyphicon-list"></span>Messages Lists
			<div class="pull-right action-buttons">
				<div class="btn-group pull-right">
					<button type="button"
						class="btn btn-default btn-xs dropdown-toggle"
						data-toggle="dropdown">
						<span class="glyphicon glyphicon-cog" style="margin-right: 0px;"></span>
					</button>
					<ul class="dropdown-menu slidedown">
						<li><a href="#" class="btn-delete-messages"><span class="glyphicon glyphicon-trash"></span>Delete</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="panel-body">
			<ul class="list-group">
				"""),_display_(Seq[Any](/*23.6*/for((message, i) <- received_msgs.zipWithIndex) yield /*23.53*/ {_display_(Seq[Any](format.raw/*23.55*/("""
				<li class="list-group-item">
					<div class="checkbox">
						<input type="checkbox" />
						<input type="hidden" class="form-control" id="msg-id" value=""""),_display_(Seq[Any](/*27.69*/message/*27.76*/.getId)),format.raw/*27.82*/(""""/> 
						<label data-toggle="modal" data-target="#myModal-"""),_display_(Seq[Any](/*28.57*/message/*28.64*/.getId)),format.raw/*28.70*/(""""> By : """),_display_(Seq[Any](/*28.79*/message/*28.86*/.getExpediteur.getLogin)),format.raw/*28.109*/(""" | """),_display_(Seq[Any](/*28.113*/message/*28.120*/.getTitle)),format.raw/*28.129*/(""" </label>
					</div>
					<div class="pull-right action-buttons">
						<a href="#" data-toggle="modal" data-target="#myModal-"""),_display_(Seq[Any](/*31.62*/message/*31.69*/.getId)),format.raw/*31.75*/(""""><span class="glyphicon glyphicon-pencil"></span></a> 
						<a href="#" class="trash btn-delete-message"><span class="glyphicon glyphicon-trash"></span></a>
					</div>
				</li>
				<!---  ********************   Modal Message    ************************************** -->
				
				<div class="modal fade" id="myModal-"""),_display_(Seq[Any](/*37.42*/message/*37.49*/.getId)),format.raw/*37.55*/("""" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel"> <span id="rsp-title">"""),_display_(Seq[Any](/*42.74*/message/*42.81*/.getTitle)),format.raw/*42.90*/("""</span></h4>
							</div>
							<div class="modal-body">
								<h4>From : <span id="rsp-destinataire">"""),_display_(Seq[Any](/*45.49*/message/*45.56*/.getExpediteur.getLogin)),format.raw/*45.79*/("""</span></h4>
								<p>"""),_display_(Seq[Any](/*46.13*/message/*46.20*/.getMessage)),format.raw/*46.31*/("""</p>
							</div>
							<div class="modal-body">
								<textarea id="rsp-content" class="form-control" rows="4" placeholder="Your ansewer..."></textarea>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
								<button type="button" class="btn btn-primary btn-ansewer-message" data-target="#myModal" data-toggle="modal">Ansewer</button>
							</div>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>
				<!-- /.modal fade -->
				
				""")))})),format.raw/*62.6*/("""
			</ul>
		</div>
		<div class="panel-footer">
			<div class="row">
				<div class="col-md-12">
					<h6>
						Total Count <span class="label label-info">25</span>
					</h6>
				</div>
				<div class="col-md-12">
					<ul class="pagination pagination-sm pull-right">
						<li class="disabled"><a href="javascript:void(0)">«</a></li>
						<li class="active"><a href="javascript:void(0)">1 <span
								class="sr-only">(current)</span></a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="javascript:void(0)">»</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
"""))}
    }
    
    def render(received_msgs:List[Message],sent_msgs:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(received_msgs,sent_msgs)
    
    def f:((List[Message],List[Message]) => play.api.templates.HtmlFormat.Appendable) = (received_msgs,sent_msgs) => apply(received_msgs,sent_msgs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/messages.scala.html
                    HASH: f1e1c7fc449db7533ef9e9b55029360cbc3a3539
                    MATRIX: 798->1|949->58|1030->104|1044->110|1095->140|1828->838|1891->885|1931->887|2129->1049|2145->1056|2173->1062|2270->1123|2286->1130|2314->1136|2359->1145|2375->1152|2421->1175|2462->1179|2479->1186|2511->1195|2675->1323|2691->1330|2719->1336|3076->1657|3092->1664|3120->1670|3511->2025|3527->2032|3558->2041|3701->2148|3717->2155|3762->2178|3823->2203|3839->2210|3872->2221|4480->2798
                    LINES: 26->1|29->1|30->2|30->2|30->2|51->23|51->23|51->23|55->27|55->27|55->27|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|59->31|59->31|59->31|65->37|65->37|65->37|70->42|70->42|70->42|73->45|73->45|73->45|74->46|74->46|74->46|90->62
                    -- GENERATED --
                */
            