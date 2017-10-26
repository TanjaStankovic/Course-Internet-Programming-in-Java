package model;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class Kontakts {

	private ArrayList<Kontakt> kontakts= null;
	private Kontakt currentMessage = null;
	private Kontakt previousMessage = null;
	
	public Kontakts() {
		kontakts = new ArrayList<Kontakt>();
		//dio koda koji iz BD puni messages
		currentMessage = new Kontakt();
	}
	
	
	public ArrayList<Kontakt> getMessages() {
		return kontakts;
	}
	public Kontakt getCurrentMessage() {
		return currentMessage;
	}
	public Kontakt getPreviousMessage() {
		return previousMessage;
	}
	public void setMessages(ArrayList<Kontakt> kontakts) {
		this.kontakts = kontakts;
	}
	public void setCurrentMessage(Kontakt currentMessage) {
		this.currentMessage = currentMessage;
	}
	public void setPreviousMessage(Kontakt previousMessage) {
		this.previousMessage = previousMessage;
	}
	
	public String addMessage(){

		kontakts.add(0, currentMessage);
		setPreviousMessage(currentMessage);
		currentMessage = new Kontakt();
		return "index.xhtml";
	}
	
	public String cancelMessage(){
		currentMessage = new Kontakt();
		return "index.xhtml";
	}
	
	//smileys
	public void addSmiley1(){
		currentMessage.setMessage(currentMessage.getMessage() + ":)");
	}
	public void addSmiley2(){
		currentMessage.setMessage(currentMessage.getMessage() + ":P");
	}
	public void addSmiley3(){
		currentMessage.setMessage(currentMessage.getMessage() + ":]");
	}
	public void addSmiley4(){
		currentMessage.setMessage(currentMessage.getMessage() + ":D");
	}
	public void addTimeStamp(){
		Date date = new Date();
		currentMessage.setMessage(currentMessage.getMessage() + date.toString());
	}
}
