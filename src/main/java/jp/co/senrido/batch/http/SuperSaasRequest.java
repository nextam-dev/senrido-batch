/* =============================================================
 * システム名：チャットワークタスク管理システム
 * ファイル名：ChatworkRequest.java
 * --------------------------------------------------------------
 * 2016(C) nextam.,Inc. All Rights Reserved.
 */
package jp.co.senrido.batch.http;

import java.util.List;
import java.util.Map;

import jp.co.senrido.batch.common.SenridoConstant;
import jp.co.senrido.batch.common.SenridoResources;
import jp.co.senrido.batch.dto.TCustomerDto;
import jp.co.senrido.batch.helper.HttpRequestHelper;

/**
 * SuperSaasAPI利用クラス.
 *
 * @author t_hirose
 *
 * @param <E>
 */
public class SuperSaasRequest<E> extends HttpRequestHelper<E> {

	private final String DOMAIN = "www.supersaas.com";

	public final String APIKEY = SenridoResources.getString(SenridoConstant.Application.PROPERTIES,
    		SenridoConstant.SuperSaas.API_KEY);

	public final String VERSION = "/api";

	public final String RANGE = VERSION + "/range/{scheduleId}.json?api_key=" + APIKEY;

	public final String FREE = VERSION + "/free{scheduleId}.json?api_key=" + APIKEY + "&from{fromTime}";

	public final String BOOKINGS = VERSION + "/bookings.json";
	

	/**
	 * コンストラクタ.
	 *
	 * @param clazz
	 */
	public SuperSaasRequest(Class<E> clazz) {
		super(clazz);
	}

	/**
	 * 予定一覧を取得.
	 *
	 * @param address
	 * @return
	 * @throws Throwable
	 */
	public Map<String, List<Map<String, String>>> getRange(String scheduleId) throws Throwable {
		String url = RANGE.replace("{scheduleId}", scheduleId);
		return this.http("https", DOMAIN, url)
				.param("method", "GET")
				.requestGet().getJsonMap();
	}
	
	/**
	 * 予定一覧を取得.
	 *
	 * @param address
	 * @return
	 * @throws Throwable
	 */
	public E getRangeToDto(String scheduleId) throws Throwable {
		String url = RANGE.replace("{scheduleId}", scheduleId);
		url = url + "&from=2025-01-16&to=2025-01-17";
		return this.http("https", DOMAIN, url)
				.requestGet().getJSON();
	}

	/**
	 * 空き予定を取得.
	 *
	 * @param address
	 * @return
	 * @throws Throwable
	 */
	public Map<String, List<Map<String, String>>> getFree(String scheduleId, String fromTime) throws Throwable {
		String url = RANGE.replace("{scheduleId}", scheduleId).replace("{fromTime}", fromTime);
		return this.http("https", DOMAIN, url)
				.param("method", "GET")
				.requestGet().getJsonMap();
	}

	/**
	 * 予定登録.
	 *
	 * @param address
	 * @return
	 * @throws Throwable
	 */
	public Map<String, String> postBookings(String scheduleId, String start, String finish, TCustomerDto custoemr) throws Throwable {

		return this.http("https", DOMAIN, BOOKINGS)
				.param("schedule_id", scheduleId)
				.param("api_key", APIKEY)
				.param("booking[start]", start)
				.param("booking[finish]", finish)
				.param("booking[full_name]", custoemr.getName())
				.param("booking[phone]", custoemr.getTelephone())
				.param("booking[email]", custoemr.getMail())
				.requestPost().getJsonMapSimple();
	}
}
