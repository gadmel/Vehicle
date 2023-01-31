package org.example;

import Model.Bicycle;
import Model.Car;
import Model.Vehicle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Vehicle chosenVehicle =	initiateVehicle();
		System.out.println(chosenVehicle.accelerate(12959.9999, 0.000277777777)); // acceleration of 1 (m/s'2) in one second (1/60/60)
//		System.out.println(chosenVehicle.accelerate(6479.9999, 0.000277777777)); // acceleration of 0.5 (m/s'2) in one second (1/60/60)

		moveVehicle(chosenVehicle);

	}
	public static Vehicle initiateVehicle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose the vehicle: enter 'b' for bicycle or 'c' for car and press enter.");
		String input = scanner.nextLine().toLowerCase().substring(0, 1);
		boolean byBicycle = input.equals("b");
		return byBicycle ? new Bicycle() : new Car();
	}

	public static void moveVehicle(Vehicle vehicle) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Should we accelerate the vehicle or pull breaks? Enter 'Accelerate' or 'a' for acceleration or 'Break' / 'b' for pulling break.");
		String input = scanner.nextLine().toLowerCase().substring(0, 1);
		if (input.equals("a")) {
			vehicle.accelerate(12959.9999, 0.000277777777);
		} else {
			vehicle.accelerate(-12959.9999, 0.000277777777);
		}
	}


}