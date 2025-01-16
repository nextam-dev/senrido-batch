package jp.co.senrido.batch.service;

import org.springframework.stereotype.Service;

import jp.co.senrido.batch.dto.SuperSaasDto;
import jp.co.senrido.batch.http.SuperSaasRequest;
import net.arnx.jsonic.JSON;

@Service
public class SuperSaasService {

	public Boolean range() throws Throwable {
		SuperSaasRequest request = new SuperSaasRequest(SuperSaasDto.class);
		
		SuperSaasDto dto = (SuperSaasDto)request.getRangeToDto("755174");
		
		System.out.println(JSON.encode(dto));
		
		return true;
		
	}
}
