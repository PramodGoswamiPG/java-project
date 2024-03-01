package appusers;

public class Customer {
	 private String c_name;
	 private int c_id;
     private  String c_address;
     private long c_phoneno;
    
private Address a1;
private int zipcode;
private String state;
private String address;
private String city;
private String postoffice;

public Customer(String c_name, int c_id, String c_address, long c_phoneno, String address,String state,String city,int zipcode,String postoffice) {
	super();
	this.c_name = c_name;
	this.c_id = c_id;
	this.c_address = c_address;
	this.c_phoneno = c_phoneno;
	this.zipcode=zipcode;
	this.address=address;
	this.state=state;
	this.city=city;
	this.postoffice=postoffice;
	
	
	this.a1 = new Address(address,state,city,zipcode,postoffice);
}

public String getC_name() {
	return c_name;
}

public void setC_name(String c_name) {
	this.c_name = c_name;
}

public int getC_id() {
	return c_id;
}

public void setC_id(int c_id) {
	this.c_id = c_id;
}

public String getC_address() {
	return c_address;
}

public void setC_address(String c_address) {
	this.c_address = c_address;
}

public long getC_phoneno() {
	return c_phoneno;
}

public void setC_phoneno(long c_phoneno) {
	this.c_phoneno = c_phoneno;
}

public Address getA1() {
	return a1;
}

public void setA1(Address a1) {
	this.a1 = a1;
}

public int getZipcode() {
	return zipcode;
}

public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getPostoffice() {
	return postoffice;
}

public void setPostoffice(String postoffice) {
	this.postoffice = postoffice;
}


    
    
    
   
		
		
		
		
	}



	
	


