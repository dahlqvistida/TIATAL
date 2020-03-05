package application;

import cars.*;

public class Main{
	
	public static void main(String[] args) {
		
		Cars [] cars = {new Volvo(), new BMW(), new Toyota()};
		
		for (Cars cars2 : cars) {
			
			cars2.blink();
		
			cars2.drive();
	
			cars2.honk();

			cars2.light();
			
			cars2.setDoors("This car has four doors");
			System.out.println();
			
		
			
		}
		
	}
}
