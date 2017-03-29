package edu.wmich.cs1120.la5;

public class Literal implements IExpression{
	private int value;
	/**
	 * This is a constructor that set value equal to the attribute value 
	 * @param value is an integer
	 */
	public Literal(int value){
		this.value= value;
	}
	
	/**
	 * This method returns the attribute value 
	 */
	public Integer getValue(){
		return value;
	}
}
