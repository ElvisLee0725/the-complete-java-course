package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Container<Integer, String> container = new Container<>(12, "Hello");
        container.printContainer();

        Set<String> mySet1 = new HashSet<>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("whatever");

        Set<String> mySet2 = new HashSet<>();
        mySet2.add("first");
        mySet2.add("second");
        mySet2.add("computer");

        Set<String> finalSet = union(mySet1, mySet2);

        Iterator<String> itr = finalSet.iterator();
        while(itr.hasNext()) {
            String val = itr.next();
            System.out.println(val);
        }
    }

    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> res = new HashSet<>(set1);
        res.addAll(set2);
        return res;
    }
}
