/* =============================================================
 * システム名：チャットワークタスク管理システム
 * ファイル名：ChatworkRequest.java
 * --------------------------------------------------------------
 * 2016(C) nextam.,Inc. All Rights Reserved.
 */
package jp.co.senrido.batch.http;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.senrido.batch.dto.UserDto;
import jp.co.senrido.batch.helper.HttpRequestHelper;
import jp.co.senrido.batch.utils.StringConvertUtil;

/**
 * チャットワークAPI利用クラス.
 *
 * @author t_koga
 *
 * @param <E>
 */
public class ZohoPeopleRequest<E> extends HttpRequestHelper<E> {

	private final String DOMAIN = "accounts.zoho.com";
	
	private final String PEOPLE_DOMAIN = "people.zoho.com";

	private final String TOKEN = "/oauth/v2/token";

	private final String USER = "/people/api/forms/view127/records";

	private final String CLIENT_ID = "1000.L8TS3PWNAY78RESP4TAOH87ZV3CKUP";
	
	private final String GRANT_TYPE = "refresh_token";
	
	private final String CLIENT_SECRET = "8c3c5362a9af906ad44d05ff5254a3df09fda19cde";
	
	private final String REFRESH_TOKEN = "1000.79e563d91ba80b9fdd6ef2d9fbc54cf6.41d8de3aa622857a84cc3914b7eb7a53";

	/**
	 * コンストラクタ.
	 *
	 * @param clazz
	 */
	public ZohoPeopleRequest(Class<E> clazz) {
		super(clazz);
	}

	/**
	 * アクセストークン取得.
	 *
	 * @return
	 * @throws Throwable
	 */
	public E accessToken() throws Throwable {
		E result = this.http("https", DOMAIN, TOKEN)
				.param("client_id", CLIENT_ID)
				.param("grant_type", GRANT_TYPE)
				.param("client_secret", CLIENT_SECRET)
				.param("refresh_token", REFRESH_TOKEN)
				.requestPost().getJSON();
		return result;
	}

	/**
	 * ユーザ情報取得.
	 *
	 * @return
	 * @throws Throwable
	 */
	public List<UserDto> readUser(String accessToken, int index) throws Throwable {
		String json = this.http("https", PEOPLE_DOMAIN, USER)
				.header("Authorization", "Zoho-oauthtoken " + accessToken)
				.param("sIndex", StringConvertUtil.toString(index))
				.requestGet().getString();

		ObjectMapper mapper = new ObjectMapper();
		List<UserDto> resultList = mapper.readValue(json, new TypeReference<List<UserDto>>() {});
		return resultList;
	}
}
