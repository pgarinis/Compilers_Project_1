

public class TermNode implements Node {
	private FactorNode factorNode;
	private Term2Node term2Node;
	
	public TermNode(FactorNode factorNode, Term2Node term2Node) {
		this.factorNode = factorNode;
		this.term2Node = term2Node;
	}

	@Override
	public int value() {
		if(term2Node == null)
			return factorNode.value();
		else
			return factorNode.value() & term2Node.value();
	}
}
