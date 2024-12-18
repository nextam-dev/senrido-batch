/**
 * 
 */
package jp.co.senrido.batch.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 * 日付に関するユーティリティークラス
 * </pre>
 *
 * @author T.Hirose
 * @version 1.0.0
 */
public class DateUtil {

	public final static String DATE_FORMAT_Y = "yyyy";
	public final static String DATE_FORMAT_M = "MM";
	public final static String DATE_FORMAT_D = "dd";
	public final static String DATE_FORMAT_YMD = "yyyyMMdd";
	public final static String DATE_FORMAT_YMD_SLASH = "yyyy/MM/dd";
	public final static String DATE_FORMAT_YMDHHMM_SLASH = "yyyy/MM/dd HH:mm";
	public final static String DATE_FORMAT_TIMESTAMP = "yyyyMMddHHmmss";
	public final static String DATE_FORMAT_TIMESTAMP_SLASH = "yyyy/MM/dd HH:mm:ss";


	/**
	 * 現在年月日を指定のフォーマットで取得する
	 *
	 * @return 現在年月日
	 */
	public static String getSysdateFormat(String pattern) {

		SimpleDateFormat format = new SimpleDateFormat(pattern);

		return format.format(getCurrentDate());
	}

	/**
	 * 指定した年、月
	 * における月末日付を返します。
	 *
	 * @param year 対象の年
	 * @param month 対象の月
	 * @return 月末日付
	 */
	public static int getLastDay(String year, String month) {
	    int yyyy = Integer.parseInt(year);
	    int MM = Integer.parseInt(month);
	    int dd = 1;
	    Calendar cal = Calendar.getInstance();
	    cal.set(yyyy,MM-1,dd);
	    int last = cal.getActualMaximum(Calendar.DATE);
	    return last;
	}

	/**
	 * 指定した年月日の曜日を返します。
	 *
	 * @param dt
	 * @return
	 */
	public static String getWeek(Date dt) {
		if (dt == null) {
			return null;
		}

		String year = changeFormat(dt, DATE_FORMAT_Y);
		String month = changeFormat(dt, DATE_FORMAT_M);
		String day = changeFormat(dt, DATE_FORMAT_D);

		return getWeek(year, month, day);
	}

	/**
	 * 指定した年月日の曜日を返します。
	 *
	 * @param ymd
	 * @return
	 */
	public static String getWeek(String ymd) {
		if (StringUtil.isBlank(ymd)) {
			return null;
		}

		String str = ymd.replaceAll("/", "").replaceAll("-", "");
		if (str.length() == 8) {
			return null;
		}

		String year = str.substring(0, 4);
		String month = str.substring(4, 6);
		String day = str.substring(6, 8);

		return getWeek(year, month, day);
	}

	/**
	 * 指定した年月日の曜日を返します。
	 *
	 * @param year 対象の年
	 * @param month 対象の月
	 * @param day 対象の日
	 * @return 月末日付
	 */
	public static String getWeek(String year, String month, String day) {
	    int yyyy = Integer.parseInt(year);
	    int MM = Integer.parseInt(month);
	    int dd = Integer.parseInt(day);
	    Calendar cal = Calendar.getInstance();
	    cal.set(yyyy,MM-1,dd);
	    String yobi = null;
	    switch (cal.get(Calendar.DAY_OF_WEEK)) {
	    case Calendar.SUNDAY:
		    	yobi = "日";
		    	break;
	    	case Calendar.MONDAY:
		    	yobi = "月";
		    	break;
	    	case Calendar.TUESDAY:
		    	yobi = "火";
		    	break;
	    	case Calendar.WEDNESDAY:
		    	yobi = "水";
		    	break;
	    	case Calendar.THURSDAY:
		    	yobi = "木";
		    	break;
	    	case Calendar.FRIDAY:
		    	yobi = "金";
		    	break;
	    	case Calendar.SATURDAY:
		    	yobi = "土";
		    	break;
	    }
	    return yobi;
	}

	/**
     * 指定した年月日より、
     * パラメータ渡した引数の日数分移動した日付を
     * 指定フォーマット形式で返す。
     *
     * @param dt
	 * @param count
	 * @param pattern
	 * @return
	 */
	public static String addDate(Date dt, int count, String pattern) {
		String ymd = changeFormat(dt, DATE_FORMAT_YMD_SLASH);
		return addDate(ymd, count, pattern);
	}

