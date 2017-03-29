package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression{
	private IOperation op;
	private IExpression left;
	private IExpression right;
	
	/**
	 * This method is a constructor for the Binary Expression class. 
	 * The constructor sets the attributes equal to the parameters 
	 * @param left is the left expression from the binary file
	 * @param right is the right expression from the binary file
	 * @param op is the operator from the binary file
	 */
	public BinaryExpression(IExpression left, IExpression right, IOperation op){
		this.left =left;
		this.right =right;
		this.op = op;
	}
	/**
	 * This method returns the value returned by the Operation.perform method call
	 * @return the return value is the value retuned by the Operation.perfomr method called 
	 */
	public Integer getValue(){
		return op.perform(this.left, this.right);
	}

}
