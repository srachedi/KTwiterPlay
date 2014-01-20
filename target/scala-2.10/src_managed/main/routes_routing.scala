// @SOURCE:/home/rachedi/Bureau/projetInfo/KTwiterPlay-master/conf/routes
// @HASH:184a823372a5c6da4c09d7cecd58bac0e02dc329
// @DATE:Mon Jan 20 14:29:12 CET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_about1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
        

// @LINE:8
private[this] lazy val controllers_Application_contact2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
        

// @LINE:9
private[this] lazy val controllers_Application_admin3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:16
private[this] lazy val controllers_CtrlMember_members5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("members"))))
        

// @LINE:17
private[this] lazy val controllers_CtrlMember_profile6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:18
private[this] lazy val controllers_CtrlMember_viewProfile7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewprofile"))))
        

// @LINE:19
private[this] lazy val controllers_CtrlMember_editProfile8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editprofile"))))
        

// @LINE:20
private[this] lazy val controllers_CtrlMember_updateProfile9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateprofile"))))
        

// @LINE:23
private[this] lazy val controllers_CtrlMember_signup10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:24
private[this] lazy val controllers_CtrlMember_submitMember11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:27
private[this] lazy val controllers_CtrlMember_signin12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
        

// @LINE:28
private[this] lazy val controllers_CtrlMember_submitSignin13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
        

// @LINE:29
private[this] lazy val controllers_CtrlMember_logout14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:32
private[this] lazy val controllers_CtrlMessage_getMessages15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("messages"))))
        

// @LINE:33
private[this] lazy val controllers_CtrlMessage_sendMessage16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sendmessage"))))
        

// @LINE:34
private[this] lazy val controllers_CtrlMessage_deleteMessage17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletemessage"))))
        

// @LINE:35
private[this] lazy val controllers_CtrlMessage_deleteMessages18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletemessages"))))
        

// @LINE:38
private[this] lazy val controllers_CtrlPost_wallPosts19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wallposts"))))
        

// @LINE:39
private[this] lazy val controllers_CtrlPost_allPosts20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("allposts"))))
        

// @LINE:40
private[this] lazy val controllers_CtrlPost_submitPost21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("post"))))
        

// @LINE:41
private[this] lazy val controllers_CtrlPost_deletePost22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletePost"))))
        

// @LINE:42
private[this] lazy val controllers_CtrlPost_likePost23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("likePost"))))
        

// @LINE:43
private[this] lazy val controllers_CtrlPost_search24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:46
private[this] lazy val controllers_CtrlComment_getComments25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comments"))))
        

// @LINE:47
private[this] lazy val controllers_CtrlComment_submitComment26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment"))))
        

// @LINE:48
private[this] lazy val controllers_CtrlComment_deleteComment27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteComment"))))
        

// @LINE:49
private[this] lazy val controllers_CtrlComment_likeComment28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("likeComment"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Application.contact()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Application.admin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """members""","""controllers.CtrlMember.members()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.CtrlMember.profile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewprofile""","""controllers.CtrlMember.viewProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editprofile""","""controllers.CtrlMember.editProfile()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateprofile""","""controllers.CtrlMember.updateProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.CtrlMember.signup()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.CtrlMember.submitMember()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.CtrlMember.signin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.CtrlMember.submitSignin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.CtrlMember.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """messages""","""controllers.CtrlMessage.getMessages()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sendmessage""","""controllers.CtrlMessage.sendMessage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletemessage""","""controllers.CtrlMessage.deleteMessage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletemessages""","""controllers.CtrlMessage.deleteMessages()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wallposts""","""controllers.CtrlPost.wallPosts()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """allposts""","""controllers.CtrlPost.allPosts()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """post""","""controllers.CtrlPost.submitPost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletePost""","""controllers.CtrlPost.deletePost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """likePost""","""controllers.CtrlPost.likePost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.CtrlPost.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comments""","""controllers.CtrlComment.getComments()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment""","""controllers.CtrlComment.submitComment()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteComment""","""controllers.CtrlComment.deleteComment()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """likeComment""","""controllers.CtrlComment.likeComment()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_about1(params) => {
   call { 
        invokeHandler(controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Nil,"GET", """""", Routes.prefix + """about"""))
   }
}
        

