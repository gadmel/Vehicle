package Model;

public class Car extends Vehicle {

	public Car() {
		super();
		setCurrentVelocity(10);
	}

	@Override
	public int accelerate(double accelerationInKmHH, double timeOfLinearAccelerationInHours) {
		int newVelocity = (int) (getCurrentVelocity() + accelerationInKmHH * timeOfLinearAccelerationInHours);
		System.out.println("Acceleration of " + accelerationInKmHH + " km/h*h has been applied to the given vehicle for " + timeOfLinearAccelerationInHours + " hours so that the new velocity is " + newVelocity + " km/h.");
		return newVelocity;
	}

}
