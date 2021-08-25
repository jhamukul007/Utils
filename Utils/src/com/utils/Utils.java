package com.utils;

import java.util.Stack;
import java.util.concurrent.Flow.Publisher;

public class Utils {
	public static void printArray(int[] arr) {
		System.out.print("[ ");
		for(int i: arr) {
			System.out.print(i+", ");
		}
		System.out.print("]");
	}
	
	public static void printStack(Stack<Integer> stack) {
		Stack<Integer> copyStack=null;
		if(stack!=null)
			copyStack=(Stack<Integer>)stack.clone();
		System.out.println("[ ");
		while(!copyStack.isEmpty()) {
			System.out.print(copyStack.pop()+",");
		}
		System.out.println("]");
	}
	
	public static void printMatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ,");
			}
			System.out.println();
		}
	}
	
	public Object getIns(String clazz) {
		Class<?> clzClass=null;
		try {
			clzClass=Class.forName(clazz);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			return clzClass!=null?clzClass.newInstance():null;
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
