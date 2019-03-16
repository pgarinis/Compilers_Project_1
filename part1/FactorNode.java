package part1;

public class FactorNode implements Node {
	private int num;
	private ExprNode exprNode;
	
	public FactorNode(char token, ExprNode exprNode){
		this.num = token - '0';
		this.exprNode = exprNode;
	}

	@Override
	public int value() {
		if(exprNode == null)
			return num;
		else
			return exprNode.value();
	}	
	
}
