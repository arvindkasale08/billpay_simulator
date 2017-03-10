package com.causecode.controllers;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.causecode.models.Card;
import com.causecode.models.RedirectRequest;
import com.causecode.services.impl.CardService;
import com.telstra.payments.manage.v1.managerequest.ManageReq;

/**
 * Created by arvindkasale on 2/27/17.
 */
@RestController
@RequestMapping("/card")
public class CardController {
	
	private final String baseUrl = "http://localhost:5050/store-locator/#/bill-pay/register";
	
	@Autowired
	CardService service;

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public Card save(@RequestBody Card card) {
		putCardinMap(card);
		System.out.println(card);
		return card;
	}
	
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public void redirectGET(@RequestParam String token, HttpServletResponse response) throws IOException {
		String url = getReturnUrl(token);
		String redirectUrl = baseUrl + "?token="+ token + "&url=" + url;
		//String redirectUrl = "http://www.google.com";
		System.out.println("Redirect URL is "+ redirectUrl);
		response.sendRedirect(redirectUrl);
	} 
	
	@RequestMapping(value = "/redirect", method = RequestMethod.POST)
	public void redirect(@RequestBody String token, HttpServletResponse response) throws IOException {
		token = token.split("=")[1];
		String url = getReturnUrl(token);
		String redirectUrl = baseUrl + "?token="+ token + "&url=" + url;
		System.out.println("Redirect URL is "+ redirectUrl);
		response.sendRedirect(redirectUrl);
	} 

	private void putCardinMap(Card card) {
		Map<String, Card> map = service.getMap();
		for(Entry<String, Card> entry : map.entrySet() ) {
			if(entry.getKey().contains(card.getToken())) {
				entry.setValue(card);
			}
		}
	}
	
	private String getReturnUrl(String token) {
		Map<String, Card> map = service.getMap();
		for(Entry<String, Card> entry : map.entrySet()) {
			if(entry.getKey().contains(token)) {
				return entry.getKey().split("~")[2];
			}
		}
		return null;
	}
}
