/**
 * 
 */
package jp.co.senrido.batch.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

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
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("access_token")
	private String accessToken;
	
	@JsonProperty("api_domain")
	private String apiDomain;
	
	@JsonProperty("token_type")
	private String tokenType;
	
	@JsonProperty("scope")
	private String scope;
	
	@JsonProperty("expires_in")
	private String expiresIn;
}
