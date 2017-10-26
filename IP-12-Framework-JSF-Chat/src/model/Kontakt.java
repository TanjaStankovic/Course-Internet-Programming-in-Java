package model;

public class Kontakt {

	private int id = 0;
	private String userName = "";
	private String kontakt = "";
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getMessage() {
		return kontakt;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setMessage(String kontakt) {
		this.kontakt = kontakt;
	}
	
	
}
