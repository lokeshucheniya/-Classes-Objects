public class Distance {
	
	private int feet;
	private float inches;
	
	
	public int getFeet() {									//get feet value
		return feet;
	}
	
	
	public void setFeet(int feet) {							//set feet value
		this.feet = feet;
	}
	
	
	public float getInches() {								//get inches
		return inches;
	}
	
	
	public void setInches(float inches) {					//set inches
		if(inches<12.0)
			this.inches = inches;
	}

	
	public Distance addDistance(Distance D1,Distance D2) {	//add two distances
		Distance D3 = new Distance();
		D3.inches = D1.getInches() + D2.getInches();
		D3.feet = D1.getFeet() + D2.getFeet();
		if(D3.inches >= 12.0)
			{
				D3.feet += 1;
				D3.inches -= 12.0;
			}
		
		return D3;
	}
	
	
	@Override
	public String toString() {											//to string override
		return "Distance [feet=" + feet + ", inches=" + inches + "]";
	}
}