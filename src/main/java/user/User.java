package user;

import org.springframework.data.annotation.Id;

public class User {

	@Id private String id;

	private String role;
	private String link;
	private String email;
	private String calID;
	private String activeUserLink;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCalID() {
		return calID;
	}
	public void setCalID(String calID) {
		this.calID = calID;
	}
	public String getActiveUserLink() {
		return activeUserLink;
	}
	public void setActiveUserLink(String activeUserLink) {
		this.activeUserLink = activeUserLink;
	}
	
	
	
	

}
