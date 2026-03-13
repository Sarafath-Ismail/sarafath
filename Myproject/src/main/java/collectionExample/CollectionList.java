package collectionExample;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) 
	{
		List<String> li=new ArrayList<String>();
		System.out.println("Array is"+li);
		
		//add(); used add elements in the method
		li.add("RED");
		li.add("Blue");
		li.add("Blue");
		li.add("Yellow");
		li.add(null);
				System.out.println("Array list is:" +li);

		//indexOf(); to return the index of particular element.
						System.out.println("Index of Element is: " +li.indexOf("Yellow"));
		
		//lastIndexOf(); to return the last index of elements of repeated array		
						System.out.println("Last elements is: "+li.lastIndexOf("Blue"));
		//remove(); to remove the object based on index
						System.out.println("Removed object is: " +li.remove("Blue"));
						System.out.println("Removed object is: "+li.remove(3));
						System.out.println("Update list is: "+li);
		
		//get(); to retrieve the object based on index
						System.out.println("get list is: "+li.get(2));
						
		//contains(); to check whether object is present in the list [true or false]
						System.out.println("Contains list is: "+li.contains("Red"));
						System.out.println("Containfs list is 1:"+li.contains("null"));
					
		//size(); to return the length of the list
						System.out.println("Size of the list is:" +li.size());
		//isEmpty(); to check wether array list empty or not
						System.out.println("Check empty Array List is "+li.isEmpty());
						
		for (int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
			
		for (String a:li) {  //for each loop
			System.out.println(a);
		}
			
		}
			
	}

}

