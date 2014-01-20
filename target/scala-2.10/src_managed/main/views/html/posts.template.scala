
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
object posts extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Post],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(member : String,posts: List[Post]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*2.46*/routes/*2.52*/.Assets.at("css/post.css"))),format.raw/*2.78*/("""">

"""),_display_(Seq[Any](/*4.2*/for((post, i) <- posts.zipWithIndex) yield /*4.38*/ {_display_(Seq[Any](format.raw/*4.40*/("""
    <div class="row post">
        <div class="panel panel-default">
            <div class="panel-heading">
				<div class="row">
					<div class="col-md-1">
						<img src=""""),_display_(Seq[Any](/*10.18*/routes/*10.24*/.Assets.at("img/avatar.png"))),format.raw/*10.52*/("""" class="img-circle img-responsive" alt="" />
					</div>
					<div>
		                By :
		                <a href="#" class="autor-login">
		                	<b>"""),_display_(Seq[Any](/*15.24*/post/*15.28*/.getAutor.getLogin)),format.raw/*15.46*/("""</b>
		                </a>
		                <p> """),_display_(Seq[Any](/*17.24*/post/*17.28*/.getContent)),format.raw/*17.39*/("""</p>
					</div>
				</div>
				<div class="row action">
						<button type="button" class="btn btn-primary btn-xs col-md-offset-1 btn-comment" title="Comment">
							<span class="glyphicon glyphicon-comment"></span>
						</button>
						<button type="button" class="btn btn-primary btn-xs">
							<span class="glyphicon">"""),_display_(Seq[Any](/*25.33*/post/*25.37*/.getComments.size)),format.raw/*25.54*/("""</span>
						</button>						
						 | 
						<button type="button" class="btn btn-primary btn-xs pst-like" title="Like">
							"""),_display_(Seq[Any](/*29.9*/if(Likes.isLikedPost(post, Member.getMember(session().get("Connected"))))/*29.82*/{_display_(Seq[Any](format.raw/*29.83*/("""
								<span class="glyphicon glyphicon-thumbs-down"></span>
							""")))}/*31.9*/else/*31.13*/{_display_(Seq[Any](format.raw/*31.14*/("""
								<span class="glyphicon glyphicon-thumbs-up"></span>
							""")))})),format.raw/*33.9*/("""
						</button>
						|
						<button type="button" class="btn btn-primary btn-xs">
							<span class="glyphicon">"""),_display_(Seq[Any](/*37.33*/post/*37.37*/.getLikes.size)),format.raw/*37.51*/(""" Likes</span>
						</button>						
						"""),_display_(Seq[Any](/*39.8*/if(post.getAutor.getLogin==member)/*39.42*/{_display_(Seq[Any](format.raw/*39.43*/("""
						 | 
						<button type="button" class="btn btn-danger btn-xs pst-delete" title="Delete">
							<span class="glyphicon glyphicon-trash"></span>
	                    </button>
	                    """)))})),format.raw/*44.23*/("""

						<span class="mic-info pull-right btn-xs">
							In: <a href="#">Montpellier</a> on """),_display_(Seq[Any](/*47.44*/post/*47.48*/.getPostDate.format("MMMM dd"))),format.raw/*47.78*/(""" at : """),_display_(Seq[Any](/*47.85*/post/*47.89*/.getPostDate.format("hh:mm"))),format.raw/*47.117*/("""
						</span>
				</div>
				<div class="row hidden">
				<form class="frm-comment">
					<input type="hidden" id="post-id" value=""""),_display_(Seq[Any](/*52.48*/post/*52.52*/.getId)),format.raw/*52.58*/("""">
                	<input type="text" id="comment-cnt" class="col-md-offset-1 col-md-11" placeholder="Write a comment...">
                	<input type="submit" class="hidden"/>
                </form>
                </div>
            </div>
            <div class="panel-body">
	           <ul class="list-group row comments">
	               """),_display_(Seq[Any](/*60.18*/comments(member,post))),format.raw/*60.39*/(""" 
	           </ul>
            </div>
        </div>
    </div>
""")))})))}
    }
    
    def render(member:String,posts:List[Post]): play.api.templates.HtmlFormat.Appendable = apply(member,posts)
    
    def f:((String,List[Post]) => play.api.templates.HtmlFormat.Appendable) = (member,posts) => apply(member,posts)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/posts.scala.html
                    HASH: 772e81f2c33d529635a4ea22b7cedcf0848b0d82
                    MATRIX: 785->1|914->36|995->82|1009->88|1056->114|1095->119|1146->155|1185->157|1398->334|1413->340|1463->368|1665->534|1678->538|1718->556|1805->607|1818->611|1851->622|2213->948|2226->952|2265->969|2430->1099|2512->1172|2551->1173|2640->1244|2653->1248|2692->1249|2792->1318|2945->1435|2958->1439|2994->1453|3072->1496|3115->1530|3154->1531|3390->1735|3519->1828|3532->1832|3584->1862|3627->1869|3640->1873|3691->1901|3860->2034|3873->2038|3901->2044|4285->2392|4328->2413
                    LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|32->4|38->10|38->10|38->10|43->15|43->15|43->15|45->17|45->17|45->17|53->25|53->25|53->25|57->29|57->29|57->29|59->31|59->31|59->31|61->33|65->37|65->37|65->37|67->39|67->39|67->39|72->44|75->47|75->47|75->47|75->47|75->47|75->47|80->52|80->52|80->52|88->60|88->60
                    -- GENERATED --
                */
            