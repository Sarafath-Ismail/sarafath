package accessspecifier;

public class Accesssmodifier {
	
	public void pub() {
		
		System.out.println("This is public method");
	}
	private void pri() {
		System.out.println("This is Private method");
	}
	void def() {
		System.out.println("This is default method");
	}
	protected void prot() {
		
		System.out.println("This is protected method");
	}
	
	public static void main(String[] args) {
		
		Accesssmodifier obj=new Accesssmodifier();
		obj.pub();
		obj.pri();
		obj.def();
		obj.prot();
		}

}
