package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList<String>();
		li.add("Hyzin");
		li.add("Elzin");
		li.add("Rumana");
		li.add("Sabba");
		li.add(null);
		System.out.println("Array list is:"+li);
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Hyzin Ismail");
		ar.add("Elzin Mustafa");
		ar.add("Rumana Alima");
		ar.add("Sabba Ismail");
		ar.add(null);
		System.out.println("Array list is:"+ar);
		
		//addAll(); to combine 2 list of arrays
		 System.out.println("Combined list is: "+li.addAll(ar));	
		 System.out.println("Updated Combined list is:" +ar);
	
		 //containsAll(); to check array present in the one list to another list
		   System.out.println("List Contains:"+ar.containsAll(li));
		   System.out.println("list contains:"+li.containsAll(ar));
		
	//iterator(); 
		  
		   Iterator<String> i=ar.iterator();
		   System.out.println("This is Iterator"+ar);
		   
		   while(i.hasNext()) {
		   System.out.println("this is hasNext:"+i.next());
		   }
		   li.remove(3);
		   System.out.println(ar);		   
	
	}	
	

}
