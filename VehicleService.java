package org.test;

public class VehicleService {

	private String vendorName;

	public void emergencyService() {
		System.out.println("Emergency Service");
	}

	public void plannedService(String a) {
		System.out.println("Offer is valid for long plans");
	}

	public void plannedService(String b, String c) {
		System.out.println("Offer is not valid" + "Offer not under extension");
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorNameis) {
		this.vendorName = vendorNameis;
	}
}
