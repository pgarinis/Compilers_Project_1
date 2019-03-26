public class Main {
	public static String name(){
		return "John";
	}
	public static String surname(){
		return "Doe";
	}
	public static String fullname(String first_name, String sep, String last_name){
		return first_name + sep + last_name;
	}
	public static String repeat(String x, String y){
		return x + x + y;
	}
	public static String cond_repeat(String c, String x){
		return (("yes".startsWith(c))?((c.startsWith("yes"))?repeat(x, c):x):x);
	}
	public static String findLangType(String langName){
		return ((langName.startsWith("Java"))?(("Java".startsWith(langName))?"Static":((langName.endsWith("script"))?"Dynamic":"Unknown")):((langName.endsWith("script"))?"Probably Dynamic":"Unknown"));
	}
	public static void main(String args[]){
		System.out.println(name());
		System.out.println(surname());
		System.out.println(fullname((("XDA".startsWith("XD"))?"kappa":"pepega"), " ", surname()) + cond_repeat("yes", fullname((("XDA".startsWith("XD"))?"kappa":"pepega"), " ", surname())) + findLangType("Typescript"));
		System.out.println(surname() + cond_repeat("yes", fullname((("XDA".startsWith("XD"))?"kappa":"pepega"), " ", surname())));
		System.out.println(cond_repeat("no", "Jane"));
		System.out.println(findLangType("Java"));
		System.out.println(findLangType("Javascript"));
		System.out.println(findLangType("Typescript"));
	}
}

