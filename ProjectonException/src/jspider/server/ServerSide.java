package jspider.server;

import jspider.client.User;

public class ServerSide {
	private static final VerifyUserAge vua=new VerifyUserAge();
	public void receiveData(User usr) throws InvalidAgeException
	{
		System.out.println("reciveing data from client");
		if(vua.validateAge(usr)!=true)
		{
			System.out.println("registration faield");
			throw new InvalidAgeException("age Should be greater than 18");
		}
		else
		{
			System.out.println("registration success");
			// code to store user object in database
		}
	}
	
	

}
