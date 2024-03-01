package appusers;

public class Location {
	
	private String longitude;
	private String latitude;
	private String direction;
	
	
	public Location(String longitude, String latitude, String direction) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.direction = direction;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getDirection() {
		return direction;
	}


	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
	

}
