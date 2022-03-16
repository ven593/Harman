package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.wrapper.Characters;
import com.example.demo.wrapper.Player;


@Service
public class Services 
{
	private Player getAllAvengers()
	{
		String url = "http://www.mocky.io/v2/5ecfd5dc3200006200e3d64b";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Player> entityPlayer = restTemplate.getForEntity(url, Player.class);
		Player players = entityPlayer.getBody();
		//System.out.println(players);
		return players;
	}


	/*
	 * public Players getAllAntiHeroes() { String url =
	 * "http://www.mocky.io/v2/5ecfd630320000f1aee3d64d"; RestTemplate restTemplate
	 * = new RestTemplate(); ResponseEntity<Players> entityPlayer =
	 * restTemplate.getForEntity(url, Players.class); Players players =
	 * entityPlayer.getBody(); System.out.println(players); return players; }
	 */


	private Player getAllMutants()
	{
		String url = "http://www.mocky.io/v2/5ecfd6473200009dc1e3d64e";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Player> entityPlayer = restTemplate.getForEntity(url, Player.class);
		Player players = entityPlayer.getBody();
		//System.out.println(players);
		return players;
	}
	
	public ArrayList<Characters> getAllCharacters()
	{
		Player allAvengers = getAllAvengers();
		Player allMutants = getAllMutants();
		
		ArrayList<Characters> allCharacters = new ArrayList<>(15);
		for(Characters character: allAvengers.getCharacter())
		{
			allCharacters.add(character);
		}
		for(Characters character: allMutants.getCharacter())
		{
			allCharacters.add(character);
		}
		return allCharacters;
	}
}
