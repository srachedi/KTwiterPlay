
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
object comments extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Post,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(member : String,post : Post):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""
"""),_display_(Seq[Any](/*2.2*/for(com <- post.getComments) yield /*2.30*/{_display_(Seq[Any](format.raw/*2.31*/(""" 	
 	<li class="list-group-item col-md-offset-1">
		<div class="comment-row">
			<input type="hidden" id="comment-id" value=""""),_display_(Seq[Any](/*5.49*/com/*5.52*/.getId)),format.raw/*5.58*/(""""/>
			<div class="col-md-1">
				<img src=""""),_display_(Seq[Any](/*7.16*/routes/*7.22*/.Assets.at("img/avatar.png"))),format.raw/*7.50*/("""" class="img-circle img-responsive" alt="" />
			</div>
			<div>
				<div>
					By : 
					<a href="#" class="autor-login">
						<b>"""),_display_(Seq[Any](/*13.11*/com/*13.14*/.getAutor.getLogin)),format.raw/*13.32*/("""</b>
					</a>
				</div>
				<div class="comment-text">
					"""),_display_(Seq[Any](/*17.7*/com/*17.10*/.getContent)),format.raw/*17.21*/("""
				</div>
				<div class="action col-md-offset-1">
					<button type="button" class="btn btn-primary btn-xs cmt-like" title="Like">
						"""),_display_(Seq[Any](/*21.8*/if(Likes.isLikedComment(com, Member.getMember(session().get("Connected"))))/*21.83*/{_display_(Seq[Any](format.raw/*21.84*/("""
						<span class="glyphicon glyphicon-thumbs-down"></span>
						""")))}/*23.8*/else/*23.12*/{_display_(Seq[Any](format.raw/*23.13*/("""
						<span class="glyphicon glyphicon-thumbs-up"></span>
						""")))})),format.raw/*25.8*/("""
                    </button>
                    |
					<button type="button" class="btn btn-primary btn-xs">
						<span class="glyphicon">"""),_display_(Seq[Any](/*29.32*/com/*29.35*/.getLikes.size)),format.raw/*29.49*/(""" Likes</span>
					</button>
					"""),_display_(Seq[Any](/*31.7*/if(com.getAutor.getLogin==member)/*31.40*/{_display_(Seq[Any](format.raw/*31.41*/("""
					| 
						<button type="button" class="btn btn-danger btn-xs cmt-delete" title="Delete">
							<span class="glyphicon glyphicon-trash"></span>
	                    </button>
                    """)))})),format.raw/*36.22*/("""
					<span class="mic-info pull-right btn-xs">
						In: <a href="#">Montpellier</a> on : """),_display_(Seq[Any](/*38.45*/com/*38.48*/.getCommentDate.format("MMMM dd"))),format.raw/*38.81*/(""" at : """),_display_(Seq[Any](/*38.88*/com/*38.91*/.getCommentDate.format("hh:mm"))),format.raw/*38.122*/("""
					</span>
				</div>
			</div>
		</div>
	</li>
""")))})),format.raw/*44.2*/("""
"""),_display_(Seq[Any](/*45.2*/if(post.getComments.size>3)/*45.29*/{_display_(Seq[Any](format.raw/*45.30*/("""	
	<div class="col-md-offset-1">
		<a href="#" class="btn btn-sx btn-block" role="button">
			<span class="glyphicon glyphicon-refresh"></span> More
		</a>
	</div>
""")))})),format.raw/*51.2*/("""	"""))}
    }
    
    def render(member:String,post:Post): play.api.templates.HtmlFormat.Appendable = apply(member,post)
    
    def f:((String,Post) => play.api.templates.HtmlFormat.Appendable) = (member,post) => apply(member,post)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/comments.scala.html
                    HASH: 3ebe0c9702f00875a8b83cc02e5fb260c3f4c9d5
                    MATRIX: 782->1|905->30|941->32|984->60|1022->61|1183->187|1194->190|1221->196|1301->241|1315->247|1364->275|1534->409|1546->412|1586->430|1684->493|1696->496|1729->507|1905->648|1989->723|2028->724|2114->792|2127->796|2166->797|2263->863|2442->1006|2454->1009|2490->1023|2560->1058|2602->1091|2641->1092|2874->1293|3002->1385|3014->1388|3069->1421|3112->1428|3124->1431|3178->1462|3261->1514|3298->1516|3334->1543|3373->1544|3569->1709
                    LINES: 26->1|29->1|30->2|30->2|30->2|33->5|33->5|33->5|35->7|35->7|35->7|41->13|41->13|41->13|45->17|45->17|45->17|49->21|49->21|49->21|51->23|51->23|51->23|53->25|57->29|57->29|57->29|59->31|59->31|59->31|64->36|66->38|66->38|66->38|66->38|66->38|66->38|72->44|73->45|73->45|73->45|79->51
                    -- GENERATED --
                */
            