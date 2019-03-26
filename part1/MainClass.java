

import java.io.IOException;
import java.util.Stack;

public class MainClass {
	//token will be used to read input
	private static char token;
	private static char EOF = (char) -1;
	//stack will be used to construct the parse tree
	private static Stack<Node> stack = new Stack<Node>(); 

	public static void main(String[] args) throws IOException{
//		for testing purposes
//		int [] array = {4, 4, 1, 3, 2, 8, 2, 3, 1, 3, 2, 8, 0, 6, 4, 15};
//		int i = 0;
		nextToken();
		while(true) {
			if(expr() && (token == EOF || token == '\n')) {
				ExprNode exprNode = (ExprNode)stack.pop();
				System.out.println(exprNode.value());
//				if(exprNode.value() == array[i++])
//					System.out.println(i + " OK");
//				else
//					System.out.println("ERROR");
				nextToken();
			}
			else {
				System.out.println("Parse error");
				break;
			}
		}
	}
	
	private static boolean expr() throws IOException {
		//expr -> term expr2
		if(term() && expr2()) {
			Expr2Node expr2Node = (Expr2Node) stack.pop();
			TermNode termNode = (TermNode) stack.pop();
			ExprNode exprNode = new ExprNode(termNode, expr2Node);
			stack.push(exprNode);
			return true;
		}
		return false;
	}

	private static boolean term() throws IOException {
		//term -> factor term2
		if(factor() && term2()) {
			Term2Node term2Node = (Term2Node) stack.pop();
			FactorNode factorNode = (FactorNode) stack.pop();
			TermNode termNode = new TermNode(factorNode, term2Node);
			stack.push(termNode);
			return true;
		}
		return false;
	}

	private static boolean factor() throws IOException {
		//factor-> (expr) | 0 | ... | 9
		if(token >='0' && token <='9') {
			FactorNode  factorNode= new FactorNode(token, null);
			stack.push(factorNode);
			nextToken();
			return true;
		}
		else if(token == '(') {
			nextToken();
			if(expr() && (token == ')')){
				nextToken();
				ExprNode exprNode = (ExprNode) stack.pop();
				stack.push(new FactorNode('\0', exprNode));
				return true;
			}
		}
		return false;
	}

	private static boolean term2() throws IOException {
		//term2-> & factor term2 | e
		if(token == '&') {
			nextToken();
			if(factor() && term2()) {
				Term2Node term2Node = (Term2Node) stack.pop();
				FactorNode factorNode = (FactorNode) stack.pop();
				Term2Node term2Node1 = new Term2Node(factorNode, term2Node);
				stack.push(term2Node1);
				return true;
			}
		}
		stack.push(null);
		return true;
	}

	private static boolean expr2() throws IOException {
		//expr2-> ^ term expr2 | e
		if(token == '^') {
			nextToken();
			if(term() && expr2()) {
				Expr2Node expr2Node = (Expr2Node) stack.pop();
				TermNode termNode = (TermNode) stack.pop();
				Expr2Node expr2Node1 = new Expr2Node(termNode, expr2Node);
				stack.push(expr2Node1);
				return true;
			}
		}
		stack.push(null);
		return true;
	}

	private static void nextToken() throws IOException{
		token = (char) System.in.read();
		//System.out.println("Read : "+stack.size());
	}
}

