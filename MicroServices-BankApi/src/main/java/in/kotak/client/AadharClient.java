package in.kotak.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name="MicroServices-AadharApi")
public interface AadharClient {
	@GetMapping(value="/aadharcard")
	public String getAadharCard();
}
