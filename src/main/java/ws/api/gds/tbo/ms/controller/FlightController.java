package ws.api.gds.tbo.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ws.api.gds.tbo.ms.model.AirLowFareSearchResultModel;
import ws.api.gds.tbo.ms.model.AirRevalidateResponseModel;
import ws.api.gds.tbo.ms.model.AvailabilitySSRsRequest;
import ws.api.gds.tbo.ms.model.FareRulesResponseModel;
import ws.api.gds.tbo.ms.model.FlightSearchModel;
import ws.api.gds.tbo.ms.model.GdsSessionModel;
import ws.api.gds.tbo.ms.model.PricedItineraryModel;
import ws.api.gds.tbo.ms.services.AuthenticationService;
import ws.api.gds.tbo.ms.services.CheckBalanceService;
import ws.api.gds.tbo.ms.services.FareQuoteService;
import ws.api.gds.tbo.ms.services.FareRulesService;
import ws.api.gds.tbo.ms.services.GetSSRService;
import ws.api.gds.tbo.ms.services.SearchService;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	AuthenticationService authService;
	@Autowired
	SearchService searchService;
	@Autowired
	CheckBalanceService CBservice;
	@Autowired
	FareQuoteService fareQuoteService;
	@Autowired
	FareRulesService fareRulesService;
	@Autowired
	GetSSRService getSSRService;

	@PostMapping("/getToken")
	public ResponseEntity<String> authenticate(@RequestBody GdsSessionModel gds) {
		String result = authService.getToken(gds);
		if (result != null) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@PostMapping("/availability")
	public ResponseEntity<AirLowFareSearchResultModel> searchMeth(@RequestBody FlightSearchModel model) {
		AirLowFareSearchResultModel result = searchService.search(model);
		if (result != null) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@PostMapping("/checkBalance")
	public ResponseEntity<String> checkBalance(@RequestBody GdsSessionModel gds) {
		String result = CBservice.getBalance(gds);
		if (result != null) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@PostMapping("/fareQuote")
	public ResponseEntity<AirRevalidateResponseModel> fareQuoteMeth(@RequestBody PricedItineraryModel model) {
		AirRevalidateResponseModel result = fareQuoteService.fareQuote(model);
		if (result != null) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@PostMapping("/fareRules")
	public ResponseEntity<FareRulesResponseModel> fareRulesMeth(@RequestBody PricedItineraryModel model) {
		FareRulesResponseModel result = fareRulesService.fareRules(model);
		if (result != null) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@PostMapping("/getSSR")
	public ResponseEntity<Object> getSSRMeth(@RequestBody AvailabilitySSRsRequest model) {
		Object result = getSSRService.getSSR(model);
		if (result != null) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
