package Stringjamu;

public class Mutabledemo {

		// TODO Auto-generated method stub
	public static void main(String[] args) {

//String std = new String();//these methods are same as string biulderclass
StringBuffer ss = new StringBuffer ("hi jamuan welcome to my house ");
ss.ensureCapacity(47);
 System.out.println(ss.capacity());
/*System.out.println( " after insertatio ----------"+ss.insert(2 ,'a'));
//ss.replace(0, 5, "a");
ss.reverse();
System.out.println(" after reverse ------"+ss);
System.out.println( "after replace ----------------"+ss);
String[] Class = {"first ", "second","third","fourth"};

String  s1 = "school";
for(String s:Class) {
	ss.append(s);
	System.out.println("String buffer -------"+ ss.hashCode() );
	System.out.println(ss);
	
	s1 = s1+s;
	System.out.println("string hashcode ---=----"+ s1.hashCode());
	System.out.println(s1);	
}*/

 String a = "jsamuna";
 String b= "jsamuna";


 System.out.println(a.hashCode());
 System.out.println(b.hashCode());


}

}
