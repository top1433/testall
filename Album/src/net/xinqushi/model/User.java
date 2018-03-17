package net.xinqushi.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class User {
	private int id;
	private String username;
	private String userpwd;
	private Set<Album> albums=new HashSet<Album>();
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	@OneToMany(mappedBy="user")
	public Set<Album> getAlbums() {
		return albums;
	}
	//@OneToMany(mappedBy="user")
	public void setAlbums(Set<Album> albums) {
		this.albums = albums;
	}

}
