public class VehicleTest
{

	public static void main(String args[])
	{
		
		Vehicle [] vehicle = new Vehicle[5];
		for(int i=0;i<3;i++) {
			vehicle[i] = new Vehicle();
		}
		vehicle[3] = new Vehicle("Amit");
		vehicle[4] = new Vehicle("Ajit");
		
		
		System.out.println("Vehicld details");									//Starting each vehicle
		for(int i=0;i<5;i++) {
			vehicle[i].changeSpeed(30);
			System.out.println(vehicle[i]);
		}
		
		
		System.out.println("Stopping a vehicle");								//Stopping a vehicle
		vehicle[0].stop();
		System.out.println(vehicle[0]);
		
		
		System.out.println("Changing direction with same direction value");		//Changing direction of a vehicle and passing same degree
		vehicle[1].changeDirection(0);
		
		
		System.out.println("Changing direction with different direction value");	//Changing direction of a vehicle to different degree
		vehicle[2].changeDirection(35);
		System.out.println(vehicle[2]);
		
		
		System.out.println("Setting Owner name to Albert");						//Setting owner name of a vehicle
		vehicle[0].setOwnerName("Albert");
		System.out.println(vehicle[0]);
		
		
		System.out.println("Changing Owner name to Alfred from Albert");		//Changing owner name of a vehicle
		vehicle[0].setOwnerName("Albert");
		System.out.println(vehicle[0]);
		
		
		System.out.println("Taking a LEFT TURN");								//Taking a left turn
		vehicle[3].turnLeftRight(1);
		System.out.println(vehicle[3]);
		
		
		System.out.println("Taking a RIGHT TURN");								//Taking a right turn
		vehicle[3].turnLeftRight(0);
		
		
		System.out.println("Highest identification number is " + Vehicle.getHighestIdentificationNumber());
		

	}
}