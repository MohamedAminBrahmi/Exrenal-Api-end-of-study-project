package ws.api.gds.tbo.ms.openfeign.util;

import java.io.IOException;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ws.api.gds.tbo.ms.model.CommisionModelResponse;
import ws.api.gds.tbo.ms.model.CommisionRequest;




@FeignClient(value="commission",url ="${openfeign.server-url}"+"${openfeign.commission}")
public interface FeignCommissionCalculatorUtil {
	
	
	@PostMapping(value = "/calculate")
	public CommisionModelResponse commissionCalculator(@RequestBody CommisionRequest params) throws IOException ;

}
