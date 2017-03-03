package com.causecode.controllers;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.causecode.models.Card;
import com.causecode.services.impl.CardService;

/**
 * Created by arvindkasale on 2/27/17.
 */
@RestController
@RequestMapping("/card")
public class CardController {
	
	@Autowired
	CardService service;

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public Card save(@RequestBody Card card) {
		putCardinMap(card);
		System.out.println(card);
		return card;
	}

	private void putCardinMap(Card card) {
		Map<String, Card> map = service.getMap();
		for(Entry<String, Card> entry : map.entrySet() ) {
			if(entry.getKey().contains(card.getToken())) {
				entry.setValue(card);
			}
		}
	}
}
