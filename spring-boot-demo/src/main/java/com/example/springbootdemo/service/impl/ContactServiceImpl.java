package com.example.springbootdemo.service.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.springbootdemo.model.Cec;
import com.example.springbootdemo.service.ContactService;
import com.example.types.ChannelType;
import com.example.types.ChannelType.Channel;
import com.example.types.Consumer;
import com.example.types.ContactDetailObj;
import com.example.types.ContactUsDetail;
import com.example.types.ContactUsDetail.EnquiryType;
import com.example.types.ContactusRequest;
import com.example.types.Identity;
import com.example.types.Limitless;

@Component
public class ContactServiceImpl implements ContactService {


	@Value("${contactus.api.url}")
	private String url;

	@Value("${contactus.api.client.id}")
	private String clientId;

	@Value("${contactus.api.client.secret}")
	private String clientSecret;

	@Override
	public boolean submitContact(Cec cec) {

		if (cec == null)
			return false;

		ContactusRequest contactusRequest = buildContactusRequest(cec);

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<ContactusRequest> entity = new HttpEntity<ContactusRequest>(contactusRequest, headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
		System.out.println("Api response"+response);
		return true;
	}

	private ContactusRequest buildContactusRequest(Cec cec) {
		ContactusRequest contactusRequest = new ContactusRequest();
		contactusRequest.setBrandCode("BC");
		contactusRequest.setCountry("IN");
		contactusRequest.setCaseComment(cec.getMessage());

		Consumer consumer = new Consumer();
		Identity identity = new Identity();
		identity.setFamilyName(cec.getName());
		consumer.setIdentity(identity);
		consumer.setIdentity(identity);
		consumer.setLanguage("En");

		ContactDetailObj cd = new ContactDetailObj();
		cd.setId("id123456");
		ChannelType ct = new ChannelType();
		ct.setChannel(Channel.EM);
		cd.setChannelType(ct);
		consumer.setContactDetail(Arrays.asList(cd));
		contactusRequest.setConsumer(consumer);

		ContactUsDetail contactUsDetail = new ContactUsDetail();
		contactUsDetail.setComment(cec.getMessage());
		contactUsDetail.setEnquiryType(EnquiryType.QUESTION);
		contactusRequest.setContactUsDetail(contactUsDetail);

		Limitless limitless = new Limitless();
		limitless.setTranscriptDetails(cec.getMessage());
		contactusRequest.setLimitless(limitless);

		return contactusRequest;
	}

}
