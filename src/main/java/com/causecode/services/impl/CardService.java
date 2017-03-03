package com.causecode.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.causecode.models.Card;

@Service
public class CardService {
	private Map<String, Card> map;
	
	public CardService() {
		map = new HashMap<>();
	}

	public Map<String, Card> getMap() {
		return map;
	}

	public void setMap(Map<String, Card> map) {
		this.map = map;
	}
	
	
}
