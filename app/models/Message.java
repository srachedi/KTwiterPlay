/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.db.ebean.Model;

/**
 *
 * @author ram
 */
@Entity
@Table(name="tb_messages")
public class Message extends Model{

    @Id
    @GeneratedValue
    long id;
    String title;
    String message;
    @ManyToOne
    Member expediteur;
    @ManyToOne
    Member destinataire;
    Date dateEnvoi;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Member getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(Member expiditeur) {
        this.expediteur = expiditeur;
    }

    public Member getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(Member destinataire) {
        this.destinataire = destinataire;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }
  
	// Methodes statics
	// ================================================================================
    
	public static Finder<Long, Message> find = new Finder<Long, Message>(Long.class,Message.class);  
	
	public static List<Message> getMySntMessages(Member member) {
		return find.where().eq("destinataire", member).findList();
	}
	
	public static List<Message> getMyRcvdMessages(Member member) {
		return find.where().eq("expediteur", member).findList();
	}	
	
	public static void setMessage(Message message) {
		message.dateEnvoi = new Date();
		message.save();
	}
    
}
