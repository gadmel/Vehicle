package Model;

public class Car extends Vehicle {

	public Car() {
		super();
		setCurrentVelocity(10);
	}

	@Override
	public int accelerate(double kmhh) {
		System.out.println(getCurrentVelocity() * kmhh);
		return 0;
	}

}
