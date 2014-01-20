$(document).ready(function($) {
	$(".btn-home").click(function(e) {
		window.location = '/';
    });
	$(".btn-admin").click(function(e) {
    	$('article').load('/admin');
    });
	$(".btn-about").click(function(e) {
    	$('article').load('/about');
    });
	$(".btn-contact").click(function(e) {
    	$('article').load('/contact');
    });

//=================================================================================================================
//==========================================   Connexion   ========================================================
//=================================================================================================================	

	// Afficher le formulaire de connexion.
	$(".signin_frm").click(function(e) {
    	$('article').load('/signin');
    });
	
	// Se connecter.
	$('article').on("click",".signin_frm",function(e) {
		$login = $("#ipt_login").val();
        $motPasse = $("#ipt_password").val();
        $.ajax({
                type : 'POST',
                url : '/signin',
                contentType : "application/json; charset=UTF-8",
                data : JSON.stringify({"login" : $login,"motPasse" : $motPasse}),
                success : function(data) {
                	window.location ='/';
                }
        });
        return false;
	});
	
	// Se deconnecter.
	$(".btn-logout").on("click",function(e) {
		$.ajax({
			url : '/logout',
            success : function(data) {
            	window.location ='/';
            }
		});
	});

//=================================================================================================================
//==========================================     Member    ========================================================
//=================================================================================================================	

	// Afficher le formulaire d'inscription.
	$(".signup_frm").on("click",function(e) {
    	$('article').load('/signup');
    });
	
	// Ajouter un nouveau membre.
	$('article').on("click",".btn-submit-member",function(e) {
		$nom = $("#inputNom").val();
		$prenom = $("#inputPrenom").val();
		$login = $("#inputLogin").val();
		$email = $("#inputEmail").val();
        $motPasse = $("#inputPassword").val();
        $.ajax({
                type : 'POST',
                url : '/signup',
                contentType : "application/json; charset=UTF-8",
                data : JSON.stringify({"nom" : $nom,"prenom" : $prenom,"login" : $login,"email" : $email,"motPasse" : $motPasse}),
                success : function(data) {
                	//$('article').load('article.scala.html');
                }
        });
        return false;
	});
	
	$('article').on("click",".btn-update",function(e) {
		$nom 		= $("#ipt_nom").val();
		$prenom 	= $("#ipt_prenom").val();
		$email 		= $("#ipt_email").val();
		$day 		= $("#ipt_day").val();
		$month 		= $("#ipt_month").val();
		$year 		= $("#ipt_year").val();
        $password 	= $("#ipt_password").val();
       	if($("input:checked").val()!=null) {$sex = $("input:checked").val();}
       	else {$sex ="";} 
        $.ajax({
        	type : 'POST',
        	url : '/updateprofile',
        	contentType : "application/json; charset=UTF-8",
        	data : JSON.stringify({"nom" : $nom,"prenom" : $prenom,"email" : $email,"password" : $password ,"day" : $day,"month" : $month,"year" : $year,"sex" :$sex}),
        	success : function(data) {
        		$('article').append('<div>Well done, Member Uppdated!</div>');
        		$('article').load('/viewprofile');
                
        	}
        });
        return false;
	});
	
	$('article').on("click",".mbr-delete",function(e) {
		alert("OK");
    	//$('article').load('/signup');
    });
	
	$('.btn-search').on("click",function(e) {
		$search = $("#ipt-search").val();
		alert($search);
		$.ajax({
            type : 'POST',
            url : '/search',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify({"search" : $search}),
            success : function(data) {
            	$('article').html(data);
            }
        });
		return false;
    });	


//==================================================================================================================
//=============================================   Messages   =======================================================
//==================================================================================================================

	$('.btn-messages').on("click",function(e) {
		$('article').load('/messages');
	});
	
	$('article').on("click",'.btn-send-message',function(e) {
		$destinataire = $("#msg-destinataire").val();
		$title = $("#msg-title").val();
		$content = $("#msg-content").val();
		$('#myModal').modal('hide');
		$.ajax({
            type : 'POST',
            url : '/sendmessage',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify({"destinataire" : $destinataire,"title" : $title,"content" : $content}),
            success : function(data) {
            	$('article').html(data);
            }
        });
    });	
	
	$('article').on("click",'.btn-ansewer-message',function(e) {
		$destinataire = $(this).parents(".modal-dialog").find("#rsp-destinataire").text();
		$title = "Re: "+$(this).parents(".modal-dialog").find("#rsp-title").text();
		$content = $(this).parents(".modal-dialog").find("#rsp-content").val();
		$('#myModal').modal('hide');
		$.ajax({
            type : 'POST',
            url : '/sendmessage',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify({"destinataire" : $destinataire,"title" : $title,"content" : $content}),
            success : function(data) {
            	$('article').html(data);
            }
        });
    });
	
	$('article').on("click",'.btn-delete-message',function(e) {
		$msgid = $(this).parents("li").find("#msg-id").val();
		$.ajax({
            type : 'POST',
            url : '/deletemessage',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify({"msg-id" : $msgid}),
            success : function(data) {
            	$('article').html(data);
            }
        });
    });
	
	$('article').on("click",'.btn-delete-messages',function(e) {
		var msgid =[]; 
		$("li").each(function(){
			msgid.push($(this).find("#msg-id").val());
		});
		
		$.ajax({
            type : 'POST',
            url : '/deletemessages',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify(msgid),
            success : function(data) {
            	$('article').html(data);
            }
        });
    });
//==================================================================================================================
//================================================   Posts   =======================================================
//==================================================================================================================

	// Faire un post. 	
	
	$(".btn-post-submit").on("click",function(e) {
        $post = $("#ipt-post").val();
        $.ajax({
                type : 'POST',
                url : '/post',
                contentType : "application/json; charset=UTF-8",
                data : JSON.stringify({"post" : $post}),
                success : function(data) {
                	$("#ipt-post").val('');
                	$("article").html(data);
                	
                }
        });
        return false;
	});

	//Afficher tous les posts
	
	$(".btn-all").click(function(e) {
		$.ajax({
            type : 'GET',
            url : '/allposts',
            contentType : "text/html; charset=UTF-8",
            success : function(data) {
            	$('article').html(data);
            }
        });
	});	
	
	//Afficher les posts du membre connecte.
	
	$(".btn-wall").click(function(e) {
		$.ajax({
            type : 'GET',
            url : '/wallposts',
            contentType : "text/html; charset=UTF-8",
            success : function(data) {
            	$('article').html(data);
            }
        });
	});

	// Faire un like pour un post.
	$('section').on("click",".pst-like",function(e) {
		$postid  = $(this).parents(".post").find("#post-id").val();
		$.ajax({
            type : 'POST',
            url : '/likePost',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify({"post-id" : $postid}),
            success : function(data) {
            	$("article").html(data);
            }
        });
        return false;		
	});
	
	// Supprimer un post.
	$('section').on("click",".pst-delete",function(e) {
		$postid  = $(this).parents(".post").find("#post-id").val();
		//*
		$.ajax({
            type : 'POST',
            url : '/deletePost',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify({"post-id" : $postid}),
            success : function(data) {
            	$("#article").html(data);
            }
        });
        //*/
        return false;		
	});
	
	
//=================================================================================================================
//==========================================   Comments   =========================================================
//=================================================================================================================	
	
	// Affichier le champ commentaire
	
	$('article').on("click",".btn-comment",function(e) {
		$(this).parents('.action').next().removeClass("hidden");
	});
	
	// Commenter un post. 
	$('article').on("submit",".frm-comment",function(e) {
		$postid  = $(this).children("#post-id").val();
		$comment = $(this).children("#comment-cnt").val();
		$(this).children("#comment-cnt").val('');
		$.ajax({
            type : 'POST',
            url : '/comment',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify({"post-id" : $postid,"comment" : $comment}),
            success : function(data) {
            	$("article").html(data);
            }
        });
        return false;
	});
	
	// Faire un like pour un commentaire.
	$('article').on("click",".cmt-like",function(e) {
		$commentid  = $(this).parents(".comment-row").find("#comment-id").val();
		$.ajax({
            type : 'POST',
            url : '/likeComment',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify({"comment-id" : $commentid}),
            success : function(data) {
            	$("article").html(data);
            }
        });
        return false;		
	});
	
	// Supprimer un commentaire.
	
	$('article').on("click",".cmt-delete",function(e) {
		$commentid  = $(this).parents(".comment-row").find("#comment-id").val();
		$.ajax({
            type : 'POST',
            url : '/deleteComment',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify({"comment-id" : $commentid}),
            success : function(data) {
            	$("article").html(data);
            }
        });
        return false;		
	});
	
//=================================================================================================================
//==========================================    Profile   =========================================================
//=================================================================================================================	
	
	// Afficher un profile.
	$('article').on("click",".autor-login",function(e) {
		$login= $(this).find("b").text();
		$.ajax({
            type : 'POST',
            url : '/profile',
            contentType : "application/json; charset=UTF-8",
            data : JSON.stringify({"login" : $login}),
            success : function(data) {
            	$('article').html(data);
            }
        });
	});
	
	//Afficher le profile du membere connecte.
	$(".view-profile").on("click",function(e) {
		$.ajax({
            type : 'GET',
            url : '/viewprofile',
            contentType : "application/json; charset=UTF-8",
            success : function(data) {
            	$('article').html(data);
            }
        });
	});
	
	//Afficher le formulaire pour la modification du profile du membre connecte.
	$("article").on("click",".btn-edit-profile",function(e) {
		$.ajax({
            type : 'GET',
            url : '/editprofile',
            contentType : "application/json; charset=UTF-8",
            success : function(data) {
            	$('article').html(data);
            }
        });
	});
});