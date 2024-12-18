/**
 * 
 */
package jp.co.senrido.batch.utils;

/**
 * <pre>
 * 文字列チェックのユーティリティークラス
 * </pre>
 *
 * @author T.Hirose
 * @version 1.0.0
 */
public class StringConvertUtil {
	
	private static final char[] ZENKAKU_KATAKANA = { 'ァ', 'ア', 'ィ', 'イ', 'ゥ',
			'ウ', 'ェ', 'エ', 'ォ', 'オ', 'カ', 'ガ', 'キ', 'ギ', 'ク', 'グ', 'ケ', 'ゲ',
			'コ', 'ゴ', 'サ', 'ザ', 'シ', 'ジ', 'ス', 'ズ', 'セ', 'ゼ', 'ソ', 'ゾ', 'タ',
			'ダ', 'チ', 'ヂ', 'ッ', 'ツ', 'ヅ', 'テ', 'デ', 'ト', 'ド', 'ナ', 'ニ', 'ヌ',
			'ネ', 'ノ', 'ハ', 'バ', 'パ', 'ヒ', 'ビ', 'ピ', 'フ', 'ブ', 'プ', 'ヘ', 'ベ',
			'ペ', 'ホ', 'ボ', 'ポ', 'マ', 'ミ', 'ム', 'メ', 'モ', 'ャ', 'ヤ', 'ュ', 'ユ',
			'ョ', 'ヨ', 'ラ', 'リ', 'ル', 'レ', 'ロ', 'ヮ', 'ワ', 'ヰ', 'ヱ', 'ヲ', 'ン',
			'ヴ', 'ヵ', 'ヶ' };

	private static final String[] HANKAKU_KATAKANA = { "ｧ", "ｱ", "ｨ", "ｲ", "ｩ",
			"ｳ", "ｪ", "ｴ", "ｫ", "ｵ", "ｶ", "ｶﾞ", "ｷ", "ｷﾞ", "ｸ", "ｸﾞ", "ｹ",
			"ｹﾞ", "ｺ", "ｺﾞ", "ｻ", "ｻﾞ", "ｼ", "ｼﾞ", "ｽ", "ｽﾞ", "ｾ", "ｾﾞ", "ｿ",
			"ｿﾞ", "ﾀ", "ﾀﾞ", "ﾁ", "ﾁﾞ", "ｯ", "ﾂ", "ﾂﾞ", "ﾃ", "ﾃﾞ", "ﾄ", "ﾄﾞ",
			"ﾅ", "ﾆ", "ﾇ", "ﾈ", "ﾉ", "ﾊ", "ﾊﾞ", "ﾊﾟ", "ﾋ", "ﾋﾞ", "ﾋﾟ", "ﾌ",
			"ﾌﾞ", "ﾌﾟ", "ﾍ", "ﾍﾞ", "ﾍﾟ", "ﾎ", "ﾎﾞ", "ﾎﾟ", "ﾏ", "ﾐ", "ﾑ", "ﾒ",
			"ﾓ", "ｬ", "ﾔ", "ｭ", "ﾕ", "ｮ", "ﾖ", "ﾗ", "ﾘ", "ﾙ", "ﾚ", "ﾛ", "ﾜ",
			"ﾜ", "ｲ", "ｴ", "ｦ", "ﾝ", "ｳﾞ", "ｶ", "ｹ" };
	
	private static final char ZENKAKU_KATAKANA_FIRST_CHAR = ZENKAKU_KATAKANA[0];

	private static final char ZENKAKU_KATAKANA_LAST_CHAR = ZENKAKU_KATAKANA[ZENKAKU_KATAKANA.length - 1];

	/**
	 * NVL編集。
	 *
	 * @param value
	 *            対象文字列
	 * @return String
	 */
	public static String editNVL(String value) {
		if (value == null) {
			return "";
		} else {
			return value;
		}
	}

