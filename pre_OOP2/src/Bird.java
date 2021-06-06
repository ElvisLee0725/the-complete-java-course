public class Bird extends Animal {
    public Bird(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings");
    }

    public void fly() {
        System.out.println("Flying...");
    }
}