// @LINE:8
case controllers_Application_contact2(params) => {
   call { 
        invokeHandler(controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Nil,"GET", """""", Routes.prefix + """contact"""))
   }
}
        

// @LINE:9
case controllers_Application_admin3(params) => {
   call { 
        invokeHandler(controllers.Application.admin(), HandlerDef(this, "controllers.Application", "admin", Nil,"GET", """""", Routes.prefix + """admin"""))
   }
}
        

// @LINE:13
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:16
case controllers_CtrlMember_members5(params) => {
   call { 
        invokeHandler(controllers.CtrlMember.members(), HandlerDef(this, "controllers.CtrlMember", "members", Nil,"GET", """ Get members home page.""", Routes.prefix + """members"""))
   }
}
        

// @LINE:17
case controllers_CtrlMember_profile6(params) => {
   call { 
        invokeHandler(controllers.CtrlMember.profile(), HandlerDef(this, "controllers.CtrlMember", "profile", Nil,"POST", """""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:18
case controllers_CtrlMember_viewProfile7(params) => {
   call { 
        invokeHandler(controllers.CtrlMember.viewProfile(), HandlerDef(this, "controllers.CtrlMember", "viewProfile", Nil,"GET", """""", Routes.prefix + """viewprofile"""))
   }
}
        

// @LINE:19
case controllers_CtrlMember_editProfile8(params) => {
   call { 
        invokeHandler(controllers.CtrlMember.editProfile(), HandlerDef(this, "controllers.CtrlMember", "editProfile", Nil,"GET", """""", Routes.prefix + """editprofile"""))
   }
}
        

// @LINE:20
case controllers_CtrlMember_updateProfile9(params) => {
   call { 
        invokeHandler(controllers.CtrlMember.updateProfile(), HandlerDef(this, "controllers.CtrlMember", "updateProfile", Nil,"POST", """""", Routes.prefix + """updateprofile"""))
   }
}
        

// @LINE:23
case controllers_CtrlMember_signup10(params) => {
   call { 
        invokeHandler(controllers.CtrlMember.signup(), HandlerDef(this, "controllers.CtrlMember", "signup", Nil,"GET", """ Routes vers les actions sur l'inscription.""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:24
case controllers_CtrlMember_submitMember11(params) => {
   call { 
        invokeHandler(controllers.CtrlMember.submitMember(), HandlerDef(this, "controllers.CtrlMember", "submitMember", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:27
case controllers_CtrlMember_signin12(params) => {
   call { 
        invokeHandler(controllers.CtrlMember.signin(), HandlerDef(this, "controllers.CtrlMember", "signin", Nil,"GET", """ Routes vers les actions sur la connexion.""", Routes.prefix + """signin"""))
   }
}
        

// @LINE:28
case controllers_CtrlMember_submitSignin13(params) => {
   call { 
        invokeHandler(controllers.CtrlMember.submitSignin(), HandlerDef(this, "controllers.CtrlMember", "submitSignin", Nil,"POST", """""", Routes.prefix + """signin"""))
   }
}
        

// @LINE:29
case controllers_CtrlMember_logout14(params) => {
   call { 
        invokeHandler(controllers.CtrlMember.logout(), HandlerDef(this, "controllers.CtrlMember", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:32
case controllers_CtrlMessage_getMessages15(params) => {
   call { 
        invokeHandler(controllers.CtrlMessage.getMessages(), HandlerDef(this, "controllers.CtrlMessage", "getMessages", Nil,"GET", """ Routes vers les actions pour l'envoi de messages.""", Routes.prefix + """messages"""))
   }
}
        

// @LINE:33
case controllers_CtrlMessage_sendMessage16(params) => {
   call { 
        invokeHandler(controllers.CtrlMessage.sendMessage(), HandlerDef(this, "controllers.CtrlMessage", "sendMessage", Nil,"POST", """""", Routes.prefix + """sendmessage"""))
   }
}
        

// @LINE:34
case controllers_CtrlMessage_deleteMessage17(params) => {
   call { 
        invokeHandler(controllers.CtrlMessage.deleteMessage(), HandlerDef(this, "controllers.CtrlMessage", "deleteMessage", Nil,"POST", """""", Routes.prefix + """deletemessage"""))
   }
}
        

// @LINE:35
case controllers_CtrlMessage_deleteMessages18(params) => {
   call { 
        invokeHandler(controllers.CtrlMessage.deleteMessages(), HandlerDef(this, "controllers.CtrlMessage", "deleteMessages", Nil,"POST", """""", Routes.prefix + """deletemessages"""))
   }
}
        

// @LINE:38
case controllers_CtrlPost_wallPosts19(params) => {
   call { 
        invokeHandler(controllers.CtrlPost.wallPosts(), HandlerDef(this, "controllers.CtrlPost", "wallPosts", Nil,"GET", """ Routes vers les actions sur les posts.""", Routes.prefix + """wallposts"""))
   }
}
        

// @LINE:39
case controllers_CtrlPost_allPosts20(params) => {
   call { 
        invokeHandler(controllers.CtrlPost.allPosts(), HandlerDef(this, "controllers.CtrlPost", "allPosts", Nil,"GET", """""", Routes.prefix + """allposts"""))
   }
}
        

// @LINE:40
case controllers_CtrlPost_submitPost21(params) => {
   call { 
        invokeHandler(controllers.CtrlPost.submitPost(), HandlerDef(this, "controllers.CtrlPost", "submitPost", Nil,"POST", """""", Routes.prefix + """post"""))
   }
}
        

// @LINE:41
case controllers_CtrlPost_deletePost22(params) => {
   call { 
        invokeHandler(controllers.CtrlPost.deletePost(), HandlerDef(this, "controllers.CtrlPost", "deletePost", Nil,"POST", """""", Routes.prefix + """deletePost"""))
   }
}
        

// @LINE:42
case controllers_CtrlPost_likePost23(params) => {
   call { 
        invokeHandler(controllers.CtrlPost.likePost(), HandlerDef(this, "controllers.CtrlPost", "likePost", Nil,"POST", """""", Routes.prefix + """likePost"""))
   }
}
        

// @LINE:43
case controllers_CtrlPost_search24(params) => {
   call { 
        invokeHandler(controllers.CtrlPost.search(), HandlerDef(this, "controllers.CtrlPost", "search", Nil,"POST", """""", Routes.prefix + """search"""))
   }
}
        

// @LINE:46
case controllers_CtrlComment_getComments25(params) => {
   call { 
        invokeHandler(controllers.CtrlComment.getComments(), HandlerDef(this, "controllers.CtrlComment", "getComments", Nil,"GET", """ Routes vers les actions sur les commentaires.""", Routes.prefix + """comments"""))
   }
}
        

// @LINE:47
case controllers_CtrlComment_submitComment26(params) => {
   call { 
        invokeHandler(controllers.CtrlComment.submitComment(), HandlerDef(this, "controllers.CtrlComment", "submitComment", Nil,"POST", """""", Routes.prefix + """comment"""))
   }
}
        

// @LINE:48
case controllers_CtrlComment_deleteComment27(params) => {
   call { 
        invokeHandler(controllers.CtrlComment.deleteComment(), HandlerDef(this, "controllers.CtrlComment", "deleteComment", Nil,"POST", """""", Routes.prefix + """deleteComment"""))
   }
}
        

// @LINE:49
case controllers_CtrlComment_likeComment28(params) => {
   call { 
        invokeHandler(controllers.CtrlComment.likeComment(), HandlerDef(this, "controllers.CtrlComment", "likeComment", Nil,"POST", """""", Routes.prefix + """likeComment"""))
   }
}
        
}

}
     