	/**
	 * DB登録用編集関数 値がある場合は'をつけて返す。
	 *
	 * @param value
	 *            対象文字列
	 * @return String
	 */
	public static String dbinsEdit(String value) {
		if (value == null) {
			return "NULL";
		} else {
			return "'" + value + "'";
		}
	}
	
	/**
	 * 全角カナから半角カナ変換処理.
	 * 
	 * @param c
	 * @return
	 */
	public static String zenkakuToHankaku(char c) {
		if (c >= ZENKAKU_KATAKANA_FIRST_CHAR && c <= ZENKAKU_KATAKANA_LAST_CHAR) {
			return HANKAKU_KATAKANA[c - ZENKAKU_KATAKANA_FIRST_CHAR];
		} else {
			return String.valueOf(c);
		}
	}

	/**
	 * 全角カナから半角カナ変換処理.
	 * 
	 * @param s
	 * @return
	 */
	public static String zenkakuToHankaku(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char originalChar = s.charAt(i);
			String convertedChar = zenkakuToHankaku(originalChar);
			sb.append(convertedChar);
		}
		return sb.toString();
	}

	/**
	 * 数字を二桁数字に変換する。 01、02、03 …
	 *
	 * @param i
	 * @return 二桁数字の文字列
	 */
	static public String stringValue(int i) {
		String str = "0";
		if (i < 10)
			str += String.valueOf(i);
		else
			str = String.valueOf(i);
		return str;
	}

	/**
	 * 数値加算処理
	 *
	 * @param counts
	 * @return
	 */
	public static String add(Object... counts) {
		long allCount = 0L;

		for (Object count : counts) {
			if (count == null) {
				continue;
			}

			// 数値でない場合は読み飛ばす
			if ("".equals(editNVL(count.toString()))
					|| "-".equals(editNVL(count.toString()))) {
				continue;
			}

			allCount += Long.parseLong(count.toString());
		}

		return String.valueOf(allCount);
	}

	/**
	 * 文字列変換処理.
	 *
	 * @param o
	 *            the object
	 * @return string
	 */
	public static String toString(Object o) {
		return o == null ? null : o.toString();
	}

	/**
	 * Integer変換処理.
	 *
	 * @param o
	 * @return int
	 */
	public static Integer parseIntForNull(Object o) {
		if (o == null) {
			return null;
		}
		if (StringUtil.isEmpty(o.toString())) {
			return null;
		}
		return (int) Float.parseFloat(o.toString());
	}

	/**
	 * Integer変換処理.
	 *
	 * @param o
	 * @return int
	 */
	public static int parseInt(Object o) {
		if (o == null) {
			return 0;
		}
		if (StringUtil.isEmpty(o.toString())) {
			return 0;
		}
		return (int) Float.parseFloat(o.toString());
	}

	/**
	 * Long値変換処理.
	 *
	 * @param o
	 * @return int
	 */
	public static long parseLong(Object o) {
		if (o == null) {
			return 0;
		}
		if (StringUtil.isEmpty(o.toString())) {
			return 0;
		}
		return (long) Float.parseFloat(o.toString());
	}

	/**
	 * Float変換処理.
	 *
	 * @param o
	 * @return int
	 */
	public static float parseFloat(Object o) {
		if (o == null) {
			return 0;
		}
		if (StringUtil.isEmpty(o.toString())) {
			return 0;
		}
		return Float.parseFloat(o.toString());
	}

	/**
	 * Double変換処理.
	 *
	 * @param o
	 * @return int
	 */
	public static double parseDouble(Object o) {
		if (o == null) {
			return 0;
		}
		if (StringUtil.isEmpty(o.toString())) {
			return 0;
		}
		return Double.parseDouble(o.toString());
	}

	/**
	 * Boolean変換処理.
	 *
	 * @param o
	 * @return boolean
	 */
	public static boolean parseBoolean(Object o) {
		if (o == null) {
			return false;
		}
		if (StringUtil.isEmpty(o.toString())) {
			return false;
		}
		return Boolean.parseBoolean(o.toString());
	}
}
