//Assignment 3 of Generic
package GenericAssignments;
import java.util.*;  
public class exchangePosition {
	//defining the public static void swap(generic) method here

	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
	         
	        System.out.println(list);
	         
	        Collections.swap(list, 1, 2);
	         
	        System.out.println(list);
	    }
	}



