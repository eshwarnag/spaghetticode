package com.eshwarnag.code.application;

import com.eshwarnag.code.collections.structures.Structure;
import com.eshwarnag.code.collections.structures.UberArray;

public class ArrayApplication {

    public static void main(String[] args) {
        //Create Array
        Structure newArray = new UberArray();

        //Add first five elements
        newArray.add(43);
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.size());
        newArray.add("Esh");
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.size());
        newArray.add(true);
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.size());
        newArray.add(22.25);
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.size());
        newArray.add("007");
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.size());

        //Adding sixth element
        newArray.add(false);
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.size());

        //Printing the array
        System.out.println("-----------");
        newArray.print();
        System.out.println("-----------");

        //Removing an element
        System.out.println("Removing element from index 3");
        newArray.remove(3);
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.size());

        //Printing the array
        System.out.println("-----------");
        newArray.print();
        System.out.println("-----------");

        //Before Optimizing
        System.out.println("Before Optimizing");
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.size());

        //Optimize Array Size
        System.out.println("Optimizing Array Size...");
        newArray.optimize();
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.size());
        newArray.print();
    }
}
