package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer>set=new HashSet<Integer>() {{
			add(10);
			add(12);
			add(15);
			add(18);
	}};
	System.out.println(set);
	
	Set<Integer> set1=new HashSet<Integer>() {{
		add(20);
		add(10);
		add(12);
		add(19);
	}};
	System.out.println(set1);
	
//	set.addAll(set1);
	
	Set<Integer> intersection =new HashSet<Integer>(set);
	intersection.retainAll(set1);
	System.out.println(intersection);
	
	Set<Integer> diff=new HashSet<Integer>(set);
	diff.removeAll(set1);
	System.out.println(diff);
	
}
}