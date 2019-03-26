
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\041\000\002\002\003\000\002\002\004\000\002\004" +
    "\004\000\002\004\003\000\002\005\004\000\002\005\002" +
    "\000\002\003\012\000\002\003\010\000\002\017\003\000" +
    "\002\010\005\000\002\010\002\000\002\006\004\000\002" +
    "\006\005\000\002\006\003\000\002\011\004\000\002\011" +
    "\002\000\002\014\006\000\002\014\004\000\002\014\002" +
    "\000\002\007\005\000\002\007\002\000\002\013\013\000" +
    "\002\015\003\000\002\015\003\000\002\020\004\000\002" +
    "\020\010\000\002\020\006\000\002\020\003\000\002\016" +
    "\005\000\002\016\002\000\002\012\004\000\002\012\002" +
    "\000\002\021\013" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\116\000\012\002\ufffc\005\011\016\004\017\007\001" +
    "\002\000\004\013\050\001\002\000\024\002\uffe6\004\uffe6" +
    "\005\uffe6\006\uffe6\007\uffe6\014\uffe6\015\uffe6\016\uffe6\017" +
    "\uffe6\001\002\000\004\002\001\001\002\000\026\002\uffe2" +
    "\004\uffe2\005\uffe2\006\uffe2\007\uffe2\010\026\014\uffe2\015" +
    "\uffe2\016\uffe2\017\uffe2\001\002\000\004\002\046\001\002" +
    "\000\004\013\034\001\002\000\004\002\ufffe\001\002\000" +
    "\012\002\ufffc\005\011\016\016\017\007\001\002\000\012" +
    "\002\ufffc\005\011\016\004\017\007\001\002\000\004\002" +
    "\uffff\001\002\000\004\013\020\001\002\000\004\002\ufffd" +
    "\001\002\000\012\005\011\014\021\016\016\017\007\001" +
    "\002\000\026\002\uffe2\004\uffe2\005\uffe2\006\uffe2\007\uffe2" +
    "\010\026\014\uffe2\015\uffe2\016\uffe2\017\uffe2\001\002\000" +
    "\006\014\uffe4\015\023\001\002\000\010\005\011\016\016" +
    "\017\007\001\002\000\004\014\025\001\002\000\026\002" +
    "\uffe2\004\uffe2\005\uffe2\006\uffe2\007\uffe2\010\026\014\uffe2" +
    "\015\uffe2\016\uffe2\017\uffe2\001\002\000\010\005\011\016" +
    "\016\017\007\001\002\000\024\002\uffe8\004\uffe8\005\uffe8" +
    "\006\uffe8\007\uffe8\014\uffe8\015\uffe8\016\uffe8\017\uffe8\001" +
    "\002\000\024\002\uffe3\004\uffe3\005\uffe3\006\uffe3\007\uffe3" +
    "\014\uffe3\015\uffe3\016\uffe3\017\uffe3\001\002\000\006\014" +
    "\uffe4\015\023\001\002\000\004\014\uffe5\001\002\000\024" +
    "\002\uffe7\004\uffe7\005\uffe7\006\uffe7\007\uffe7\014\uffe7\015" +
    "\uffe7\016\uffe7\017\uffe7\001\002\000\010\005\011\016\016" +
    "\017\007\001\002\000\006\006\037\007\040\001\002\000" +
    "\010\005\011\016\016\017\007\001\002\000\010\005\uffea" +
    "\016\uffea\017\uffea\001\002\000\010\005\uffeb\016\uffeb\017" +
    "\uffeb\001\002\000\004\014\042\001\002\000\010\005\011" +
    "\016\016\017\007\001\002\000\004\004\044\001\002\000" +
    "\010\005\011\016\016\017\007\001\002\000\024\002\uffe1" +
    "\004\uffe1\005\uffe1\006\uffe1\007\uffe1\014\uffe1\015\uffe1\016" +
    "\uffe1\017\uffe1\001\002\000\004\002\000\001\002\000\024" +
    "\002\uffe9\004\uffe9\005\uffe9\006\uffe9\007\uffe9\014\uffe9\015" +
    "\uffe9\016\uffe9\017\uffe9\001\002\000\012\005\011\014\051" +
    "\016\053\017\007\001\002\000\016\002\uffe2\005\uffe2\010" +
    "\026\011\116\016\uffe2\017\uffe2\001\002\000\006\014\ufff7" +
    "\015\054\001\002\000\010\013\020\014\ufff9\015\ufff9\001" +
    "\002\000\004\016\114\001\002\000\004\014\056\001\002" +
    "\000\004\011\057\001\002\000\010\005\063\016\061\017" +
    "\062\001\002\000\016\004\ufff4\006\ufff4\007\ufff4\012\ufff4" +
    "\014\ufff4\015\ufff4\001\002\000\022\004\uffef\006\uffef\007" +
    "\uffef\010\uffef\012\uffef\013\101\014\uffef\015\uffef\001\002" +
    "\000\020\004\ufff2\006\ufff2\007\ufff2\010\076\012\ufff2\014" +
    "\ufff2\015\ufff2\001\002\000\004\013\066\001\002\000\004" +
    "\012\065\001\002\000\012\002\ufffb\005\ufffb\016\ufffb\017" +
    "\ufffb\001\002\000\010\005\063\016\061\017\062\001\002" +
    "\000\006\006\037\007\040\001\002\000\010\005\063\016" +
    "\061\017\062\001\002\000\004\014\072\001\002\000\010" +
    "\005\063\016\061\017\062\001\002\000\004\004\074\001" +
    "\002\000\010\005\063\016\061\017\062\001\002\000\016" +
    "\004\uffec\006\uffec\007\uffec\012\uffec\014\uffec\015\uffec\001" +
    "\002\000\010\005\063\016\061\017\062\001\002\000\016" +
    "\004\ufff6\006\ufff6\007\ufff6\012\ufff6\014\ufff6\015\ufff6\001" +
    "\002\000\016\004\ufff3\006\ufff3\007\ufff3\012\ufff3\014\ufff3" +
    "\015\ufff3\001\002\000\012\005\063\014\104\016\061\017" +
    "\062\001\002\000\020\004\ufff2\006\ufff2\007\ufff2\010\076" +
    "\012\ufff2\014\ufff2\015\ufff2\001\002\000\016\004\ufff5\006" +
    "\ufff5\007\ufff5\012\ufff5\014\ufff5\015\ufff5\001\002\000\020" +
    "\004\ufff0\006\ufff0\007\ufff0\010\ufff0\012\ufff0\014\ufff0\015" +
    "\ufff0\001\002\000\006\014\uffed\015\106\001\002\000\010" +
    "\005\063\016\061\017\062\001\002\000\004\014\110\001" +
    "\002\000\020\004\ufff1\006\ufff1\007\ufff1\010\ufff1\012\ufff1" +
    "\014\ufff1\015\ufff1\001\002\000\006\014\uffed\015\106\001" +
    "\002\000\004\014\uffee\001\002\000\006\014\ufff7\015\054" +
    "\001\002\000\006\014\ufff9\015\ufff9\001\002\000\004\014" +
    "\ufff8\001\002\000\010\005\063\016\061\017\062\001\002" +
    "\000\004\012\120\001\002\000\012\002\ufffa\005\ufffa\016" +
    "\ufffa\017\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\116\000\016\002\007\003\013\004\005\005\011\020" +
    "\012\021\004\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\012\046\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\005\016" +
    "\020\012\021\004\001\001\000\014\003\013\004\014\005" +
    "\011\020\012\021\004\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\020\021\021\004\001" +
    "\001\000\004\012\032\001\001\000\004\016\023\001\001" +
    "\000\006\020\030\021\004\001\001\000\002\001\001\000" +
    "\004\012\026\001\001\000\006\020\027\021\004\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\016\031\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\020\034" +
    "\021\004\001\001\000\004\015\035\001\001\000\006\020" +
    "\040\021\004\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\020\042\021\004\001\001\000" +
    "\002\001\001\000\006\020\044\021\004\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\017" +
    "\051\020\021\021\004\001\001\000\004\012\032\001\001" +
    "\000\004\010\054\001\001\000\002\001\001\000\004\017" +
    "\112\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\006\063\013\057\001\001\000\002\001\001\000\004\014" +
    "\101\001\001\000\004\011\076\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\006\066\013" +
    "\057\001\001\000\004\015\067\001\001\000\006\006\070" +
    "\013\057\001\001\000\002\001\001\000\006\006\072\013" +
    "\057\001\001\000\002\001\001\000\006\006\074\013\057" +
    "\001\001\000\002\001\001\000\006\006\077\013\057\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\006\104" +
    "\013\057\001\001\000\004\011\102\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\106\001\001\000\006" +
    "\006\110\013\057\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\111\001\001\000\002\001\001\000\004" +
    "\010\114\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\006\116\013\057\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return s.next_token(); 
    }


    // Connect this parser to a scanner!
    Scanner s;
    Parser(Scanner s){ this.s=s; }

    //flag is set to true when main begins
    static boolean flag = false;     


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= fun_def_list 
            {
              String RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 System.out.println("public class Main {\n"+f+"}\n"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // fun_def_list ::= fun_def fun_def_list 
            {
              String RESULT =null;
		int f1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String f1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String f2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = f1 + f2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fun_def_list",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // fun_def_list ::= main_expr_list 
            {
              String RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String m = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "\tpublic static void main(String args[]){\n" + m + "\t}\n"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fun_def_list",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // main_expr_list ::= main_expr main_expr_list 
            {
              String RESULT =null;
		int m1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int m1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String m1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int m2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int m2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String m2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "\t\tSystem.out.println("+m1+");\n" + m2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main_expr_list",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // main_expr_list ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main_expr_list",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // fun_def ::= IDENT LPAREN def_arg more1 RPAREN LBRACK fun_def_expr RBRACK 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		String m = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = "\tpublic static String "+i+"("+d+m+"){\n"+"\t\treturn "+f+";\n\t}\n"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fun_def",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // fun_def ::= IDENT LPAREN RPAREN LBRACK fun_def_expr RBRACK 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = "\tpublic static String "+i+"(){\n"+"\t\treturn "+f+";\n\t}\n"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fun_def",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // def_arg ::= IDENT 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "String " + i; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("def_arg",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // more1 ::= COMMA def_arg more1 
            {
              String RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String m = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ", " + d + m; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("more1",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // more1 ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("more1",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // fun_def_expr ::= STRING_LITERAL concat1 
            {
              String RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = s + c; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fun_def_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // fun_def_expr ::= IDENT choose concat1 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int c1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String c1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int c2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int c2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = i + c1 + c2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fun_def_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // fun_def_expr ::= if_expr 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = i; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fun_def_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // concat1 ::= PLUS fun_def_expr 
            {
              String RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = " + " + f; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("concat1",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // concat1 ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("concat1",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // choose ::= LPAREN fun_def_expr more3 RPAREN 
            {
              String RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String m = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = "("+f+m+")"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("choose",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // choose ::= LPAREN RPAREN 
            {
              String RESULT =null;
		 RESULT = "()"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("choose",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // choose ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("choose",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // more3 ::= COMMA fun_def_expr more3 
            {
              String RESULT =null;
		int m1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int m1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String m1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int m2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int m2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String m2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ", " + m1 + m2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("more3",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // more3 ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("more3",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // if_expr ::= IF LPAREN fun_def_expr fix fun_def_expr RPAREN fun_def_expr ELSE fun_def_expr 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int e3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String e3 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e4 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "(("+e2+"."+f+"("+e1+")"+")?"+e3+":"+e4+")"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if_expr",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // fix ::= SUFFIX 
            {
              String RESULT =null;
		 RESULT = "endsWith"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fix",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // fix ::= PREFIX 
            {
              String RESULT =null;
		 RESULT = "startsWith"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fix",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // main_expr ::= STRING_LITERAL concat2 
            {
              String RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = s + c; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main_expr",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // main_expr ::= IDENT LPAREN main_expr more2 RPAREN concat2 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int m1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int m1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String m1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int m2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int m2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String m2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = i +"("+m1+m2+")"+ c; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main_expr",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // main_expr ::= IDENT LPAREN RPAREN concat2 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = i + "()"+c; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main_expr",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // main_expr ::= if_expr_main 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = i; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main_expr",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // more2 ::= COMMA main_expr more2 
            {
              String RESULT =null;
		int m1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int m1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String m1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int m2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int m2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String m2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ", " + m1 + m2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("more2",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // more2 ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("more2",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // concat2 ::= PLUS main_expr 
            {
              String RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String m = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = " + " + m; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("concat2",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // concat2 ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("concat2",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // if_expr_main ::= IF LPAREN main_expr fix main_expr RPAREN main_expr ELSE main_expr 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int e3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String e3 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e4 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "(("+e2+"."+f+"("+e1+")"+")?"+e3+":"+e4+")"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if_expr_main",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
