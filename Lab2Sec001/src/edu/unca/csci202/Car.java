package edu.unca.csci202;

public class Car extends MotorVehicle {


	private boolean isFourWheelDrive;
	private Person owner;



	public boolean isFourWheelDrive() {
		return isFourWheelDrive;
	}

	public void setFourWheelDrive(boolean isFourWheelDrive) {
		this.isFourWheelDrive = isFourWheelDrive;
	}

	public Person getOwner() {
		return owner;
	}


	public Car(int year, String make, String model, boolean fwd) {
		this.odometer = 0;
		this.owner = null;
		this.year = year;
		this.make = make;
		this.model = model;
		this.isFourWheelDrive = fwd;
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
			return "" + year + " " + make + " " + model + " has no owner. " + " fwd= " + isFourWheelDrive;
		}else {
			return "" + year + " " + make + " " + model + " is owned by " + owner.getName() + " . fwd= " + isFourWheelDrive + " has been driven: " +odometer; 	
		}

	}

}

