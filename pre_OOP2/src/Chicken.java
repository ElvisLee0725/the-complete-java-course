public class Chicken extends Bird implements Flyable {
    public Chicken(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void move() {
        System.out.println("Chicken walks...");
    }

    public void fly() {
        System.out.println("Chicken can't fly...");
    }
}
