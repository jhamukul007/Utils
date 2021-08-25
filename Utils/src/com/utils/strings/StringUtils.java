package com.utils.strings;

public class StringUtils {
	/**
	 * 
	 * @param data
	 * @return true if data is "", "  " or null else false
	 */
	public static boolean isBlank(String data) {
		return isNull(data) || trimAndLength(data)<1;
	}
	
	public static boolean isNull(String data) {
		return data==null;
	}
	
	public static int size(String data) {
		return isNull(data)?0:data.length();
	}
	
	public static int trimAndLength(String data) {
		return isNull(data)?0:size(data.trim());
	}
}
