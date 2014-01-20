
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Member,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(member : String, autor : Member):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""
<br>
<div class="panel panel-primary container col-md-12">
	<div class="row panel-heading well well-lg ">
		<div>
			<h3>Detail profile</h3>
		</div>
	</div>
  	<div class="row panel-body">
  		<div>
		    <img src="""),_display_(Seq[Any](/*11.17*/routes/*11.23*/.Assets.at("img/avatar.png"))),format.raw/*11.51*/(""" class="img-circle"/>
        </div>
  		<div class="col-md-offset-2">
			<strong>"""),_display_(Seq[Any](/*14.13*/autor/*14.18*/.getLogin)),format.raw/*14.27*/("""</strong><br>
			<table class="table">
				<tbody>
					<tr>
						<td>Role:</td>
						<td>"""),_display_(Seq[Any](/*19.12*/autor/*19.17*/.getProfile.getRole)),format.raw/*19.36*/("""</td>
					</tr>
					<tr>
						<td>Nom:</td>
						<td>"""),_display_(Seq[Any](/*23.12*/autor/*23.17*/.getProfile.getNom)),format.raw/*23.35*/("""</td>
					</tr>
					<tr>
						<td>Prenom :</td>
						<td>"""),_display_(Seq[Any](/*27.12*/autor/*27.17*/.getProfile.getPrenom)),format.raw/*27.38*/("""</td>
					</tr>
					<tr>
						<td>Date de naissance:</td>
						<td>"""),_display_(Seq[Any](/*31.12*/if(autor.getProfile.getDateNaissance!=null)/*31.55*/{_display_(Seq[Any](_display_(Seq[Any](/*31.57*/autor/*31.62*/.getProfile.getDateNaissance.format("dd MMMM yyyy")))))})),format.raw/*31.114*/("""</td>
					</tr>
					<tr>
						<td>Sexe:</td>
						<td>"""),_display_(Seq[Any](/*35.12*/autor/*35.17*/.getProfile.getSexe)),format.raw/*35.36*/("""</td>
					</tr>	
					<tr>
						<td>Ville:</td>
						<td>Montpellier</td>
					</tr>					
																								
					<tr>
						<td>Registered since:</td>
						<td>"""),_display_(Seq[Any](/*44.12*/autor/*44.17*/.getProfile.getDateInscription)),format.raw/*44.47*/("""</td>
					</tr>
					<tr>
						<td>Email : </td>
						<td>"""),_display_(Seq[Any](/*48.12*/autor/*48.17*/.getEmail)),format.raw/*48.26*/("""</td>
					</tr>
					<tr>
						<td>Nombre de posts : </td>
						<td><span class="badge">"""),_display_(Seq[Any](/*52.32*/autor/*52.37*/.getPosts.size)),format.raw/*52.51*/("""</span></td>
					</tr>
					<tr>
						<td>Nombre de commentaires : </td>
						<td><span class="badge">"""),_display_(Seq[Any](/*56.32*/autor/*56.37*/.getComments.size)),format.raw/*56.54*/("""</span></td>
					</tr>
				</tbody>
			</table>
		</div>  
  	</div>
  	<div class="row panel-footer">
		"""),_display_(Seq[Any](/*63.4*/if(member!=autor.getLogin)/*63.30*/{_display_(Seq[Any](format.raw/*63.31*/("""
		<button class="btn btn-sm btn-primary btn-message-modal" type="button" data-toggle="modal" data-target="#myModal" data-original-title="Send message to user">
			<i class="glyphicon glyphicon-envelope"></i>
		</button>
		""")))})),format.raw/*67.4*/("""
		<span class="pull-right">
			"""),_display_(Seq[Any](/*69.5*/if(member==autor.getLogin)/*69.31*/{_display_(Seq[Any](format.raw/*69.32*/("""
			<button class="btn btn-sm btn-warning btn-edit-profile" type="button" data-toggle="tooltip" data-original-title="Edit this member">
				<i class="glyphicon glyphicon-edit"></i>
			</button>
			""")))})),format.raw/*73.5*/("""
		</span>
  	</div>
</div>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
       	<div class="form-group">
    		<label for="msg-title">To : <span>"""),_display_(Seq[Any](/*85.42*/autor/*85.47*/.getLogin)),format.raw/*85.56*/("""</span></label>
    		<input type="hidden" class="form-control" id="msg-destinataire" value=""""),_display_(Seq[Any](/*86.79*/autor/*86.84*/.getLogin)),format.raw/*86.93*/(""""/>
    		<input type="text" class="form-control" id="msg-title" placeholder="Title... ">
  		</div>
      </div>
      <div class="modal-body">
        <textarea id="msg-content" class="form-control" rows="5" placeholder="Your message..."></textarea>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
        <button type="button" class="btn btn-primary btn-send-message">Send</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

"""))}
    }
    
    def render(member:String,autor:Member): play.api.templates.HtmlFormat.Appendable = apply(member,autor)
    
    def f:((String,Member) => play.api.templates.HtmlFormat.Appendable) = (member,autor) => apply(member,autor)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/profile.scala.html
                    HASH: 70fde8f28a24a80f19e363a77bea0656e53f092f
                    MATRIX: 783->1|910->34|1163->251|1178->257|1228->285|1347->368|1361->373|1392->382|1521->475|1535->480|1576->499|1670->557|1684->562|1724->580|1822->642|1836->647|1879->668|1987->740|2039->783|2087->785|2101->790|2180->842|2275->901|2289->906|2330->925|2538->1097|2552->1102|2604->1132|2702->1194|2716->1199|2747->1208|2875->1300|2889->1305|2925->1319|3067->1425|3081->1430|3120->1447|3262->1554|3297->1580|3336->1581|3591->1805|3659->1838|3694->1864|3733->1865|3962->2063|4427->2492|4441->2497|4472->2506|4602->2600|4616->2605|4647->2614
                    LINES: 26->1|29->1|39->11|39->11|39->11|42->14|42->14|42->14|47->19|47->19|47->19|51->23|51->23|51->23|55->27|55->27|55->27|59->31|59->31|59->31|59->31|59->31|63->35|63->35|63->35|72->44|72->44|72->44|76->48|76->48|76->48|80->52|80->52|80->52|84->56|84->56|84->56|91->63|91->63|91->63|95->67|97->69|97->69|97->69|101->73|113->85|113->85|113->85|114->86|114->86|114->86
                    -- GENERATED --
                */
            