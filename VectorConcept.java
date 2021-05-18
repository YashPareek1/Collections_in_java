package com;

import java.util.Collections;
import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		
		//Create a vector  
        Vector<String> vec = new Vector<String>();  
        
        //Adding elements using add() method of List  .
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        vec.add(0, "Java");  
        vec.add(1, "Android");  
        
        //Adding elements using addElement() method of Vector  
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");  
        System.out.println("Elements are: "+vec); 
     
        //Check size and capacity  
        System.out.println("Size is: "+vec.size());  
        System.out.println("Default capacity is: "+vec.capacity());  
        
      //Set the new size of the vector  
        vec.setSize(10);  
        System.out.println("Elements are: "+vec); 

        //Checking if Tiger is present or not in this vector    .     
        if(vec.contains("Tiger"))  
        {  
           System.out.println("Tiger is present at the index " +vec.indexOf("Tiger"));  
        }  
        else  
        {  
           System.out.println("Tiger is not present in the list.");  
        }  
        
        //Get the first element  
        System.out.println("The first animal of the vector is = "+vec.firstElement());   
        
        //Get the last element  
        System.out.println("The last animal of the vector is = "+vec.lastElement());   
        
        
        //use remove() method to delete the first occurence of an element  
       // System.out.println("Remove first occourence of element 200: "+vec.remove((Integer)200));  
        
        //Sorting the vector  
       // Collections.sort(vec);  integer value
        
        //Display the vector elements afre remove() method  .
        System.out.println("Values in vector: " +vec);  
        
        //Remove the element at index 4  
        System.out.println("Remove element at index 4: " +vec.remove(4));  
        System.out.println("New Value list in vector: " +vec);  
        
        //Remove an element  
        vec.removeElementAt(5);        
        
        //Checking vector and displays the element  
        System.out.println("Vector element after removal: " +vec);  
        
        //Get the hashcode for this vector  
        System.out.println("Hash code of this vector = "+vec.hashCode());  
        
        //Get the element at specified index  
        System.out.println("Element at index 1 is = "+vec.get(1));  
	}

}
