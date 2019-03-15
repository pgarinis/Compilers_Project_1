package part1;

public class Expr2Node implements Node{
	public Expr2Node(char c, TermNode termNode2, Expr2Node expr2Node2) {
		this.c = c;
		this.termNode = termNode2;
		this.expr2Node = expr2Node2;
	}
	public char c;
	public TermNode termNode;
	public Expr2Node expr2Node;
}
