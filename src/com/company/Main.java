package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i : intList) {
            System.out.println(i);
        }

        System.out.println();

        intList.forEach(item -> System.out.println(item));

        System.out.println();

        intList.add(1, 3);

        intList.forEach(item -> System.out.println(item));
    }
}
