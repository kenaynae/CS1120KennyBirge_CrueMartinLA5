package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {
	/**
	 * This method subtracts two values
	 * 
	 * @param left the left Literal in a binary expression
	 * @param right the right literal in a binary expression
	 * @return the final value after subtraction in executed
	 */
	public Integer perform(IExpression left, IExpression right) {
		return left.getValue() - right.getValue();
	}
}
