package ws.api.gds.tbo.ms.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import ws.api.gds.tbo.ms.model.AirLowFareSearchResultModel;
import ws.api.gds.tbo.ms.model.FlightSearchModel;
import ws.api.gds.tbo.ms.model.GdsSessionModel;
import ws.api.gds.tbo.ms.services.AuthenticationService;
import ws.api.gds.tbo.ms.services.SearchService;

@SpringBootTest
@AutoConfigureMockMvc
//@ActiveProfiles("dev")

public class FlightControllerTest {
	@Autowired
	MockMvc mockMvc;
	@Autowired
	ObjectMapper objectMapper;
	
	@Mock
	AuthenticationService authenticationService;
	@Mock
	SearchService searchService;
	
	@BeforeEach
	void setUp() throws Exception{
		Mockito.when(authenticationService.getToken(ArgumentMatchers.any(GdsSessionModel.class))).thenReturn(new String());
		Mockito.when(searchService.search(ArgumentMatchers.any(FlightSearchModel.class))).thenReturn(new AirLowFareSearchResultModel());
		
	}
	
	@Test
	public void testAuthenticationService() throws Exception{
		
		GdsSessionModel gdsSessionModel = new GdsSessionModel();
		String url = "/flight/getToken";
		String json = objectMapper.writeValueAsString(gdsSessionModel);
		RequestBuilder request = MockMvcRequestBuilders.post(url).accept(MediaType.APPLICATION_JSON).content(json)
				.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = result.getResponse();
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		
	}
	
	@Test
	public void testSearchService() throws Exception{
		
		FlightSearchModel flightSearchModel = new FlightSearchModel();
		String url = "/flight/availability";
		String json = objectMapper.writeValueAsString(flightSearchModel);
		RequestBuilder request = MockMvcRequestBuilders.post(url).accept(MediaType.APPLICATION_JSON).content(json)
				.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = result.getResponse();
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		
	}
}
