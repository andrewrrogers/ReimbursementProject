package com.company.project;

public class Users {
	
	private String username,password,firstname,lastname,email;
	private int userid;
	private boolean managestatus;
	
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public boolean isManagestatus() {
		return managestatus;
	}
	public void setManagestatus(boolean managestatus) {
		this.managestatus = managestatus;
	}
	
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", userid=" + userid + ", managestatus=" + managestatus + "]";
	}
	
	public Users(String username, String password, String firstname, String lastname, String email, int userid,
			boolean managestatus) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.userid = userid;
		this.managestatus = managestatus;
	}
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


}
