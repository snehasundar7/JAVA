package org.test;

public class VehiclePayment extends VehicleService {

	public static void main(String[] args) {

		try {
			int priceReduction;
			priceReduction = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println("50 Percent offer");
		} finally {
			System.out.println("Finally is printed");
		}
		VehicleService g = new VehicleService();
		g.plannedService("a");
		g.plannedService("b", "c");
	}
}