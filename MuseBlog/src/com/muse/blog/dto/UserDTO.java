package com.muse.blog.dto;

public class UserDTO {
	private int id;
	private String username;
	private String email;
	private String address;
	private String userRole;
	private String createDate;
	
	
	public UserDTO(String username, String email, String address) {
		super();
		this.username = username;
		this.email = email;
		this.address = address;
	}
	
	public UserDTO() {

	}

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

