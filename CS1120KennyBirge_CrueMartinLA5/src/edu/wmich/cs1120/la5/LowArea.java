package edu.wmich.cs1120.la5;

public class LowArea extends Area{
	/**
	 * This method calculates the consumed energy cost of the rover in a low area based on the basic energy cost of the location 
	 * @return returns the basicEnergyCost * 2 
	 */
	public double  calcConsumedEnergy(){
		return basicEnergyCost *2;
	}
}
