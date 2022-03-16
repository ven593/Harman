package com.example.demo.wrapper;

import java.util.Arrays;

public class Player {
	private String name;
	private Characters[] character;
	
	public Player()
	{
		
	}

	public Player(String name, Characters[] character) {
		super();
		this.name = name;
		this.character = character;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Characters[] getCharacter() {
		return character;
	}

	public void setCharacter(Characters[] character) {
		this.character = character;
	}

	@Override
	public String toString() {
		return "Players [name=" + name + ", character=" + Arrays.toString(character) + "]";
	}

	
	

}
