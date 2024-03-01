package jspider.client;

//OTT platform

//java bean class

public class User {
	
	private String name;
	private long phoneno;
	private String email;
	private int age;
	private String password;
	
	public User(String name, long phoneno, String email, int age, String password) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
		this.age = age;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
