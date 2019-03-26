

public class ExprNode implements Node{
	private TermNode termNode;
	private Expr2Node expr2Node;
	
	public ExprNode(TermNode termNode, Expr2Node expr2Node) {
		this.termNode = termNode;
		this.expr2Node = expr2Node;
	}

	@Override
	public int value() {
		if(expr2Node == null)
			return termNode.value();
		else
			return termNode.value() ^ expr2Node.value();
	}
	
}
