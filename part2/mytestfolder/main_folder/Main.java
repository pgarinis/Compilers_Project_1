public class Main {
public static String findLangType(String langName, String  y){
return ((langName.startsWith("Java"))?(("Java".startsWith(langName))?"Static":((langName.endsWith("script"))?"Dynamic" + y + "xd":"Unknown")):((langName.endsWith("script"))?"Probably Dynamic":"Unknown"));
}
public static void main(String args[]){
System.out.println(findLangType("Java", "PEPEGA"));
System.out.println(findLangType("Javascript", "PEPEGA2"));
System.out.println(findLangType("Typescript", "PEPEGA3"));
}
}

