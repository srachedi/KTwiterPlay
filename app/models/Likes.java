/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

import play.db.ebean.Model;

/**
 *
 * @author ram
 */
@Entity
@Table(name="tb_likes")
public class Likes extends Model{

    @Id
    @GeneratedValue
    long Id;
    @ManyToOne
    Member member;
    @ManyToOne
    Post post;
    @ManyToOne
    Comment comment;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateLike;

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Date getDateLike() {
        return dateLike;
    }

    public void setDateLike(Date dateLike) {
        this.dateLike = dateLike;
    }
    
    
	// Methodes statics
	// ================================================================================

	public static Finder<Long, Likes> find = new Finder<Long, Likes>(Long.class,Likes.class);
	
	public static Likes getLikedPost(Post post, Member member){
		return find.where().eq("post",post).eq("member",member).findUnique();
	}
	
	public static Likes getLikedComment(Comment comment, Member member){
		return find.where().eq("comment",comment).eq("member",member).findUnique();
	}
	
	public static Boolean isLikedPost(Post post, Member member){
		return find.where().eq("post",post).eq("member",member).findRowCount()>0;
	}
	
	public static Boolean isLikedComment(Comment comment, Member member){
		return find.where().eq("comment",comment).eq("member",member).findRowCount()>0;
	}
	
}
