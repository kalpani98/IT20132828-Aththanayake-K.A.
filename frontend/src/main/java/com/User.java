package com;

public class User {
	

	private int ID;
	private String UserName;
	private String Password;
	private String Name;
	private String EmailID;




	public User (int ID, String UserName, String Password, String Name, String EmailID
	) {

	this.ID = ID;
	this.UserName = UserName;
	this.Password= Password;
	this.Name = Name;
	this.EmailID = EmailID;

	}




	public int getID() {
		return ID;
	}


	public String getUserName() {
		return UserName;
	}


	public String getPassword() {
		return Password;
	}



	public String getName() {
		return Name;
	}


	public String getEmailID() {
		return EmailID;
	}






}
