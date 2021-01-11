package org.test;

public class VehicleType extends VehicleService {

	public void bike() {
		System.out.println("Bikes can only be repaired");
	}

	public void car() {
		System.out.println("Cars can only be repaired");
	}

	public void carAndBike() {
		System.out.println("cars and bikes can be reapaired");
	}

	@Override
	public void emergencyService() {
		System.out.println("Emergency Services can be available");
	}

	public static void main(String[] args) {
		VehicleType v = new VehicleType();
		VehicleService s = new VehicleService();
		v.bike();
		v.car();
		v.carAndBike();
		v.emergencyService();
		s.setVendorName("J K Tyres is the vendor name");
		System.out.println(s.getVendorName());
	}

}
