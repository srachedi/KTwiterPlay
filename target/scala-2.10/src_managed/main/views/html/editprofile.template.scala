
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
object editprofile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Member,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(member : Member):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
    <div class="row">
        <div class="col-md-8 col-md-offset-2 well">
            <legend><a href="#"><i class="glyphicon glyphicon-edit"></i></a> Edit your profile !</legend>
            
            <form class="form" role="form">
            <div class="row">
                <div class="col-md-6">
                    <input class="form-control" id="ipt_nom" placeholder="Last Name" type="text" value=""""),_display_(Seq[Any](/*9.106*/member/*9.112*/.getProfile.getNom)),format.raw/*9.130*/("""" required autofocus />
                </div>
                <div class="col-md-6">
                    <input class="form-control" id="ipt_prenom" placeholder="First Name" type="text" value=""""),_display_(Seq[Any](/*12.110*/member/*12.116*/.getProfile.getPrenom)),format.raw/*12.137*/("""" required />
                </div>
            </div>
            <input class="form-control" id="ipt_email" placeholder="Your Email" type="email" value=""""),_display_(Seq[Any](/*15.102*/member/*15.108*/.getEmail)),format.raw/*15.117*/(""""/>
            <input class="form-control" id="ipt_email2" placeholder="Re-enter Email" type="email" />
            <input class="form-control" id="ipt_password" placeholder="New Password" type="password" />
            <label for=""> Birth Date</label>
            <div class="row">
                <div class="col-md-4">
                    <select id="ipt_month" class="form-control">
                        <option value="">Month</option>
                        <option value="">-----</option>
                        <option value="1">January</option>
                        <option value="2">February</option>
                        <option value="3">March</option>
                        <option value="4">April</option>
                        <option value="5">May</option>
                        <option value="6">June</option>
                        <option value="7">July</option>
                        <option value="8">August</option>
                        <option value="9">September</option>
                        <option value="10">October</option>
                        <option value="11">November</option>
                        <option value="12">December</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <select id="ipt_day" class="form-control">
                        <option value="">Day</option>
                        <option value="">---</option>
                        """),_display_(Seq[Any](/*42.26*/for(i<- 1 to 31) yield /*42.42*/{_display_(Seq[Any](format.raw/*42.43*/("""
                        	<option value=""""),_display_(Seq[Any](/*43.42*/i)),format.raw/*43.43*/("""">"""),_display_(Seq[Any](/*43.46*/i)),format.raw/*43.47*/("""</option>
                        """)))})),format.raw/*44.26*/("""
                    </select>
                </div>
                <div class="col-md-4">
                    <select id="ipt_year" class="form-control">
                        <option value="">Year</option>
                        <option value="">----</option>
                         """),_display_(Seq[Any](/*51.27*/for(i<- 1950 to 2013) yield /*51.48*/{_display_(Seq[Any](format.raw/*51.49*/("""
                         	<option value=""""),_display_(Seq[Any](/*52.43*/i)),format.raw/*52.44*/("""">"""),_display_(Seq[Any](/*52.47*/i)),format.raw/*52.48*/("""</option>
                         """)))})),format.raw/*53.27*/("""
                    </select>
                </div>
            </div>
            <label class="radio-inline">
                <input type="radio" name="ipt_sex" id="rd_sex1" value="male" """),_display_(Seq[Any](/*58.79*/if(member.getProfile.getSexe=="male")/*58.116*/{_display_(Seq[Any](format.raw/*58.117*/("""checked""")))})),format.raw/*58.125*/("""/> Male
            </label>
            <label class="radio-inline">
                <input type="radio" name="ipt_sex" id="rd_sex2" value="female" /> Female
            </label>
            <br />
            <br />
            <button class="btn btn-lg btn-primary btn-block btn-update" type="submit">Update</button>
            </form>
        </div>
    </div>
"""))}
    }
    
    def render(member:Member): play.api.templates.HtmlFormat.Appendable = apply(member)
    
    def f:((Member) => play.api.templates.HtmlFormat.Appendable) = (member) => apply(member)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 14:29:13 CET 2014
                    SOURCE: /home/rachedi/Bureau/projetInfo/KTwiterPlay-master/app/views/editprofile.scala.html
                    HASH: fd5db7dc00b03562a6d2923c3a284ef4a0716fdd
                    MATRIX: 780->1|891->18|1339->430|1354->436|1394->454|1626->649|1642->655|1686->676|1880->833|1896->839|1928->848|3454->2338|3486->2354|3525->2355|3603->2397|3626->2398|3665->2401|3688->2402|3755->2437|4084->2730|4121->2751|4160->2752|4239->2795|4262->2796|4301->2799|4324->2800|4392->2836|4620->3028|4667->3065|4707->3066|4748->3074
                    LINES: 26->1|29->1|37->9|37->9|37->9|40->12|40->12|40->12|43->15|43->15|43->15|70->42|70->42|70->42|71->43|71->43|71->43|71->43|72->44|79->51|79->51|79->51|80->52|80->52|80->52|80->52|81->53|86->58|86->58|86->58|86->58
                    -- GENERATED --
                */
            