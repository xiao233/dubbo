package org.base.common.utils;

/**
 * �ַ���������
 * @author Administrator
 *
 */
public class StringUtils {
	
	/**
	 * ��֤�ַ����Ƿ�Ϊ��;</br>
	 * null return true;</br>
	 * ""��"  "	return true;</br>
	 * "AA"��"  AA  " return false;
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
