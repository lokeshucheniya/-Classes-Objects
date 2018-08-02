public class Time {

	private int minutes;
	private int hours;
	
	
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		if(minutes>=60)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		this.minutes = minutes;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	Time sum(Time time1,Time time2)
	{
		Time add=new Time();
		int hours=time1.getHours()+ time2.getHours();
		int minutes=time1.getMinutes()+ time2.getMinutes();
		if(minutes>60)
		{
			minutes -= 60;
			hours += 1;
		}
		else if(minutes==60)
		{
			minutes=0;
			hours +=1;
		}
		add.hours= hours;
		add.minutes= minutes;
		
		return add;
	}
	
	
}