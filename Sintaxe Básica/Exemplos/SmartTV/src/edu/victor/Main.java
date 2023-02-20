package edu.victor;

public class Main {

	public static void main(String[] args) {
		//Create Objects
		SmartTV tv1 = new SmartTV();
		SmartTV tv2 = new SmartTV(true, 12, 8);
		
		//Change TV1 settings
		tv1.changeChannel(12);
		while (tv1.getVolume() > 8) {
			tv1.decreaseVolume();
		}
		
		//Print TVs settings
		System.out.println("TV1: " + tv1);
		System.out.println("TV2: " + tv2);
		
		//Print TVs hash codes
		System.out.println("\nHash Codes");
		System.out.println("TV1: " + tv1.hashCode());
		System.out.println("TV2: " + tv2.hashCode());
		
		//Print if the TV settings are equal
		boolean isEqual = tv1.equals(tv2);
		System.out.println("\nTV settings are equal: " + isEqual);
		
	}

}
