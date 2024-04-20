package Stringjamu;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kk = new String("jamuna");//heap
		String n=kk;// heap
		//n = "shyamala";// string constant pool 
		kk = "python";
	//	n = "jamuna";
	//	kk = " keerthana";
System.out.println(" length is---------> "+ n.length());
/*System.out.println(n.indexOf("j"));
System.out.println(n.isBlank());
System.out.println(n.isEmpty());*/
if (kk.equals(n)) {
	System.out.println("-----------true");
	
}
else {
	System.out.println("wrong");
}
if (kk==n) {
	System.out.println("----------== -true");
	
}
else {
	System.out.println( "===wrong");
}
	}

}
