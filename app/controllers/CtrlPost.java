package controllers;

import java.util.List;

import models.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import com.fasterxml.jackson.databind.JsonNode;

public class CtrlPost extends Controller {
	
	public static Result allPosts() {
    	List <Post> posts;
    	posts  = Post.all();
    	String member = session().get("Connected");
		return ok(views.html.posts.render(member,posts));
	}
	
	public static Result wallPosts() {
    	List <Post> posts;
    	String member = session().get("Connected");
    	posts  = Post.getPostsByM(Member.getMember(member));
		return ok(views.html.posts.render(member,posts));
	}
	
	
    public static Result search() {
    	List <Post> posts;
      	JsonNode body = request().body().asJson();
      	Member member = Member.getMember(body.get("search").asText());
		posts  = Post.getPostsByM(member);
		return ok(views.html.posts.render(session().get("Connected"),posts));
    }
	
	public static Result likePost() {
		JsonNode body = request().body().asJson();
		Post post = Post.getPost(body.get("post-id").asInt());
		Member member = Member.getMember(session().get("Connected"));
		
		if(Likes.isLikedPost(post,member)){
			Likes likes = Likes.getLikedPost(post, member);
			likes.delete();
		}
		else{
			Likes likes = new Likes();
			likes.setPost(post);
			likes.setMember(member);
			likes.save();
		}
		return redirect(routes.CtrlPost.allPosts());
	}
	
	public static Result deletePost() {
		JsonNode body = request().body().asJson();
		Post post = Post.getPost(body.get("post-id").asInt());
		post.delete();
		return redirect(routes.CtrlPost.allPosts());
	}
	
	public static Result submitPost() {	
		JsonNode body = request().body().asJson();
    	Post post = new Post();
    	post.setContent(body.get("post").asText());
    	post.setAutor(Member.getMember(session().get("Connected")));
    	Post.setPost(post);
		return redirect(routes.CtrlPost.allPosts());
	}  
	
}
