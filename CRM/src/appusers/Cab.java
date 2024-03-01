package appusers;

public class Cab {
	private String cab_number;
	private String cab_model;
	private String cab_enginetyp;
	private String cab_color;
	private String cab_drivername;
	private Location pickuplocation;
	private Location droplocation;
	
	
	public Cab(String cab_number, String cab_model, String cab_enginetyp, String cab_color, String cab_drivername,
			Location pickuplocation, Location droplocation,String longitude,String latitude,String direction, String dlongitude,String dlatitude,String ddirection) {
		
		pickuplocation =new Location(longitude,latitude,direction);
		droplocation =new  Location(dlongitude,dlatitude,ddirection);		
		
		
	
		this.cab_number = cab_number;
		this.cab_model = cab_model;
		this.cab_enginetyp = cab_enginetyp;
		this.cab_color = cab_color;
		this.cab_drivername = cab_drivername;
		this.pickuplocation = pickuplocation;
		this.droplocation = droplocation;
	}


	public String getCab_number() {
		return cab_number;
	}


	public void setCab_number(String cab_number) {
		this.cab_number = cab_number;
	}


	public String getCab_model() {
		return cab_model;
	}


	public void setCab_model(String cab_model) {
		this.cab_model = cab_model;
	}


	public String getCab_enginetyp() {
		return cab_enginetyp;
	}


	public void setCab_enginetyp(String cab_enginetyp) {
		this.cab_enginetyp = cab_enginetyp;
	}


	public String getCab_color() {
		return cab_color;
	}


	public void setCab_color(String cab_color) {
		this.cab_color = cab_color;
	}


	public String getCab_drivername() {
		return cab_drivername;
	}


	public void setCab_drivername(String cab_drivername) {
		this.cab_drivername = cab_drivername;
	}


	
	
	
	
	
	
	
}