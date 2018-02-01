import java.util.ArrayList;
import java.util.Scanner;

/*
 * Author Jordan Zwart
 * 1. Ask the user how many cars they want to enter
 * 2. For each car entered, take input for the details
 * 3. Print out a table of the cars at the end
 */
public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> carLot = new ArrayList<Car>();
		//Get the user for how many cars they want to enter
		System.out.println("How many cars would you like to enter?: ");
		
		//take user input and store in variable
		int numOfCars;
		numOfCars = scan.nextInt();
		
		//for loop to take input for the details
			//prompt for make model year and price
			//get input from scanner
		for(int i = 0; i < numOfCars; i++){
			System.out.println("Enter Car #" + (i + 1) + " Make: ");
			String make = scan.next();
			System.out.println("Enter Car #" + (i + 1) + " Model: ");
			String model = scan.next();
			System.out.println("Enter Car #" + (i + 1) + " Year: ");
			int year = scan.nextInt();
			System.out.println("Enter Car #" + (i + 1) + " Price: ");
			Double price = scan.nextDouble();
			
			//calling the class Car and setting the year, make, model, price for car 1
			Car car1 = new Car(make, model, year, price);
			carLot.add(car1);			
		
		}//end of for loop
		
		//print out a table of the cars at the end 
		System.out.println("Current Inventory: ");
		//format the array with the .toString Method
		for(int i = 0; i < carLot.size(); i++){
			System.out.println(carLot.get(i).toString());
		}
		
		

	}

}