    /**
     * 指定した年月日（yyyy/MM/dd形式）より、
     * パラメータ渡した引数の日数分移動した日付を
     * yyyy/MM/dd形式で返す。
     *
     * @param ymd 対象の年月日（yyyy/MM/dd形式）
     * @param count 日数
     * @return 月末日付
     */
    public static String addDate(String ymd, int count, String pattern) {
        if (ymd == null || ymd.length() != 10) {
            return null;
        }
        int yyyy = Integer.parseInt(ymd.substring(0,4));
        int MM = Integer.parseInt(ymd.substring(5,7));
        int dd = Integer.parseInt(ymd.substring(8));
        Calendar cal = Calendar.getInstance();
        cal.set(yyyy,MM-1,dd);

        cal.add(Calendar.DAY_OF_MONTH, count);

        return changeFormat(cal.getTime(), pattern);
    }


	/**
	 * 現在日を java.util.Date オブジェクトTypeで取得する。
	 *
	 * @return java.util.Dateタイプの現在日
	 */
	public static Date getCurrentDate() {
		java.util.Calendar xcal = java.util.Calendar.getInstance();
		java.util.Date xday = xcal.getTime();
		return xday;
	}

	/**
	 * 区分記号で日付をフォーマットする。
	 *
	 * @param String 年月日 'yyyyMMdd'
	 * @param String 区分記号 ?
	 * @return String 'yyyy?MM?dd'
	 */
	public static String createFormatDate(String ymd, String kigou) {
		if (ymd == null) {
			return null;
		}

		String strYear = null;
		String strMonth = null;
		String strDate = null;

		strYear = ymd.substring(0, 4);
		strMonth = ymd.substring(4, 6);
		strDate = ymd.substring(6);

		return strYear + kigou + strMonth + kigou + strDate;
	}

	/**
	 * 日付Format
	 *
	 * @param date
	 * @return　ymd
	 */
	public static String changeFormat(Date date, String pattern) {
		if (date == null) {
			return null;
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		String ymd = dateFormat.format(date);

		return ymd;
	}

	/**
	 * 日付Format
	 *
	 * @param str
	 * @return pattern
	 * @exception ParseException
	 */
	public static Date changeFormatStrToDate(String str, String pattern) throws ParseException {

		if (StringUtil.isEmpty(str)) {
			return null;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.parse(str);
	}

	/**
	 * 2つの日付の差を求めます。
	 * 日付文字列 strDate1 - strDate2 が何日かを返します。
	 *
	 * @param strDate1    日付文字列 yyyy/MM/dd
	 * @param strDate2    日付文字列 yyyy/MM/dd
	 * @return    2つの日付の差
	 * @throws Throwble 日付フォーマットが不正な場合
	 */
	public static int differenceDays(String strDate1,String strDate2)
	    throws Throwable {
	    Date date1 = DateFormat.getDateInstance().parse(strDate1);
	    Date date2 = DateFormat.getDateInstance().parse(strDate2);
	    return differenceDays(date1,date2);
	}

	/**
	 * 2つの日付の差を求めます。
	 * java.util.Date 型の日付 date1 - date2 が何日かを返します。
	 *
	 * 計算方法は以下となります。
	 * 1.最初に2つの日付を long 値に変換します。
	 * 　※この long 値は 1970 年 1 月 1 日 00:00:00 GMT からの
	 * 　経過ミリ秒数となります。
	 * 2.次にその差を求めます。
	 * 3.上記の計算で出た数量を 1 日の時間で割ることで
	 * 　日付の差を求めることができます。
	 * 　※1 日 ( 24 時間) は、86,400,000 ミリ秒です。
	 *
	 * @param date1    日付 java.util.Date
	 * @param date2    日付 java.util.Date
	 * @return    2つの日付の差
	 */
	public static int differenceDays(Date date1,Date date2) {
	    long datetime1 = date1.getTime();
	    long datetime2 = date2.getTime();
	    long one_date_time = 1000 * 60 * 60 * 24;
	    long diffDays = (datetime1 - datetime2) / one_date_time;
	    return (int)diffDays;
	}

	/**
	 * 指定日より指定日分の日付情報を含んだモデルリストを作成
	 *
	 * @param sYmd
	 * @param eYmd
	 * @param pattern
	 * @return
	 */
	public static List<String> getOneWeekModelList(Date dt, int cnt, String pattern) {
		return getOneWeekModelList(changeFormat(dt, DATE_FORMAT_YMD_SLASH), cnt, pattern);
	}

	/**
	 * 指定日より指定日分の日付情報を含んだモデルリストを作成
	 *
	 * @param sYmd
	 * @param eYmd
	 * @param pattern
	 * @return
	 */
	public static List<String> getOneWeekModelList(String sYmd, int cnt, String pattern) {

		List<String> list = new ArrayList<String>();

		for (int i = 0; i <= cnt; i++) {
			String ymd = addDate(sYmd, i, pattern);
			list.add(ymd);
		}

		return list;
	}
}
