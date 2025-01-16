package jp.co.senrido.batch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingsDto {
	String id;
	String start;
	String finish;
	@JsonProperty("resource_id")
	String resourceId;
	@JsonProperty("created_on")
	String createdOn;
	@JsonProperty("user_id")
	String userId;
	@JsonProperty("res_name")
	String resName;
	@JsonProperty("created_by")
	String createdBy;
	String price;
	String deleted;
	@JsonProperty("full_name")
	String fullName;
	String email;
	String phone;
	String mobile;
}
