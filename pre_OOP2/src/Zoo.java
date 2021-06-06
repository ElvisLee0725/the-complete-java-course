public class Zoo {
    public static void main(String[] args) {
        Animal sparrow1 = new Sparrow(1, "M", 1);
        Animal fish1 = new Fish(4, "F", 3);

        moveAnimal(sparrow1);
        moveAnimal(fish1);
    }

    // Polymorphism: Make program more dynamic
    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
