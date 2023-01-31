package org.example;

import Model.Car;

public class Main {
	public static void main(String[] args) {
		Car zaporozhets = new Car();
		System.out.println(zaporozhets.accelerate(12959.99, 0.000277777777)); // acceleration of 1 (m/s'2) in one second (1/60/60)
	}
}