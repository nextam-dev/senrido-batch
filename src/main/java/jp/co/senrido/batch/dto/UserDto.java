/**
 * 
 */
package jp.co.senrido.batch.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author t_hirose
 *
 */
@Component
@Data
@NoArgsConstructor
@JsonAutoDetect(getterVisibility = Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("employee_id")
	private String employeeId;

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("kana")
	private String kana;
	
	@JsonProperty("zokusei")
	private String zokusei;
	
	@JsonProperty("voice_id")
	private String voiceId;
	
	@JsonProperty("status")
	private String staus;
	
	@JsonProperty("jigyobu_cd")
	private String jigyobuCd;
	
	@JsonProperty("jigyobu_kanji")
	private String jigyobuKanji;
	
	@JsonProperty("siten_cd")
	private String sitenCd;
	
	@JsonProperty("siten_kanji")
	private String sitenKanji;
	
	@JsonProperty("Response status")
	private String responseStatus;
}
