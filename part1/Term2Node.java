package part1;

public class Term2Node implements Node{
	public Term2Node(char d, FactorNode factorNode2, Term2Node term2Node2) {
		this.c = d;
		this.factorNode = factorNode2;
		this.term2Node = term2Node2;
	}
	public char c;
	public FactorNode factorNode;
	public Term2Node term2Node;
}
