package controllers;

import java.util.List;

import models.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import com.fasterxml.jackson.databind.JsonNode;

public class CtrlMessage extends Controller {

	
	public static Result getMessages(){
		Member member = Member.getMember(session().get("Connected"));
		List<Message> received_msgs = Message.getMyRcvdMessages(member);
		List<Message> sent_msgs = Message.getMySntMessages(member);
		
		return ok(messages.render(sent_msgs,received_msgs));
	}
	
	public static Result sendMessage(){
    	JsonNode body = request().body().asJson();
    	Message message = new Message();
    	message.setExpediteur(Member.getMember(session().get("Connected")));
    	message.setDestinataire(Member.getMember(body.get("destinataire").asText()));
    	message.setTitle(body.get("title").asText());
    	message.setMessage(body.get("content").asText());
    	Message.setMessage(message);
    	return redirect(routes.CtrlMessage.getMessages());
    }
	
	public static Result deleteMessage(){
	
		JsonNode body = request().body().asJson();
		Message message = Message.find.byId(body.get("msg-id").asLong());
		message.delete();
		return redirect(routes.CtrlMessage.getMessages());
	}
	
	public static Result deleteMessages(){
		
		JsonNode body = request().body().asJson();
		//Message message = Message.find.byId(body.get("msg-id").asLong());
		//message.delete();
		return redirect(routes.CtrlMessage.getMessages());
	}
	
}
