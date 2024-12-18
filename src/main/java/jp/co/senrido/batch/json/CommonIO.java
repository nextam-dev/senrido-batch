/**
 * 
 */
package jp.co.senrido.batch.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author t_hirose
 *
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonIO implements Serializable {

	private static final long serialVersionUID = 1L;

	String resultCd;
	
	String message;
}
