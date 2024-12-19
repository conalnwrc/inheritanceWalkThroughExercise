public class Motorcycle extends Vehicle{

    private final boolean hasSideCar;

    public Motorcycle(String make, String model, int year, boolean isRunning, boolean hasSideCar) {
        super(make, model, year, isRunning);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Info: " + make + " " + model + " (" + year + "), Has Sidecar: " + hasSideCar);
    }

    @Override
    public void honk() {
        System.out.println("The motorcycle honks: Vroom Vroom!");
    }
}
