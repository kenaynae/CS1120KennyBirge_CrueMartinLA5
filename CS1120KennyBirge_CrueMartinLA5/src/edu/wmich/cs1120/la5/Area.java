package edu.wmich.cs1120.la5;

public  class Area implements IArea{
	protected double basicEnergyCost;
	private double radiation;
	private double elevation;
	/**
	 * This method returns the basic Energy Cost when called
	 * @return the returns the field basicEnergyCost
	 */
	public double getBasicEnergyCost(){
		return this.basicEnergyCost;
	
	}
	/**
	 * This method set the value of the field basicEnergyCost
	 */
	public void setBasicEnergyCost(double basicEnergyCost){
		this.basicEnergyCost=basicEnergyCost;
	
	}
	/**
	 * This method return the field elevation when called
	 * @return returns the double field elevation
	 */
	public double getElevation(){
		return this.elevation;
	}
	/**
	 * This method sets the passed value of elevation to the field elevation
	 */
	public void setElevation(double elevation){
		this.elevation= elevation;
	}
	/**
	 * This method returns the field radiation when called
	 * @return returns the double field radiation
	 */
	public double getRadiation(){
		return this.radiation;
	}
	/**
	 * This method sets the passed value of radiation to the field radiation
	 * 
	 */
	public void setRadiation(double radiation){
		this.radiation= radiation;
	
	}
	/**
	 * This method sets the passed value of radiation to the field radiation
	 * 
	 */
	public double calcConsumedEnergy(){
		return 0;
	}
	

}
