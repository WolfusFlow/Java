
//Things with strings
public class StringDemo {
	public static void main(String args[]) {
	String strOb1="First string";
	String strOb2="Second string";	
	String strOb3=strOb1+" and "+strOb2;	
	String strOb4=strOb1;
	
	System.out.println(strOb1);
	System.out.println(strOb2);
	System.out.println(strOb3);
	System.out.println();
	
	//Check methods in string class
	System.out.println("String length of strOb1 is "+strOb1.length());
	System.out.println("Char of index 4 in string strOb1: "+strOb1.charAt(4));
	System.out.println();
	
	if(strOb1.equals(strOb2))
	System.out.println("strOb1 == strOb2");
	else
		System.out.println("strOb1 != strOb2");
	
	if(strOb1.equals(strOb4))
		System.out.println("strOb1 == strOb4");
		else
			System.out.println("strOb1 != strOb4");
	System.out.println();
	
	//Arrays of string type objects
	String str[]= {"One", "Two", "Three"};
	
	for (int i=0; i<str.length; i++)
		System.out.println("str["+i+"]: "+str[i]);
	}
}
