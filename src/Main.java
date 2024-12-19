//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create an array of Vehicle objects
        Vehicle[] vehicles = {
                new Car("Toyota", "Corolla", 2020, false, 4),
                new Motorcycle("Harley", "Sportster", 2019, false, true),
                new Helicopter("Bell", "407", 2015, false, 0)
        };
        System.out.println("start all vehicles");
        for (Vehicle v : vehicles){
            v.start();
        }

        System.out.println("\nDisplay vehicle details and honking");
        for (Vehicle v: vehicles){
            v.displayInfo(); //Calls the overridden displayInfo method
            v.honk(); // Calls the overridden honk method
        }

        for (Vehicle v: vehicles){
            if(v instanceof Helicopter helicopter){
                helicopter.increaseAltitude(500);
                helicopter.displayInfo();
                helicopter.land();
            }
        }

        System.out.println("\nStopping all vehicles...");
        for (Vehicle v : vehicles) {
            v.stop();
        }
    }
}