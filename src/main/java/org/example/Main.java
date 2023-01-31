package org.example;

import Model.Bicycle;
import Model.Car;

public class Main {
	public static void main(String[] args) {
		Car zaporozhets = new Car();
		Bicycle bycicle = new Bicycle();

		System.out.println(zaporozhets.accelerate(12959.9999, 0.000277777777)); // acceleration of 1 (m/s'2) in one second (1/60/60)
		System.out.println(bycicle.accelerate(6479.9999, 0.000277777777)); // acceleration of 0.5 (m/s'2) in one second (1/60/60)

	}
}