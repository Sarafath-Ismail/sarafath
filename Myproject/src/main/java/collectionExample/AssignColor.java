package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class AssignColor {

	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("White");
		ar.add("Blue");
		ar.add("Green");
		ar.add("Yellow");
		ar.add("Pink");
		ar.add("Orange");
		ar.add(null);
		System.out.println("Colors are: "+ar);
			//to retrieve the 3rd position from the Array Elements
		System.out.println("Specified Index in given array: "+ar.get(3));
			//iterating thru Given array list
		Iterator<String> i=ar.iterator();
		System.out.println("Iterats thru Array elements: "+ar);
			//to remove the third element in the Array
		ar.remove(3);
		System.out.println("Removing 3rd elemtns in the Array List: "+ar);
			//to Search an element in an Array
		System.out.println("Searhching the Element in the Array: "+ar.contains("Orange"));
	}

}
