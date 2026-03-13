package outsidePkg;

import accessspecifier.Accesssmodifier;

public class AccessOutsidePkg extends Accesssmodifier {
		

	public static void main(String[] args) {
		
		AccessOutsidePkg obj=new AccessOutsidePkg();
		obj.prot();
		obj.pub();
		//obj.pri(); The method def() from the type Accesssmodifier is not visible
		//obj.def(); The method def() from the type Accesssmodifier is not visible
		Accesssmodifier obj1=new Accesssmodifier();
		obj.prot();
		obj.pub();
		//obj.pri();  Access not possible for parent class object
		//obj.def();  Access not possible for parent class object
	}

}
