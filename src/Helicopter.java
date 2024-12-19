public class Helicopter extends Vehicle {

    private int altitude;

    public Helicopter(String make, String model, int year, boolean isRunning, int altitude) {
        super(make, model, year, isRunning);
        this.altitude = altitude;
    }

    @Override
    public void displayInfo() {
        System.out.println("Helicopter Info: " + make + " " + model + " (" + year + "), Altitude: " + altitude + " ft");
    }

    @Override
    public void honk() {
        System.out.println("The helicopter honks: Whoosh Whoosh!");
    }

    public void increaseAltitude(int feet) {
        altitude += feet;
        System.out.println("Helicopter altitude increase to " + altitude + " ft");
    }

    public void land() {
        if (altitude == 0) {
            System.out.println("The helicopter is already landed.");
        } else {
            altitude = 0;
            System.out.println("The helicopter has landed.");
        }
    }
}
