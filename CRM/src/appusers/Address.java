package appusers;

public class Address {
	 private String address;
	 private String state;
	 private String city;
	 private int zipcode;
	 private String postoffice;
	 
	public Address(String address, String state, String city, int zipcode, String postoffice) {
		super();
		this.address = address;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
		this.postoffice = postoffice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getPostoffice() {
		return postoffice;
	}

	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}
	 
	 
	 
	 

}
