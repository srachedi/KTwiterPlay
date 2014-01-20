// @SOURCE:/home/rachedi/Bureau/projetInfo/KTwiterPlay-master/conf/routes
// @HASH:184a823372a5c6da4c09d7cecd58bac0e02dc329
// @DATE:Mon Jan 20 14:29:12 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
class ReverseCtrlPost {
    

// @LINE:40
def submitPost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "post")
}
                                                

// @LINE:39
def allPosts(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "allposts")
}
                                                

// @LINE:43
def search(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "search")
}
                                                

// @LINE:42
def likePost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "likePost")
}
                                                

// @LINE:41
def deletePost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "deletePost")
}
                                                

// @LINE:38
def wallPosts(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "wallposts")
}
                                                
    
}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseCtrlMember {
    

// @LINE:16
def members(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "members")
}
                                                

// @LINE:18
def viewProfile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "viewprofile")
}
                                                

// @LINE:17
def profile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:28
def submitSignin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signin")
}
                                                

// @LINE:23
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:29
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:27
def signin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signin")
}
                                                

// @LINE:24
def submitMember(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:19
def editProfile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editprofile")
}
                                                

// @LINE:20
def updateProfile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateprofile")
}
                                                
    
}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
class ReverseCtrlComment {
    

// @LINE:47
def submitComment(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "comment")
}
                                                

// @LINE:46
def getComments(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "comments")
}
                                                

// @LINE:48
def deleteComment(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "deleteComment")
}
                                                

// @LINE:49
def likeComment(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "likeComment")
}
                                                
    
}
                          

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseCtrlMessage {
    

// @LINE:35
def deleteMessages(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "deletemessages")
}
                                                

// @LINE:34
def deleteMessage(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "deletemessage")
}
                                                

// @LINE:33
def sendMessage(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sendmessage")
}
                                                

// @LINE:32
def getMessages(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "messages")
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def about(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:8
def contact(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                                                

// @LINE:9
def admin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                                                
    
}
                          
}
                  


// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
class ReverseCtrlPost {
    

// @LINE:40
def submitPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlPost.submitPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
      }
   """
)
                        

// @LINE:39
def allPosts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlPost.allPosts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allposts"})
      }
   """
)
                        

// @LINE:43
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlPost.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:42
def likePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlPost.likePost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "likePost"})
      }
   """
)
                        

// @LINE:41
def deletePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlPost.deletePost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletePost"})
      }
   """
)
                        

// @LINE:38
def wallPosts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlPost.wallPosts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wallposts"})
      }
   """
)
                        
    
}
              

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseCtrlMember {
    

// @LINE:16
def members : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMember.members",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "members"})
      }
   """
)
                        

// @LINE:18
def viewProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMember.viewProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewprofile"})
      }
   """
)
                        

// @LINE:17
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMember.profile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:28
def submitSignin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMember.submitSignin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
   """
)
                        

// @LINE:23
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMember.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:29
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMember.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:27
def signin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMember.signin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
   """
)
                        

// @LINE:24
def submitMember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMember.submitMember",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:19
def editProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMember.editProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editprofile"})
      }
   """
)
                        

// @LINE:20
def updateProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMember.updateProfile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateprofile"})
      }
   """
)
                        
    
}
              

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
class ReverseCtrlComment {
    

// @LINE:47
def submitComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlComment.submitComment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment"})
      }
   """
)
                        

// @LINE:46
def getComments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlComment.getComments",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments"})
      }
   """
)
                        

// @LINE:48
def deleteComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlComment.deleteComment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteComment"})
      }
   """
)
                        

// @LINE:49
def likeComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlComment.likeComment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "likeComment"})
      }
   """
)
                        
    
}
              

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseCtrlMessage {
    

// @LINE:35
def deleteMessages : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMessage.deleteMessages",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletemessages"})
      }
   """
)
                        

// @LINE:34
def deleteMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMessage.deleteMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletemessage"})
      }
   """
)
                        

// @LINE:33
def sendMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMessage.sendMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sendmessage"})
      }
   """
)
                        

// @LINE:32
def getMessages : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtrlMessage.getMessages",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "messages"})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:8
def contact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        

// @LINE:9
def admin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.admin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
class ReverseCtrlPost {
    

// @LINE:40
def submitPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlPost.submitPost(), HandlerDef(this, "controllers.CtrlPost", "submitPost", Seq(), "POST", """""", _prefix + """post""")
)
                      

// @LINE:39
def allPosts(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlPost.allPosts(), HandlerDef(this, "controllers.CtrlPost", "allPosts", Seq(), "GET", """""", _prefix + """allposts""")
)
                      

