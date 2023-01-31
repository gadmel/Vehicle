package Model;

import Interfaces.Accelerateable;
public abstract class Vehicle implements Accelerateable {
	private int id;
	private String name;
	private int currentVelocity;

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}
}
