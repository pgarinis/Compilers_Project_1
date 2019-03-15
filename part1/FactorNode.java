package part1;

public class FactorNode implements Node {
	public char c;
	public ExprNode exprNode;
	
	public FactorNode(char token, ExprNode exprNode){
		this.c = token;
		this.exprNode = exprNode;
	}
}
