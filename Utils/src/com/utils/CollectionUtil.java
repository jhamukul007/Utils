package com.utils;

import java.util.Collection;
import java.util.Map;

public class CollectionUtil {
	
	public static boolean isEmpty(Collection<?> collection) {
		return isNull(collection) || isBlank(collection);
	}
	
	public static boolean isNull(Collection<?> collection) {
		return collection==null;
	}
	
	public static boolean isBlank(Collection<?> collection) {
		return collection.isEmpty();
	}
	
	public static boolean isEmpty(Map<?, ?> map) {
		return isNull(map) || isBlank(map);
	}
	
	public static boolean isNull(Map<?, ?> map) {
		return map==null;
	}
	
	public static boolean isBlank(Map<?, ?> map) {
		return map.isEmpty();
	}
	
	public static String convertToString(Collection<String> collection, String seperator) {
		String result="";
		for(String data:collection) {
			result+=seperator+data;
		}
		return result.substring(1);
	}
}
