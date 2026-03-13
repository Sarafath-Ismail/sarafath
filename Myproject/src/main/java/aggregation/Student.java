package aggregation;

public class Student {

	    String name;
	    int roll;
	    Address ref;   // Aggregation

	    Student(String name, int roll, Address ref) {
	        this.name = name;
	        this.roll = roll;
	        this.ref = ref;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll: " + roll);
	        System.out.println("City: " + ref.city);
	        System.out.println("State: " + ref.state);
	    }
	
	    public static void main(String[] args) {

	    	Address obj = new Address("USA", "Florida");
	        Student obj1 = new Student("Hyzin", 101, obj);

	        obj1.display();
	    }
	}