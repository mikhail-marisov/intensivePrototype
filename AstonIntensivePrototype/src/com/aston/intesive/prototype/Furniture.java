package com.aston.intesive.prototype;

public abstract class Furniture {
	
	public String material;
	public int weight;
	
	public Furniture () {
	}
	
	public Furniture (Furniture target) {
		
		if (target != null) {
			
			this.material = target.material;
			this.weight = target.weight;
		}
	}
	
	public abstract Furniture clone ();

}
