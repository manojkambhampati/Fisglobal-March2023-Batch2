package com.fis.globalbankmanagementapplication.model;

public class Users {
	String user_id;
	String username;
	String password;
	String role;
	int enabled;
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(String idn, String username, String password, String role, int enabled) {
		super();
		this.user_id = idn;
		this.username = username;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", enabled=" + enabled + "]";
	}
	
}
