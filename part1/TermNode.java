package part1;

public class TermNode implements Node {
	public FactorNode factorNode;
	public Term2Node term2Node;
	
	public TermNode(FactorNode factorNode, Term2Node term2Node) {
		this.factorNode = factorNode;
		this.term2Node = term2Node;
	}
}
