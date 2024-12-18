/**
 *
 */
package jp.co.senrido.batch.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * CSV編集用Utilクラス
 *
 * @author t.hirose
 *
 */
public class CsvUtil {

    /**
     * CSVデータ編集用処理.
     *
     * @param csvitem
     * @param items
     * @return
     */
    public static List<String> editCsvData(String csvitem, List<Map<String, Object>> items) {
        if (StringUtil.isEmpty(csvitem)) {
            return null;
        }
        if (items == null || items.size() == 0) {
            return null;
        }
        List<String> lines = new ArrayList<String>();
        String[] csvitems = csvitem.split(",");
        // 取得件数分繰り返し出力
        for(Map<String, Object> entity: items){
            //プロパティファイルに設定されているカラム分設定
            String line = "";
            for (String column: csvitems) {
                //最初の項目にはカンマは付けない
                if (!"".equals(line)) {
                    line = line + ",";
                }
                line = line + editCsv(entity.get(column));
            }

            lines.add(line);
        }

        return lines;
    }

    /**
     * CSV用ダブルコーテーション付与メソッド.
     *
     * @return String
     */
    private static String editCsv(Object obj) {
        if (obj == null || "".equals(obj)) {
            return "";
        }

        return "\"" + obj.toString() + "\"";
    }
}
