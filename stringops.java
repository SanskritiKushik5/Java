public class Main
{
	public static void main (String[] args) {
	    String s1 = "Sanskriti";
	    String s2 = "Sans";
	    System.out.println(s1.compareTo(s2));
	    System.out.println(s2.isEmpty());
	    System.out.println(s1.toUpperCase());
	    System.out.println(s2.toLowerCase());
	    System.out.println(s1.length());
	    System.out.println(s1.substring(2));
	    
	    int a = 10;
	    String s = String.valueOf(a);
	    System.out.println(s);
	    
	    System.out.println(s2.replace('s', 'k'));
	    
	    System.out.println(s2.contains("a"));
	    
	    System.out.println(s1.equals(s2));
	    
	    System.out.println(s1.charAt(1));
	    
	    System.out.println(s1.endsWith("i"));
	    
	    System.out.println(s1.equals(s2));
	}
}
