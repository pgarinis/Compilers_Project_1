package part1;

public class Expr2Node implements Node{
	public TermNode termNode;
	public Expr2Node expr2Node;
	
	public Expr2Node(TermNode termNode2, Expr2Node expr2Node2) {
		this.termNode = termNode2;
		this.expr2Node = expr2Node2;
	}
	
	@Override
	public int value() {
		if(expr2Node == null)
			return termNode.value();
		else
			return termNode.value() ^ expr2Node.value();
	}
}
