package collectionExample;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> ar=new HashSet<String>();
		ar.add("Look");
		ar.add("Bad");
		ar.add("Beauty");
		ar.add(null);
		ar.add("Good");
		ar.add("Bad");
		System.out.println("This is set:"+ar);
		
		//add(), addAll(), size(), contains(), containsAll(), isEmpty() can be used in the set method, get cannot use
		
		ar.remove("Bad");
		ar.clear(); //used to clear the list
		System.out.println("This is Clear method:"+ar);
		
		
		
	}

}
