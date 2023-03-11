package edu.unca.csci202;

public abstract class MotorVehicle {

	protected double odometer;
	protected String make;
	protected String model;
	protected int year;

	public double getOdometer() {
		return odometer;
	}

	public void setOdometer(double odometer) {
		this.odometer = odometer;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public abstract void purchase(Person newOwner); 

	public void use(double miles) throws MotorVehicleException {
		this.odometer+=miles;
	}



}
