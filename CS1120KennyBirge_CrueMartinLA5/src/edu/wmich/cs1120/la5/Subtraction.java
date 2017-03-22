package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {
	public Integer perform(IExpression left, IExpression right) {
		return left.getValue() - right.getValue();
	}
}
