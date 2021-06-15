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

        ALambdaInterface sayHello = () -> System.out.println("Hello there...");
        sayHello.someMethod();

        Calculate sum = (arg1, arg2) -> arg1 + arg2;
        System.out.println(sum.compute(4, 7));

        Calculate nonZeroDivide = (a, b) -> b == 0 ? 0 : a / b;
        System.out.println(nonZeroDivide.compute(9, 3));

        MyGeneric<String> revStr = (str) -> {
            StringBuilder sb = new StringBuilder();
            for(int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            return sb.toString();
        };
        System.out.println(revStr.work("Hello World"));

        MyGeneric<Integer> fac = (n) -> {
            int tmp = 1;
            for(int i = 1; i <= n; i++) {
                tmp *= i;
            }
            return tmp;
        };

        System.out.println(fac.work(5));
    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}

@FunctionalInterface
interface Calculate {
    public int compute(int a, int b);
}

@FunctionalInterface
interface ReverseStr {
    public String reverse(String s);
}

@FunctionalInterface
interface CalFac {
    public int factorial(int num);
}

interface MyGeneric<T> {
    public T work(T t);
}