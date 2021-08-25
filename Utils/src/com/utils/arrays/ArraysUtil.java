package com.utils.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

public class ArraysUtil {
	/*
	 * public static boolean isEmptyOrNull(T... a) {
	 * 
	 * }
	 */
	@SafeVarargs
	public static <T> List<T> asArrayList(T... a){
		return Arrays.asList(a);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> asLinkedList(T... a){
		return new LinkedList<T>(Arrays.asList(a));
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> asVector(T... a){
		return new Vector<T>(Arrays.asList(a));
	}
	
	public static <T> Stack<T> asStack(T... a){
		 Stack<T> stack=new Stack<T>();
		 stack.addAll(asArrayList(a));
		 return stack;
	}
	
	public static <T> Map<T, Integer> asIndexHashMap(T... a){
		Map<T, Integer> map=new HashMap<T, Integer>();
		for(int i=0;i<a.length;i++) 
			map.put(a[i], i);
		return map;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Map<T, Integer> asIndexLinkedHashMap(T... a){
		return new LinkedHashMap<T, Integer>(asIndexHashMap(a));
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Map<T, Integer> asIndexTreeMap(T... a){
		return new TreeMap<T, Integer>(asIndexHashMap(a));
	}
	
	public static <T> Map<T,Integer> asCountHashMap(T... a){
		return asCountMap(new HashMap<T, Integer>(), a);
	}
	
	public static <T> Map<T,Integer> asCountLinkedHashMap(T... a){
		return asCountMap(new LinkedHashMap<T, Integer>(), a);
	}
	
	private static <T> Map<T, Integer> asCountMap(Map<T, Integer> type,T... a){
		for(T data:a)
			type.put(data, type.getOrDefault(data, 0)+1);
		return type;
	}
	
}
