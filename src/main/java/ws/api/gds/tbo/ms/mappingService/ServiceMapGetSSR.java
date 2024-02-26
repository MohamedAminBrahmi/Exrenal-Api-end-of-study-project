package ws.api.gds.tbo.ms.mappingService;

import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.SSRRequest;
import ws.api.gds.tbo.ms.model.AvailabilitySSRsRequest;

@Service
public class ServiceMapGetSSR {

	public SSRRequest SSR_RQ(AvailabilitySSRsRequest model) {
		SSRRequest request= new SSRRequest();
		//new field created in PricedItineraryModel
		request.setTokenId(model.getGds().getSessionId());
		request.setiPAddress("");
		request.setEndUserBrowserAgent("Mozilla/5.0(Windows NT6.1)");
		request.setResultId(model.getPricedItinerary().getResultId());
		request.setTrackingId(model.getTransactionID());
		request.setPointOfSale(model.getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).getDepartureAirportLocationCode());
		request.setRequestOrigin(model.getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).getDepartureAirportLocation());
		request.setUserData(null);
		return request;
	}

}
