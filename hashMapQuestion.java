package GenericAssignments;
//generic 2nd question storing key values in hashmap n printing
import java.util.*;  

public class hashMapQuestion{  
 public static void main(String args[]){  
	 
   HashMap<Integer,Double> map=new HashMap<Integer,Double>();//Creating HashMap    
   map.put(1,101.0);  //Put elements in Map  
   map.put(2,102.0);    
   map.put(3,103.0);   
   map.put(4,104.0);  
   map.put(5,105.0);    
   map.put(6,106.0);   
   map.put(7,107.0); 
   map.put(8,108.0);    
   map.put(9,109.0);   
   map.put(10,110.0); 
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  