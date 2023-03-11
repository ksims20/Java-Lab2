package edu.unca.csci202;

public class Plane extends MotorVehicle{

	private int wingspan;
	private Person owner;
	private String airline;



	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public Person getOwner() {
		return owner;
	}


	public Plane(int wingspan, int year, String airline) {
		this.odometer = 0;
		this.owner = null;
		this.wingspan = wingspan;
		this.year = year;
		this.airline = airline;
	}


	@Override
	public void purchase(Person newOwner) {
		this.owner = newOwner;

	}

	@Override
	public void use(double miles) throws MotorVehicleException{
		if(owner != null) {
			this.odometer += miles;
		} else {
			throw new MotorVehicleException("No owner, cannot drive yet");
		}
	}

	@Override
	public String toString() {
		if(owner == null) {
			return "Wingspan in meters= " + wingspan + " year= " + year + " Airline= " + airline; 
		}else {
			return "Wingspa in meteres= " + wingspan + " year= " + year + " Airline= " + airline + " is owned by: " + owner.getName()  + " has been driven: " + odometer; 	
		}


	}



}
