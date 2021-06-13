public class App {
    public static void main(String[] args) {
        Human tom = new Human();
        walker(tom);
        Robot wale = new Robot();
        walker(wale);

        // Before Java 8
        walker(new Walkable() {
            @Override
            public void walk() {
                System.out.println("customized walking");
            }
        });

        // Java 8 and after -> Lambda Expression!
        walker(() -> {
            System.out.println("customized lambda walking");
            System.out.println("Keep walking");
        });

        // Type of lambda expression is "Functional Interface", an interface with just 1 abstract method
        Walkable ali = () -> {
            System.out.println("customized lambda walking");
            System.out.println("Keep walking");
        };

        walker(ali);
    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}
