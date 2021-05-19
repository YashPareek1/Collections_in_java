package com;

import java.awt.List;
import java.util.ArrayList;

public class aaa<J> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> al =new ArrayList<Object>();  
		al.add("111");
		al.add(122);
		al.add(121);
		al.add(121);
		System.out.println(al);
		int size = al.size();
        System.out.println("Size of list = " + size);
		
		java.util.List<Object> ll =new ArrayList<Object>();  
		ll.add("sdfj");
		ll.add(1223);
		ll.add(1212);
		System.out.println(ll);
		int size1 = ll.size();
        System.out.println("Size of list = " + size1);
		
		
		
		aaa.compareto(size,size1);
		
	}

	private static void compareto(int size, int size1) {
		// TODO Auto-generated method stub
		if(size>size1)
		{
			System.out.println("list al is greater size of list is:"+ size);
        }
		else
		{
			System.out.println("list ll is greater size of list is:"+ size1);
		}
	}
		
		
	}


