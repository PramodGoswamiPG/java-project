
package jspider.client;



public class Registration {
	
	final private static ClientSide sc=new ClientSide();	
public void submit(String name, long phoneno, String email, int age, String password)
{
	System.out.println("Regitering and submiting user data to server");
	User u1=new User(name,phoneno,email,age,password);
	sc.sendData(u1);
	
	
}


}
