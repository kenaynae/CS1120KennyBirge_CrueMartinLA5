package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	/**
	 * This static method takes an operator and two values and returns a binary expression
	 * @param operator is a char either "+" or "-"
	 * @param val1 is an integer 
	 * @param val2 is an integer 
	 * @return returns a binary expression
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {
		IOperation op;
		IExpression exp1 = new Literal(val1);
		IExpression exp2 = new Literal(val2);
		if (operator == '+')
			op = new Addition();
		else
			op = new Subtraction();
		IExpression exp = new BinaryExpression(exp1, exp2, op);
		return exp;
	}
}