// @LINE:43
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlPost.search(), HandlerDef(this, "controllers.CtrlPost", "search", Seq(), "POST", """""", _prefix + """search""")
)
                      

// @LINE:42
def likePost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlPost.likePost(), HandlerDef(this, "controllers.CtrlPost", "likePost", Seq(), "POST", """""", _prefix + """likePost""")
)
                      

// @LINE:41
def deletePost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlPost.deletePost(), HandlerDef(this, "controllers.CtrlPost", "deletePost", Seq(), "POST", """""", _prefix + """deletePost""")
)
                      

// @LINE:38
def wallPosts(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlPost.wallPosts(), HandlerDef(this, "controllers.CtrlPost", "wallPosts", Seq(), "GET", """ Routes vers les actions sur les posts.""", _prefix + """wallposts""")
)
                      
    
}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseCtrlMember {
    

// @LINE:16
def members(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMember.members(), HandlerDef(this, "controllers.CtrlMember", "members", Seq(), "GET", """ Get members home page.""", _prefix + """members""")
)
                      

// @LINE:18
def viewProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMember.viewProfile(), HandlerDef(this, "controllers.CtrlMember", "viewProfile", Seq(), "GET", """""", _prefix + """viewprofile""")
)
                      

// @LINE:17
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMember.profile(), HandlerDef(this, "controllers.CtrlMember", "profile", Seq(), "POST", """""", _prefix + """profile""")
)
                      

// @LINE:28
def submitSignin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMember.submitSignin(), HandlerDef(this, "controllers.CtrlMember", "submitSignin", Seq(), "POST", """""", _prefix + """signin""")
)
                      

// @LINE:23
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMember.signup(), HandlerDef(this, "controllers.CtrlMember", "signup", Seq(), "GET", """ Routes vers les actions sur l'inscription.""", _prefix + """signup""")
)
                      

// @LINE:29
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMember.logout(), HandlerDef(this, "controllers.CtrlMember", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:27
def signin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMember.signin(), HandlerDef(this, "controllers.CtrlMember", "signin", Seq(), "GET", """ Routes vers les actions sur la connexion.""", _prefix + """signin""")
)
                      

// @LINE:24
def submitMember(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMember.submitMember(), HandlerDef(this, "controllers.CtrlMember", "submitMember", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:19
def editProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMember.editProfile(), HandlerDef(this, "controllers.CtrlMember", "editProfile", Seq(), "GET", """""", _prefix + """editprofile""")
)
                      

// @LINE:20
def updateProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMember.updateProfile(), HandlerDef(this, "controllers.CtrlMember", "updateProfile", Seq(), "POST", """""", _prefix + """updateprofile""")
)
                      
    
}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
class ReverseCtrlComment {
    

// @LINE:47
def submitComment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlComment.submitComment(), HandlerDef(this, "controllers.CtrlComment", "submitComment", Seq(), "POST", """""", _prefix + """comment""")
)
                      

// @LINE:46
def getComments(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlComment.getComments(), HandlerDef(this, "controllers.CtrlComment", "getComments", Seq(), "GET", """ Routes vers les actions sur les commentaires.""", _prefix + """comments""")
)
                      

// @LINE:48
def deleteComment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlComment.deleteComment(), HandlerDef(this, "controllers.CtrlComment", "deleteComment", Seq(), "POST", """""", _prefix + """deleteComment""")
)
                      

// @LINE:49
def likeComment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlComment.likeComment(), HandlerDef(this, "controllers.CtrlComment", "likeComment", Seq(), "POST", """""", _prefix + """likeComment""")
)
                      
    
}
                          

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseCtrlMessage {
    

// @LINE:35
def deleteMessages(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMessage.deleteMessages(), HandlerDef(this, "controllers.CtrlMessage", "deleteMessages", Seq(), "POST", """""", _prefix + """deletemessages""")
)
                      

// @LINE:34
def deleteMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMessage.deleteMessage(), HandlerDef(this, "controllers.CtrlMessage", "deleteMessage", Seq(), "POST", """""", _prefix + """deletemessage""")
)
                      

// @LINE:33
def sendMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMessage.sendMessage(), HandlerDef(this, "controllers.CtrlMessage", "sendMessage", Seq(), "POST", """""", _prefix + """sendmessage""")
)
                      

// @LINE:32
def getMessages(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtrlMessage.getMessages(), HandlerDef(this, "controllers.CtrlMessage", "getMessages", Seq(), "GET", """ Routes vers les actions pour l'envoi de messages.""", _prefix + """messages""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:8
def contact(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq(), "GET", """""", _prefix + """contact""")
)
                      

// @LINE:9
def admin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.admin(), HandlerDef(this, "controllers.Application", "admin", Seq(), "GET", """""", _prefix + """admin""")
)
                      
    
}
                          
}
        
    