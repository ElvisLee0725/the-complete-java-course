public class Human {
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Hi, I am " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My height is " + heightInInches);
        System.out.println("My eye color is " + eyeColor);
    }
}
