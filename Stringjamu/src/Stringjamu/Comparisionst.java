package Stringjamu;

public class Comparisionst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("  JAMUNA  ammu  ");
		String s2 = new String("Jamuna");
	//	StringBuffer s2 = new StringBuffer("Jamuna");
		//System.out.println(s1.equals(s2));
		/*.out.println(s1.equalsIgnoreCase(s2));//result is base on ascii value and lexicographically it means (foolowed by dictionary)
//int jj = s1.compareTo(s2);
		int jj = s1.compareToIgnoreCase(s2);
		System.out.println(" ignore case is ------------>"+ jj);
		System.out.println(" sTARTS WITH ------------>" + " " + s1.startsWith("Ja" , 0));
		System.out.println("ends with ************* " + s1.endsWith("a"));*/
		System.out.println(s1.contentEquals(s2));// string to string and string to string buffer
		System.out.println(s1.indexOf("ammu")); 
		System.out.println(s1.indexOf("a" ,6)); 
		System.out.println(s1.lastIndexOf("ammu")); 
		System.out.println(    "charAt -------------->"+s1.charAt(2));
		System.out.println(" subString --------------"+ s1.substring(1));
		System.out.println(s1.subSequence(1, 8));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		System.out.println( " strip ==========="+s1.strip());
		System.out.println(s1.trim());
	
	
	}

}
