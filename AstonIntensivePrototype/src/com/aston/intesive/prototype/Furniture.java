package com.aston.intesive.prototype;

public abstract class Furniture {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Furniture other = (Furniture) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

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
