package edu.wmich.cs1120.la5;

public class Addition implements IOperation {
	
	/**
	 * This method adds the left and right expressions from the binary file 
	 */
	public Integer perform(IExpression left, IExpression right) {
		return left.getValue() + right.getValue();
	}
}
