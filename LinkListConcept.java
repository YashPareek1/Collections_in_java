package com;
import java.util.*;
import java.util.LinkedList;

public class LinkListConcept {
	public void main(String[] args)
	{
		 // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();

        
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        System.out.println(ll);


        //Java program to change elements in a LinkedList
        System.out.println("Initial LinkedList " + ll);
        ll.set(1, "For");
        System.out.println("Updated LinkedList " + ll);


        // Java program to iterate the elements in an LinkedList
        // Using the Get method and the for loop
        for (int i = 0; i < ll.size(); i++) 
        {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();

        // Using the for each loop
        for (String str : ll)
            System.out.print(str + " ");
        
        
        // Adding new elements in specific location
        ll.add("Last");
        ll.add("Element");
        ll.add(2, "Hello");
        ll.add(4, "End");
        System.out.println("The new List is:" + ll);
        
 
        // remove elements to the linked list
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
        
        // Clearing the list
        ll.clear();
        // Accessing the List after clearing it
        System.out.println("List after clearing all elements: " + ll);
    }
}