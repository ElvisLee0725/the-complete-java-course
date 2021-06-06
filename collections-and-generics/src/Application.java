import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> animals = new ArrayList();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Chicken");

        List<Vehicle> vehicles = new LinkedList();
        vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
        vehicles.add(new Vehicle("Toyota", "Camry", 15000, false));
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

//        for(Vehicle car : vehicles) {
//            System.out.println(car.toString());
//        }

        printAllElements(animals);
        printAllElements(vehicles);
    }

    public static void printAllElements(List list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
