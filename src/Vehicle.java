public abstract class Vehicle {

    protected String make;
    protected String model;
    protected int year;
    protected boolean isRunning;

    public Vehicle(String make, String model, int year, boolean isRunning) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = isRunning;
    }
//if you create a car and you extend vehicle, you have to implement these methods (i dont care how)
    public abstract void displayInfo();
    public abstract void honk();

//if you create a car, you can use my methods start and stop
    public void start() {
        if (isRunning) {
            System.out.println("The vehicle is already running");
        } else {
            isRunning = true;
            System.out.println("The vehicle has started");
        }
    }

    public void stop() {
        if (!isRunning) {
            System.out.println("The vehicle has already stopped");
        } else {
            isRunning = false;
            System.out.println("The vehicle has stopped");
        }
    }
}
