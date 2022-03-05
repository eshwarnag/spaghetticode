package com.eshwarnag.code.application;

import com.eshwarnag.code.collections.structures.UberArray;

public class ArrayApplication {

    public static void main(String[] args) {
        //Create Array
        UberArray newArray = new UberArray();
        System.out.println("Is Array Empty? " + newArray.isArrayEmpty());

        //Add first five elements
        newArray.add(43);
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());
        newArray.add("Esh");
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());
        newArray.add(true);
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());
        newArray.add(22.25);
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());
        newArray.add("007");
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());
        System.out.println();

        //Adding sixth element
        newArray.add(false);
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());
        System.out.println();

        //Printing the array
        System.out.println("-----------");
        newArray.print();
        System.out.println("-----------");

        //Removing an element
        newArray.remove(3);
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());

        //Printing the array
        System.out.println("-----------");
        newArray.print();
        System.out.println("-----------");
        System.out.println();

        //Before Optimizing
        System.out.println("Before Optimizing");
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());

        //Optimize Array Size
        System.out.println("Optimizing Array Size...");
        newArray.optimize();
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());
        newArray.print();
        System.out.println("Optimizing Array Size...again");
        newArray.optimize();
        System.out.println();

        //Adding element at a specified index
        System.out.println("Adding a new element at index 2");
        newArray.add(7,2);
        newArray.print();
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());
        System.out.println();

        //Get an element at a specified index
        System.out.println("Get the element at index 2");
        System.out.println("The element at index 2 is : " + newArray.getElement(2));
        System.out.println();

        //To Check if an Array is empty or full
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());
        System.out.println("Is Array Empty? " + newArray.isArrayEmpty());
        System.out.println("Is Array Full? " + newArray.isArrayFull());
        newArray.remove(5);
        newArray.print();
        System.out.println("Is Array Empty? " + newArray.isArrayEmpty());
        System.out.println("Is Array Full? " + newArray.isArrayFull());
        newArray.optimize();
        newArray.print();
        System.out.println("Is Array Empty? " + newArray.isArrayEmpty());
        System.out.println("Is Array Full? " + newArray.isArrayFull());
        System.out.println();

        //To Check if an element exists in the array
        System.out.println("43 exists in the array? " + newArray.elementExists(43));
        System.out.println("Nag exists in the array? " + newArray.elementExists("Nag"));
        System.out.println();

        //Get index of an element
        System.out.println("Index of 7 is " + newArray.getIndex(7));
        System.out.println("Index of Nag is " + newArray.getIndex("Nag"));
        System.out.println();

        //Adding and Removing element to unoptimize the array
        System.out.println("Adding and Removing element to unoptimize the array");
        newArray.add(77);
        newArray.remove(newArray.numberOfElements()-1);
        newArray.print();
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());

        //Create a clone of the array
        System.out.println("Existing Array");
        newArray.print();
        System.out.println("Capacity : " + newArray.capacity() + " ; " + "Size : " + newArray.numberOfElements());
        UberArray clonedArray = newArray.clone();
        clonedArray.print();
        System.out.println("Capacity : " + clonedArray.capacity() + " ; " + "Size : " + clonedArray.numberOfElements());
        System.out.println();

        //Increase the size of the cloned array
        System.out.println("Increasing Capacity...");
        clonedArray.increaseCapacity(17);
        System.out.println("Capacity : " + clonedArray.capacity() + " ; " + "Size : " + clonedArray.numberOfElements());
        clonedArray.print();
        System.out.println("Passing capacity as 5...");
        try {
            clonedArray.increaseCapacity(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        //Remove Element from the clonedArray
        System.out.println("Removing element true");
        clonedArray.remove(true);
        clonedArray.print();
        System.out.println("Capacity : " + clonedArray.capacity() + " ; " + "Size : " + clonedArray.numberOfElements());

        //Optimizing Cloned Array
        System.out.println("Optimizing clonedArray Size...");
        clonedArray.optimize();
        System.out.println("Capacity : " + clonedArray.capacity() + " ; " + "Size : " + clonedArray.numberOfElements());
    }
}
