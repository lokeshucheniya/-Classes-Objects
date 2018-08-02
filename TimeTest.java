import java.util.*;
public class TimeTest {
	public static void main(String args[])
	{
		Time time1=new Time();
		Time time2=new Time();
		Time time=new Time();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the minutes of first time");
		int minutes1=scanner.nextInt();
		
		System.out.println("Enter the hours of first time");
		int hours1=scanner.nextInt();
		
		time1.setMinutes(minutes1);
		time1.setHours(hours1);
		
		System.out.println("Enter the minutes of second time");
		int minutes2=scanner.nextInt();
		
		System.out.println("Enter the hours of second time");
		int hours2=scanner.nextInt();
		
		time2.setMinutes(minutes2);
		time2.setHours(hours2);
		
		time=time.sum(time1,time2);
		
		System.out.println("The addidtion is " +time.getHours()+" Hours "+time.getMinutes()+" Minutes");
		
	}

}