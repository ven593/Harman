package com.example.demo.wrapper;

public class Characters {
	
	private String name;
	private int max_power;
	
	public Characters()
	{
		
	}

	public Characters(String name, int max_power) {
		super();
		this.name = name;
		this.max_power = max_power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMax_power() {
		return max_power;
	}

	public void setMax_power(int max_power) {
		this.max_power = max_power;
	}

	@Override
	public String toString() {
		return "Characters [name=" + name + ", max_power=" + max_power + "]";
	}

	
	
	
	

}
