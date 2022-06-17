package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        LinkedList<String>listA = new LinkedList<>();
        LinkedList<String>listB = new LinkedList<>();
        LinkedList<String>listC = new LinkedList<>();
        System.out.println("Enter 5 strings for list A");
            for (int j = 0; j < 5; j++) {
                String element = scanner.next();
                listA.add(element);
            }
            System.out.println("List A -->"+listA);

        System.out.println("Enter 5 strings for list B");
            for (int k = 0; k <5 ; k++) {
                String element = scanner.next();
                listB.add(element);
            }
            System.out.println("List B -->"+listB);
            listC.addAll(listA);
            listC.add(1, listB.get(4));
            listC.add(3, listB.get(3));
            listC.add(5, listB.get(2));
            listC.add(7, listB.get(1));
            listC.add(9, listB.get(0));
        System.out.println(listC);
        Collections.sort(listC, new Comparator<String>() {
            @Override public int compare(String s1, String s2) {
                return s1.length() - s2.length(); } } );
        System.out.println(listC);
        }

}

