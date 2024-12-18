/**
 * 
 */
package jp.co.senrido.batch.utils;

/**
 * @author t_hirose
 *
 */
public class StringUtil {

	public static boolean isEmpty(String str) {
		if (str == null) {
			return true;
		}
		if (str.length() == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isBlank(String str) {
		if (str == null) {
			return true;
		}
		if (str.replaceAll(" ", "").replaceAll("　", "").length() == 0) {
			return true;
		}
		return false;
	}
}
