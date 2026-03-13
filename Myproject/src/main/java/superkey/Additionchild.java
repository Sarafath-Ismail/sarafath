package superkey;

public class Additionchild extends Additionparent {

	public void div(int a, int b)
	
	{ 
			int result = super.sum(a,b);
			System.out.println("Sum is: "+result);	
				
						if (result % 10 == 0) {
							
							System.out.println("Sum is divisible by 10 :");
						}
						else
						{
							System.out.println("Sum is not divisible by 10 :");
						}
}
 	    public static void main(String[] args) {
		Additionchild obj=new Additionchild();
		obj.div(3,3);
		
	}

}
