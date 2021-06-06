package collections;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList();
        list1.add(3);
        list1.add(5);
        list1.add(9);

        List<Integer> list2 = new ArrayList();
        list2.add(9);

//        list1.addAll(list2);
//        list1.removeAll(list2);
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
