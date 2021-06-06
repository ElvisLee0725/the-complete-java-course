public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void move() {
        System.out.println("Sparrow flies...");
    }


    public void fly() {
        System.out.println("Sparrow Flying...");
    }
}
