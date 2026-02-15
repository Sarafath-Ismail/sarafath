package stringtest;

public class Stringtest {

	public static void main(String[] args) {
		// String literal
		String s="Hello ";
				
		//String new keyword
		String s1= new String ("Hey= ");
		
		//new string
		String s2="";
		
		int a=4;
		
		String s3="Java Program";
		String s4="jAVA Program";
		String s5="Java Program";
		
		String s6= new String ("Java Program");
		
		
		System.out.println(s);
		System.out.println(s1);
		
		//charaAt(); using to return the charter of the string based on the index position
		
		System.out.println(s.charAt(4));
		
		//Length method -to return the length or size of the String
		
		System.out.println(s.length());
		
		//Concat -to add the string into the new string
		
		System.out.println(s.concat(s1).concat("this is concat string"));
		
		//Contains -to check whether a charector or string is present in your string
		
		System.out.println(s.contains("Hello"));
		System.out.println(s.contains(s1));
		
		//isEmpty -to check the sting is empty or not
		System.out.println(s2.isEmpty());
		
		//Value() -to convert any datatype into string
		System.out.println(String.valueOf(a));
		
		//equals -to check wether string is equal or not
		System.out.println(s3.equals(s5));
		System.out.println(s3.equals(s4));
		
		//equalsIgnoreCase -ignores the Case 
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//equals -using new keyword
		System.out.println(s3.equals(s6));
		
		System.out.println(s3.equals(s4)); //equal is method which compares the value of the object
		System.out.println(s4==s6);
		
		System.out.println(s3==s6); //false: equal operator used to compare the object references, 
		                     //meaning it check if the 2 variable is pointing to the same memory location.
							// point to the location (heap memory & constant pool)
		
		//toUpperCase -to convert into lowercase into Uppercase 
		
	    String s7="upper case";
		System.out.println(s7.toUpperCase());
		
		//toLowerCase -to convert into uppercase to LowerCase
	    String s8="LOWER CASE";
		System.out.println(s8.toLowerCase()); 
		
		//trim method -is to remove the leading and trailing space or starting and ending spaces.
		
		String s9=" Removing   the space ";
		System.out.println(s9.trim());
		
		//subString(); -to extract the sub string from the string
		
		String s10="Exctrat the String";
		System.out.println(s10.substring(3));
		
		System.out.println(s10.substring(3,10));
		
	}


	}
	


