package com.github.zcmee.newssystem;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.zcmee.newssystem.repositories.CommentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneralTest {

    @Autowired
    private CommentRepository commentRepository;
    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private final static RestTemplate REST_TEMPLATE = new RestTemplate();


    @Test
    public void testCreateNews() throws JsonProcessingException {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("title", "Kocham wszystkie frteczki");
        requestBody.put("text", "Frykasy");
        requestBody.put("data", "parkinson");
        HttpHeaders requestHttpHeaders = new HttpHeaders();
        requestHttpHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> httpEntity = new HttpEntity<>(OBJECT_MAPPER.writeValueAsString(requestBody), requestHttpHeaders);
        Map<String, Object> apiResponse = REST_TEMPLATE.postForObject("http://localhost:8080/api/news/saveNews", httpEntity, Map.class, Collections.emptyMap());

        assertNotNull(apiResponse);
    }
}
