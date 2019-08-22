package org.base.common.utils;

/**
 * 字符串工具类
 * @author Administrator
 *
 */
public class StringUtils {
	
	/**
	 * 验证字符串是否为空;</br>
	 * null return true;</br>
	 * ""、"  "	return true;</br>
	 * "AA"、"  AA  " return false;
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		
		if(str == null || str.trim().length() == 0) {
			return true;
		}
		return false;
	}
}
