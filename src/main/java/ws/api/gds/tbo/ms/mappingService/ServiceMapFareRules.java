package ws.api.gds.tbo.ms.mappingService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.FareRulesRequest;
import ws.api.gds.tbo.ms.domain.FareRulesResponse;
import ws.api.gds.tbo.ms.model.BaggageInfoModel;
import ws.api.gds.tbo.ms.model.ErrorModel;
import ws.api.gds.tbo.ms.model.FareRuleModel;
import ws.api.gds.tbo.ms.model.FareRulesResponseModel;
import ws.api.gds.tbo.ms.model.PricedItineraryModel;
import ws.api.gds.tbo.ms.model.RuleDetailModel;


@Service
public class ServiceMapFareRules {

	public FareRulesRequest FareRulesRQ(PricedItineraryModel model) {
		FareRulesRequest request = new FareRulesRequest();
		
		request.setTokenId(model.getGdsModel().getSessionId());
		request.setIpAddress("192.168.11.92");
		request.setEndUserBrowserAgent("Mozilla/5.0(Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36");
		request.setResultId(model.getResultId());
		request.setTrackingId(model.getTransactionID());
		request.setPointOfSale(model.getOriginDestinationOptions().get(0).getFlightSegment().get(0).getDepartureAirportLocationCode());
		request.setRequestOrigin(model.getOriginDestinationOptions().get(0).getFlightSegment().get(0).getDepartureAirportLocation());
		request.setUserData(null);
		return request;
	}

	public FareRulesResponseModel FareRulesRS(FareRulesResponse responseGds, PricedItineraryModel model) {
			
		if(responseGds != null) {	
			FareRulesResponseModel response =new FareRulesResponseModel();
			
			response.setSuccess(responseGds.isSuccess());	
			System.out.println(response.getSuccess());
			if (response.getSuccess()==false) {
				
				List<ErrorModel> errors = new ArrayList<>();
				
				responseGds.getErrors().forEach(el -> {
					ErrorModel error = new ErrorModel();
					error.setCode(el.getErrorCode().toString());
					error.setMessage(el.getErrorMessage());
					errors.add(error);
				});
				response.setErrors(errors);
			
				if (response.getErrors() != null) {
					System.out.println(response.getErrors().get(0).getMessage());
 
					}else{
						System.out.println("the error list is Null !! ");
					};
				
			};
			
			if(responseGds.getFareRules()!=null || !responseGds.getFareRules().isEmpty()) {
				
				List<BaggageInfoModel> baggageInfoList = new ArrayList<>();
				List<FareRuleModel> fareRuleList = new ArrayList<>();

				responseGds.getFareRules().forEach(r -> {
					r.forEach(i -> {
						BaggageInfoModel baggageInfo=new BaggageInfoModel();
						
						FareRuleModel fareRule=new FareRuleModel();
						
						List<RuleDetailModel> ruleDetailList = new ArrayList<>();
						RuleDetailModel ruleDetail = new RuleDetailModel();
						
						
						ruleDetail.setRules(i.getFareRuleDetail());
						ruleDetailList.add(ruleDetail);
						
						
						fareRule.setRuleDetails(ruleDetailList);
						fareRule.setFareBasis(i.getFareBasisCode());
						fareRule.setAirline(i.getAirline());
						fareRuleList.add(fareRule);
						
						
						baggageInfo.setAireline(i.getAirline());
						baggageInfo.setDeparture(i.getOrigin());
						baggageInfo.setArrival(i.getDestination());
						baggageInfo.setFlightNo(i.getFlightNumber());
						baggageInfoList.add(baggageInfo);
						

						
					
						
					});
				});
				
				
				response.setBaggageInfos(baggageInfoList);
				response.setFareRules(fareRuleList);

		
			}else {
				System.out.println("fare rules array is null !!!");
			}
			return response;
		}else {
			return null;
		}
	}
		
}
