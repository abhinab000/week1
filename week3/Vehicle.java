package week3;

public abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Cars extends Vehicle {
	@Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
	@Override
	public void startEngine() {
	System.out.println("Motorcycle engine started.");
	}

	@Override
	public void stopEngine() {
	System.out.println("Motorcycle engine stopped.");
	}
}