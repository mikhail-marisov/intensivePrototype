package com.aston.intesive.prototype;

public class Table extends Furniture {
	
	String Colour;
	
	public Table() {
	}
	
	public Table(Table target) {
		super(target);
		if(target != null) {
			this.Colour = target.Colour;
		}
	}

	@Override
	public Furniture clone() {
		return new Table(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Colour == null) ? 0 : Colour.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		super.equals(obj);
		Table other = (Table) obj;
		if (Colour == null) {
			if (other.Colour != null)
				return false;
		} else if (!Colour.equals(other.Colour))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Table [Colour=" + Colour + ", material=" + material + ", weight=" + weight + "]";
	}

}
