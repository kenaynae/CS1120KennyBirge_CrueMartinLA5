package edu.wmich.cs1120.la5;

public class HighArea extends Area{
	/**
	 * This method calculates the consumed energy cost for the rover in a High Area based on the basic energy cost of the location 
	 * @return returns the double value of basicEnergyCost *4 
	 */
	public double  calcConsumedEnergy(){
		return basicEnergyCost *4;
	}

}
