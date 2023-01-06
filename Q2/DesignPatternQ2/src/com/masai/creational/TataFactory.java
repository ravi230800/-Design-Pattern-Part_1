package com.masai.creational;

public class TataFactory implements VehicleAbstractFactory {

	private String model;
    private String regNo;
    private int makeYear;
    private String specialFeatures;
    
    
    
	public TataFactory(String model, String regNo, int makeYear, String specialFeatures) {
		super();
		this.model = model;
		this.regNo = regNo;
		this.makeYear = makeYear;
		this.specialFeatures = specialFeatures;
	}



	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Tata(model,regNo,makeYear,specialFeatures);
	}

}
