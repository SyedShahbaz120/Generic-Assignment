//Assignment 1 of generic
package GenericAssignments;
import java.util.*;

public class employee {
	
	int id,salary;
    String name,dept;
		  
		  //Employee class constructor
		  public employee(int id, String name, int salary, String dept){
		        this.id=id;
		        this.name=name;
		        this.salary=salary;
		        this.dept=dept;
		    }
		     
	public static void main(String[] args) {
		
		
		HashSet<employee> h= new HashSet();
		
		employee e1  = new employee(11, "lucas", 15000,"Accounts");
		employee e2  = new employee(12, "joe", 15000,"Accounts");
		employee e3  = new employee(13, "kevin", 20000,"IT");
		employee e4  = new employee(14, "mike", 10000,"HR");
		employee e5  = new employee(15, "will", 10000,"HR");

		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e5);
		
		for(employee e :h){
            e.displayDetails();
		}
	}
		
		
		public void displayDetails(){
	        System.out.println("{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}");
	    }

}
