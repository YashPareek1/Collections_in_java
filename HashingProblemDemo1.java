package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;



public class HashingProblemDemo1 {
	public static void main(String args[])
	{
		HashingProblemDemo1 demo = new HashingProblemDemo1();
		
		Integer numberArray[]= {4,34,8,2,99,7,3,5,33,25,44,1,66,36,69,60};
		
		int noOfSlotes =5;
		
		Object listOfObj[] = new Object[noOfSlotes];
		
		
		for(int i=0;i<noOfSlotes;i++)
		{
			listOfObj[i]=new ArrayList<Integer>();
		}
		
		System.out.println(Arrays.toString(numberArray));
		
		
		for(int i=0;i<numberArray.length;i++)
		{
			int key=numberArray[i]%noOfSlotes;
			demo.slotData(numberArray[i],key,listOfObj[key]);
		}
		
		
		for(int i=0;i<listOfObj.length;i++)
		{
			demo.showSlotedData(listOfObj[i],i);
		}
		
	}
	
	public void slotData(int data,int key,Object listObj)
	{
		List<Integer> qobj = extracted(listObj);
		qobj.add(data);
	}

	private List<Integer> extracted(Object listObj) {
		return (List<Integer>) listObj;
	}
	
	public void showSlotedData(Object o,int key)
	{
		List<Integer> obj = extracted(o);
		System.out.print("Key no "+key+" => "); 
		obj.forEach(x->System.out.print(x+"->"));
		System.out.println();
	}

}
