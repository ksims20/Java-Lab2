package edu.unca.csci202;

public class Main {

	public static void main(String[] args) {


		Person p1 = new Person("Tony",21,"123 Ridge Drive", "Male");

		System.out.println(p1);

		Car c1 = new Car(2001, "Honda", "Civic ", true);
		System.out.println(c1);
		
		

//		c1.purchase(p1);
//		try {
//			c1.use(50);
//		} catch (MotorVehicleException e) {
//
//
//			System.out.println(e.getMessage());
//		}
//		System.out.println(c1);
//
//	}

		
		Plane plane1 = new Plane(40,2015,"American");
		System.out.println(plane1);
	
	
	
	}
}
