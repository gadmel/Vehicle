package Model;


public class Bicycle extends Vehicle{
		 public Bicycle() {
		  super();
		  setCurrentVelocity(5);
	 }

	 @Override
	 public int accelerate(double accelerationInKmHH, double timeOfLinearAccelerationInHours) {
		  int newVelocity = (int) (getCurrentVelocity() + (accelerationInKmHH * timeOfLinearAccelerationInHours));

		  if (newVelocity > 35) {
			  System.out.println("The vehicle of type bicycle is not allowed to accelerate faster than 35km/h.");
			  System.out.println("The acceleration with the given parameters was not applied to the given vehicle.");
			  System.out.println("The current velocity of the given vehicle is " + getCurrentVelocity() + " km/h.");
			  return getCurrentVelocity();
		  } else {
			  System.out.println("Acceleration of " + accelerationInKmHH + " km/h*h has been applied to the given vehicle for " + timeOfLinearAccelerationInHours + " hours so that the new velocity is " + newVelocity + " km/h now.");
			  return newVelocity;
		  }
	 }
}
