package aisw.web.biz.board;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BoardJsonDAO {

	public List<JoyBoardVO> getJoyList() throws JsonMappingException, JsonProcessingException{
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://172.31.9.176:8080/WebProj/api/news";
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
		
		String responseBody = null;
		
		if(response.getStatusCode().is2xxSuccessful()) {
			responseBody = response.getBody();
			System.out.println(responseBody);
		}else {
			System.out.println("fail : " + response.getStatusCode());
		}
		
		List<JoyBoardVO> boardList = null;
		ObjectMapper mapper = new ObjectMapper();
		boardList = mapper.readValue(responseBody, new TypeReference<List<JoyBoardVO>>() {});
		
		return boardList;
		
	}
	
	public List<HariBoardVO> getHariList() throws JsonMappingException, JsonProcessingException{
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://172.31.9.175:8080/api/news";
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
		
		String responseBody = null;
		
		if(response.getStatusCode().is2xxSuccessful()) {
			responseBody = response.getBody();
			System.out.println(responseBody);
		}else {
			System.out.println("fail : " + response.getStatusCode());
		}
		
		List<HariBoardVO> boardList = null;
		ObjectMapper mapper = new ObjectMapper();
		boardList = mapper.readValue(responseBody, new TypeReference<List<HariBoardVO>>() {});
		
		return boardList;
		
	}
	
	public List<EziBoardVO> getEziList() throws JsonMappingException, JsonProcessingException{
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://172.31.9.171:8080/WebProj/indexAPI";
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
		
		String responseBody = null;
		
		if(response.getStatusCode().is2xxSuccessful()) {
			responseBody = response.getBody();
			System.out.println(responseBody);
		}else {
			System.out.println("fail : " + response.getStatusCode());
		}
		
		List<EziBoardVO> boardList = null;
		ObjectMapper mapper = new ObjectMapper();
		boardList = mapper.readValue(responseBody, new TypeReference<List<EziBoardVO>>() {});
		
		return boardList;
		
	}
	
}
