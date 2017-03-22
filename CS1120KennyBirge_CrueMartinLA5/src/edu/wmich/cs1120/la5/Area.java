package edu.wmich.cs1120.la5;

public  class Area implements IArea{
	protected double basicEnergyCost;
	private double radiation;
	private double elevation;
	
	public double getBasicEnergyCost(){
		return this.basicEnergyCost;
	
	}
	public void setBasicEnergyCost(double basicEnergyCost){
		this.basicEnergyCost=basicEnergyCost;
	
	}
	public double getElevation(){
		return this.elevation;
	}
	public void setElevation(double elevation){
		this.elevation= elevation;
	}
	public double getRadiation(){
		return this.radiation;
	}
	public void setRadiation(double radiation){
		this.radiation= radiation;
	
	}
	public double calcConsumedEnergy(){
		return 0;
	}
	

}
