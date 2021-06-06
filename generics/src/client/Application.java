package client;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc;

        ArrayList<Employee> employee1 = new ArrayList<>();
        employee1.add(new Employee());
        ArrayList<Accountant> accountant1 = new ArrayList<>();
        accountant1.add(new Accountant());
//        employee1 = accountant1;

        ArrayList<?> employee2 = new ArrayList<>();
        ArrayList<Accountant> accountant2 = new ArrayList<>();
        employee2 = accountant2;

        // Upper Bound
        ArrayList<? extends Employee> employee3 = new ArrayList<>();
        ArrayList<Accountant> accountant3 = new ArrayList<>();
        employee3 = accountant3;

        // Lower Bound
        ArrayList<? super Employee> employee4 = new ArrayList<>();
        ArrayList<Employee> accountant4 = new ArrayList<>();
        employee4 = accountant4;

        makeEmploeeWork(accountant1);
    }

    public static void makeEmploeeWork(List<? extends Employee> employees) {
        for(Employee emp : employees) {
            emp.work();
        }
    }

    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> res = new HashSet<>(set1);
        res.addAll(set2);
        return res;
    }
}
