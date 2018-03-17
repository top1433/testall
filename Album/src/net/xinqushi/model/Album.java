package net.xinqushi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Album {
	private int id;
	private String name;
	private String cover;
	private User user = new User();
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public User getUser() {
		return user;
	}
	@ManyToOne
	@JoinColumn(name="uid")
	public void setUser(User user) {
		this.user = user;
	}

}
