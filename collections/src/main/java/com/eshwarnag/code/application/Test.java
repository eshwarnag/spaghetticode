package com.eshwarnag.code.application;

import com.eshwarnag.code.collections.structures.UberArray;

public class Test {
    public static void main(String[] args) {
        UberArray piggyArray = new UberArray();
        System.out.println("Capacity : " + piggyArray.capacity() + " ; " + "Number Of Elements : " + piggyArray.numberOfElements());
        piggyArray.add(11);
        System.out.println("Capacity : " + piggyArray.capacity() + " ; " + "Number Of Elements : " + piggyArray.numberOfElements());
        piggyArray.add("ESHU");
        System.out.println("Capacity : " + piggyArray.capacity() + " ; " + "Number Of Elements : " + piggyArray.numberOfElements());
        piggyArray.add(11);
        System.out.println("Capacity : " + piggyArray.capacity() + " ; " + "Number Of Elements : " + piggyArray.numberOfElements());
        piggyArray.add("NAG");
        System.out.println("Capacity : " + piggyArray.capacity() + " ; " + "Number Of Elements : " + piggyArray.numberOfElements());
        piggyArray.add(7);
        System.out.println("Capacity : " + piggyArray.capacity() + " ; " + "Number Of Elements : " + piggyArray.numberOfElements());


        piggyArray.add("HARI");
        System.out.println("Capacity : " + piggyArray.capacity() + " ; " + "Number Of Elements : " + piggyArray.numberOfElements());
        piggyArray.print();
        piggyArray.remove(2);
        piggyArray.print();
        System.out.println("Capacity : " + piggyArray.capacity() + " ; " + "Number Of Elements : " + piggyArray.numberOfElements());

        piggyArray.optimize();
        System.out.println("Capacity : " + piggyArray.capacity() + " ; " + "Number Of Elements : " + piggyArray.numberOfElements());

        piggyArray.remove(5);
    }
}
