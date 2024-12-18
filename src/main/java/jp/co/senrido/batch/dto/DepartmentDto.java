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
public class DepartmentDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("department_id")
	private String departmentId;

	@JsonProperty("department_name")
	private String departmentName;
	
	@JsonProperty("parent_department_id")
	private String parentDepartmentId;
	
	@JsonProperty("parent_department_name")
	private String parentDepartmentName;
	
	@JsonProperty("Response status")
	private String staus;
}
