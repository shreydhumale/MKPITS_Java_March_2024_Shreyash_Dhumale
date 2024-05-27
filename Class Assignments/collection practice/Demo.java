package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import assign_14_arraylist_1.Student;

public class Demo{
	public static void main(String[] args) {
//		List <Integer>list=Arrays.asList(10,20);
//		Iterator iterator=list.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		ArrayList<Integer> arrayList=new ArrayList<Integer>();
//		System.out.println(arrayList);
//		//
//		ArrayList<Integer>arrayList2=new ArrayList<Integer>()
//		{{
//			add(23);
//			add(24);
//		}};
//		Iterator iterator2=arrayList2.iterator();
//		while(iterator2.hasNext()) {
//			System.out.println(iterator2.next());
//		}
//		}
		
		//remove duplicates
//		List<Integer>list=Arrays.asList(12,12,34,45);
//		Set<Integer>set =new HashSet<Integer>(list);
//		System.out.println(set);
//		Collections.sort(list);
//		System.out.println(list);
		
		ArrayList <Student> arrayList= new ArrayList<Student>()
		{{
			add(new Student(10,"zy",12));
			add(new Student(20,"xyz",8));
			add(new Student(30,"abc",5));
			add(new Student(40,"cjjs",10));
		}};
		Collections.sort(arrayList);
		System.out.println(arrayList);a
		
		}
	}
