package com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept 
{
   
	public static void main(String[] args)
    {
		List<Integer> list2=new ArrayList<Integer>();  

		
		// check if the list is empty or not using function
		boolean ans = list2.isEmpty();
		if (ans == true)
	        System.out.println("The ArrayList is empty");
		else
			System.out.println("The ArrayList is not empty");
	  
	     //Adding element in list  
		 list2.add(21);  
		 list2.add(11);  
		 list2.add(51);  
		 list2.add(1);  
		 System.out.println(list2);

		  //Sorting the list  
		  System.out.println("sorting the list");

		  Collections.sort(list2);  
		  System.out.println(list2);
		  
		  //Traversing list through the for-each loop  
		  System.out.println("/Traversing list through the for-each loop  ");
		  for(Integer number:list2)  
		  System.out.println(number);  
		 
		  //Traversing list through Iterator 
		  System.out.println("Traversing list through Iterator");
		  Iterator itr=list2.iterator();  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }  
		  
		  	// Remove element at index 3
	        list2.remove(3);
	        // Displaying the ArrayList
	        // after deletion
	        System.out.println(list2);
	        
	        // Printing elements one by one
	        for (int i = 0; i < list2.size(); i++)
	        {
	            System.out.print(list2.get(i) + " ");
	        }
	        
	        //Removeing element in list
	        System.out.println( "Initial ArrayList " + list2);
	        list2.set(1, 222);
	        System.out.println("Updated ArrayList " + list2);
	        
	        
	        // check if the list is empty or not using function
	        ans = list2.isEmpty();
	        if (ans == true)
	            System.out.println("The ArrayList is empty");
	        else
	            System.out.println("The ArrayList is not empty");
	  
	        //checking size of array list
	        int size = list2.size();
	        System.out.println("Size of list = " + size);
	        
	        // clear function used
	        list2.clear();
	        System.out.println("Updated ArrayList " + list2);
	}
	
}


