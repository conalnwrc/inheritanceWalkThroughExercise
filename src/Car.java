public class Car extends Vehicle {

    private final int numberOfDoors;

    public Car(String make, String model, int year, boolean isRunning, int numberOfDoors) {

        super(make, model, year, isRunning);
        this.numberOfDoors = numberOfDoors;

    }

    @Override
    public void displayInfo() {
        System.out.println("Car Info: " + make + " " + model + " (" + year + "), Doors: " + numberOfDoors);
    }

    @Override
    public void honk() {
        System.out.println("The car honks: Beep Beep");
    }
}
