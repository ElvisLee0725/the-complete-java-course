public class Fish extends Animal{

    public Fish(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    public void move() {
        System.out.println("Fish swims...");
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}
