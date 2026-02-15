package stringtest;

public class BufferandBuilder {

	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("this is String buffer");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("This is String Builder");
		System.out.println(s2);
		
		//insert(); -to insert the value within the string
		StringBuffer s3=new StringBuffer("need to insert the value");
		System.out.println(s3.insert(0, "This is, "));
		System.out.println(s3);
		
		//append() -add the new string at the last
		System.out.println(s3.append(" -is Appended")); 
		
		//replace(); -to replace the String [index value to be given
		System.out.println(s3.replace(0, 7, "Replaced,"));
		
		//delete(); -to delete the specific string
		System.out.println(s3.delete(12, 16));
		
		//reverse -to reverse the specific string
		System.out.println(s3.reverse());
		
	}

}
