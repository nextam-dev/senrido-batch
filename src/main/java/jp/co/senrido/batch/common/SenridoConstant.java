/* =============================================================
5 * ご遺体管理システム
 * ファイル名：GoitaiConstant.java
 * --------------------------------------------------------------
 * 2018(C) マキノ祭典. All Rights Reserved.
 */
package jp.co.senrido.batch.common;

/**
 * 共通定数定義クラス
 *
 * @author kurokawa
 */
public class SenridoConstant {

	/**
	 * 結果コード.
	 *
	 * @author y_kawatani
	 * @version 2018/06/11
	 */
	public class ResultCd {

		/** 成功 */
		public final static String SUCCESS = "001";

		/** 業務エラー */
		public final static String BUSSINESS_ERROR = "400";

		/** システムエラー */
		public final static String SYSTEM_ERROR = "999";
	}

	// JSON結果コード（成功）
	public static final String SUCCESS = "0";
	// JSON結果コード（エラー）
	public static final String ERROR = "1";

	// 削除
	/** 削除コード：有効状態 */
	public static final Boolean DELFLG_EFFECT = false;
	/** 削除コード：削除状態 */
	public static final Boolean DELFLG_DELETE = true;

	/**
	 * コードマスタ検索DIV_CODE
	 *
	 * @author kurokawa
	 */
	public class DivCode {
		/** 和暦 */
		public static final String DEV_CODE_WAREKI = "wareki";
		/** 病歴 */
		public final static String MEDICAL_HISTORY = "medical_history";
		/** 眼の症状 */
		public final static String EYE_SYMPTOMS = "eye_symptoms";
		/** 左右 */
		public final static String SURGERY_TARGET = "surgery_target";
		/** 身体の症状*/
		public final static String BODY_SYMPTOMS = "body_symptoms";
		/** メガネトラブル */
		public final static String GLASSES_ISSUES = "glasses_issues";
		/** フレームトラブル */
		public final static String FRAME_ISSUES = "frame_issues";
		/** 眩しさを感じる */
		public final static String GLARE_SOURCES = "glare_sources";
		/** メガネの装用現状 */
		public final static String USE_GLASSES_CURRENT = "use_glasses_current";
		/** メガネの装用CL併用 */
		public final static String USE_GLASSES_WITH_CL = "use_glasses_with_cl";
		/** メガネの装用用途 */
		public final static String USE_GLASSES_PURPOSE = "use_glasses_purpose";
		/** 読書の習慣*/
		public final static String READING_HABITS = "reading_habits";
		/** 運転の習慣*/
		public final static String DRIVING_HABITS = "driving_habits";
		/** 度数用途 */
		public final static String PRESCRIPTION_STRENGTH_NAME = "prescription_strength_name";
		/** ピッチリスト（輻輳　開散　水平斜位量　上下寄せ　上下斜位量　P）*/
		public final static String PITCH_RANGE_EYE_P = "pitch_range_eye_p";
		/** ピッチリスト（NPC アイポイント） */
		public final static String PITCH_RANGE_NPC_EYEPOINT = "pitch_range_npc_eyepoint";
		/** ピッチリスト（V CV） */
		public final static String PITCH_RANGE_V_CV = "pitch_range_v_cv";
		/** ピッチリスト（S C ADD） */
		public final static String PITCH_RANGE_S_C_ADD = "pitch_range_s_c_add";
		/** ピッチリスト（AX） */
		public final static String PITCH_RANGE_AX = "pitch_range_ax";
		/** ピッチリスト（BASE） */
		public final static String PITCH_RANGE_BASE = "pitch_range_base";
		/** ピッチリスト（PD） */
		public final static String PITCH_RANGE_PD = "pitch_range_pd";
		/**オプションリスト */
		public final static String OPTION = "option";
		/** 決済方法リスト */
		public final static String DEPOSIT_KIND_CD = "deposit_kind_cd";
		/** 完成連絡方法リスト */
		public final static String COMPLETION_CONTACT = "completion_contact";
		/** PC環境リスト */
		public final static String COMPUTER_TYPE = "computer_type";
		/** ゲーム機種リスト */
		public final static String GAMING_NAME = "gaming_name";
		/** 運転間隔リスト */
		public final static String OPERATION_INTERVAL = "operation_interval";
		/** 運転免許証リスト */
		public final static String LICENSE_TYPE = "license_type";
		/** カーブ */
		public final static String CURVE = "curve";
		/** サイズ */
		public final static String SIZE = "size";
		/** 店舗 */
		public final static String SHOP_CD = "shop_cd";
		/** 性別 */
		public final static String SEX = "sex";
		/** 担当者 */
		public final static String PERSON_IN_CHARGE = "person_in_charge_cd";
		/** オートレフ */
		public final static String AUTOREF = "autoref";
		/** ホロプター */
		public final static String HOROPTER = "horopter";
	}

	/**
	 * 手術名称DIV_CODE
	 *
	 * @author kurokawa
	 */
	public class Surgery {

		public static final String CATARACT = "白内障";

		public final static String GLAUCOMA = "緑内障";

		public final static String FLOATERS = "飛蚊症";

		public final static String RETINAL_DETACHMENT = "網膜剥離";

		public final static String STRABISMUS = "斜視";

		public final static String VITREOUS_BODY = "硝子体";

		public final static String LASIK = "レーシック";

		public final static String ICL_IOL = "ICL/IOL";
	}
	
	/** 半角カンマ */
	public final static String HALF_CAMMA = ",";

	/** 全角カンマ */
	public final static String ALL_CAMMA = "、";

	/** 半角スラッシュ */
	public final static String HALF_SLASH = "/";

	/** 全角スラッシュ */
	public final static String ALL_SLASH = "／";

	/** バックスラッシュ(正規表現) */
	public final static String BACK_SLASH = "\\\\";

	/** 半角スペース */
	public final static String HALF_SPACE = " ";

	/** 全角スペース */
	public final static String ALL_SPACE = "　";

	/** クォーテーション */
	public final static String QUOTATION = "'";

	/** 波線"～" */
	public final static String FROM_TO = "～";

	/** 括弧"(" */
	public final static String OPEN_BRACKETS = "(";

	/** 閉じ括弧")" */
	public final static String CLOSE_BRACKETS = ")";

	/** 括弧"【" */
	public final static String OPEN_SQUARE_BRACKETS = "【";

	/** 閉じ括弧"】" */
	public final static String CLOSE_SQUARE_BRACKETS = "】";

	/** 空文字 */
	public final static String BLANK = "";

	/** 改行コード(CR) */
	public final static String CR = "\r";

	/** 改行コード(LF) */
	public final static String LF = "\n";

	/** 改行コード(CRLF) */
	public final static String CRLF = "\r\n";

	public class Application {
		/** プロパティファイル名 */
		public static final String PROPERTIES = "application";
		/** コンテキスト情報 */
		public static final String CONTEXT_PATH = "context.path";
		/** 環境情報 */
		public static final String KEY_PROFILES_ACTIVE = "spring.profiles.active";
		/** URL */
		public static final String KEY_URL = "system.url";
		/** メール送信元 */
		public static final String KEY_MAIL_FROM = "mail.from";
	}
	
	public class SuperSaas {
		/** API Key */
		public static final String API_KEY = "supersaas.apikey";
	}

}
