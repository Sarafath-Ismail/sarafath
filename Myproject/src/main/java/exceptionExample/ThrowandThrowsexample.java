package exceptionExample;

public class ThrowandThrowsexample {

	public static void main(String[] args) throws Exception {
		
		int age=17;
		
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			
			throw new Exception ("Not Eligible for Voting");
		}
			
	}

}
//custom exceptions are user defined exceptions 
// that is used to customize the exception according to user needs.
// it is also created by the programmer. 
// Eg: Invalid userName, Banking transactions etc..