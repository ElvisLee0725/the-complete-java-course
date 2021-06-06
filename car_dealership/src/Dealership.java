public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setName("Elvis Lee");
        cust1.setAddress("123 Anywhere St.");
        cust1.setCashOnHand(10000);
        cust1.setCreditScore(680);

        Employee emp1 = new Employee("Jennifer Jones", "Sales Manager");

        Vehicle car1 = new Vehicle("Mazda", "Mazda6", "Sedan", 15000.0);

        Vehicle car2 = new Vehicle("Honda", "Civic", "Coupe", 9000.0);

        Vehicle car3 = new Vehicle("Ford", "Explorer", "SUV", 25000.0);

        Vehicle car4 = new Vehicle("Ford", "Explorer", "SUV", 25000.0);
        System.out.println(car3.equals(car4));
        // cust1.purchaseCar(car1, emp1, true);


    }
}
