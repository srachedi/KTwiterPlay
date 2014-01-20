package controllers;

import java.util.List;

import models.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import com.fasterxml.jackson.databind.JsonNode;

public class CtrlMember extends Controller {
		
	public static Result members() {
    	List <Member> members;
    	members  = Member.all();
    	String member = session().get("Connected");
		return ok();
    }
	
	public static Result profile() {
    	if(request().accepts("application/json"))
        {
        	Member autor;
        	String member = session().get("Connected");
        	JsonNode body = request().body().asJson();
        	autor = Member.getMember(body.get("login").asText());
        	return ok(profile.render(member,autor));
        }
    	return badRequest();
    }
	
	public static Result viewProfile() {
    	if(request().accepts("application/json"))
        {
        	Member autor;
        	String member = session().get("Connected");
        	JsonNode body = request().body().asJson();
        	autor = Member.getMember(member);
        	return ok(profile.render(member,autor));
        }
    	return badRequest();
    }
	
	public static Result editProfile() {
    	if(request().accepts("application/json"))
        {
        	Member member;
        	member = Member.getMember(session().get("Connected"));
        	return ok(editprofile.render(member));
        }
    	return badRequest();
    }

    public static Result updateProfile() {
        
    	if(request().accepts("application/json"))
        {
        	Member member = Member.getMember(session().get("Connected"));
        	
        	JsonNode body = request().body().asJson();
        	member.setEmail(body.get("email").asText());
        	member.setPassword(body.get("password").asText());
        	//member.update();
        	
        	Profile profile = Profile.getProfile(member);
        	profile.setNom(body.get("nom").asText());
        	profile.setPrenom(body.get("prenom").asText());
        	profile.setSexe(body.get("sex").asText());
//        	profile.setDateNaissance(null);
//        	profile.set(body.get("").asText());
        	profile.update();
        } 
    	return ok("Ok");
    }
	
	
	public static Result signup() {	
        return ok(signup.render());
    }
	
	public static Result signin() {	
        return ok(signin.render());
    }	
	
	public static Result logout() {	
		session().clear();	
		return redirect(routes.Application.index());
    }
	
    public static Result submitMember() {
        
    	if(request().accepts("application/json"))
        {
        	Member member =new Member();    
        	JsonNode body = request().body().asJson(); 
        	member.setLogin(body.get("login").asText());
        	member.setEmail(body.get("email").asText());
        	member.setPassword(body.get("motPasse").asText());
        	member.save();
        	
        	Profile profile = new Profile();
        	profile.setRole("Member");
        	profile.setMember(member);
        	Profile.setProfile(profile);
        }
        return badRequest();
    }
    
    public static Result submitSignin(){
    	JsonNode body = request().body().asJson();
    	if(Member.isMember(body.get("login").asText(), body.get("motPasse").asText())){
    		String member = body.get("login").asText();
    		session().put("Connected",member);
    	}
    	return redirect(routes.Application.index());
    }
}
