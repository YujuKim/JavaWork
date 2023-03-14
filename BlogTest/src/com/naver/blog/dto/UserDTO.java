package com.naver.blog.dto;

public class UserDTO {
	
	private int id;
	private String password;
	private String name;
	private String email;
	
	
	public UserDTO(int id, String password, String name, String email) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}

	public Object getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserRole(String string) {
		// TODO Auto-generated method stub
		
	}
	
 

}
