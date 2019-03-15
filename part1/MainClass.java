package part1;

import java.io.IOException;
import java.util.Stack;

public class MainClass {
	//token for input and (casted) EOF
	private static char token;
	private static char EOF = (char) -1;
	private static Stack<Node> stack = new Stack<Node>(); 

	public static void main(String[] args) throws IOException{

		nextToken();
		while(true) {
			if(expr() && (token == EOF || token == '\n')) {
				System.out.println("OK! " + stack.size());
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
		//System.out.println("expr");
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
		//System.out.println("term");
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
		//factor-> (expr) | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
		//System.out.println("factor");
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
		//System.out.println("term2");
		if(token == '&') {
			nextToken();
			if(factor() && term2()) {
				Term2Node term2Node = (Term2Node) stack.pop();
				FactorNode factorNode = (FactorNode) stack.pop();
				Term2Node term2Node1 = new Term2Node('&', factorNode, term2Node);
				stack.push(term2Node1);
				return true;
			}
		}
		
		stack.push(new Term2Node('\0', null, null));
		return true;
		
	}

	private static boolean expr2() throws IOException {
		//expr2-> ^ term expr2 | e
		//System.out.println("expr2");
		if(token == '^') {
			nextToken();
			if(term() && expr2()) {
				Expr2Node expr2Node = (Expr2Node) stack.pop();
				TermNode termNode = (TermNode) stack.pop();
				Expr2Node expr2Node1 = new Expr2Node('^', termNode, expr2Node);
				stack.push(expr2Node1);
				return true;
			}
		}
		
		stack.push(new Expr2Node('\0', null, null));
		return true;
	}

	private static void nextToken() throws IOException{
		token = (char) System.in.read();
		System.out.println("Read : "+stack.size());
	}
}

////FIRST, FOLLOW sets
//private static HashMap<String, Set<Character>> FIRST = new HashMap<String, Set<Character>>();
//private static HashMap<String, Set<Character>> FOLLOW = new HashMap<String, Set<Character>>();
//FIRST.put("expr", new HashSet<>(Arrays.asList('(', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9')));
//FIRST.put("term", new HashSet<>(Arrays.asList('(', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9')));
//FIRST.put("factor", new HashSet<>(Arrays.asList('(', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9')));
//FIRST.put("expr2", new HashSet<>(Arrays.asList('^')));
//FIRST.put("term2", new HashSet<>(Arrays.asList('&')));
//
//FOLLOW.put("expr", new HashSet<>(Arrays.asList('\n', EOF)));
//FOLLOW.put("term", new HashSet<>(Arrays.asList('^', '\n', EOF)));
//FOLLOW.put("factor", new HashSet<>(Arrays.asList('&', '^', '\n', EOF)));
//FOLLOW.put("expr2", new HashSet<>(Arrays.asList('\n', EOF)));
//FOLLOW.put("term2", new HashSet<>(Arrays.asList('^', '\n', EOF)));