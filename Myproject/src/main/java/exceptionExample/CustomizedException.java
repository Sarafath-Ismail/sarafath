package exceptionExample;

public class CustomizedException {

	public static void main(String[] args) throws VoteException {
		
		int age=17;
		if(age>=18) {
			
			System.out.println("Eligible for Voting");
		}
		else
		{
			throw new VoteException("Not Eleigile for Voting");
		}
	}

}
// Exception in thread "main" exceptionExample.VoteException: Not Eleigile for Voting
// at exceptionExample.CustomizedException.main(CustomizedException.java:14)
