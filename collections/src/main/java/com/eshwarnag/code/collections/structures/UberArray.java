package com.eshwarnag.code.collections.structures;

/**
 * UberArray is a flexible array that can hold any element type as its elements and which resizes automatically to add or remove elements.
 */
public class UberArray {

    private Object[] array;
    private int elementsInArray = 0;

    /**
     * A default constructor that allows the creation of an UberArray without specifying a size.
     * The default size used during the creation of an UberArray is 5.
     */
    public UberArray() {
        this(5);
    }

    /**
     * A parameterized constructor that allows the creation of an UberArray when a size is specified
     * @param n is the size of the array that needs to be created
     */
    public UberArray(int n) {
        array = new Object[n];
    }

    /**
     * A parameterized constructor that takes in a tradional array and creates an UberArray
     * @param array whose elements that need to be added to the array
     */
    public UberArray(Object[] array) {
        this.array = array;
        elementsInArray = array.length;
    }

    /**
     * This method allows retrieving an element at a specified index
     * @param index at which the element that needs to be retrieved
     * @return the element at the specified index
     */
    public Object getElement(int index) {
        return array[index];
    }

    /**
     * This method retrieves the index of a specified element.
     * @param element whose index that needs to be retrieved
     * @return the index of the element. If the element doesn't exist, returns -1
     */
    public int getIndex(Object element) {
        for(int i=0; i<elementsInArray-1; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * This method allows to add an element into the UberArray.
     * If the array is full, then a new array is created with double the size and all the existing elements are copied over.
     * @param element that needs to be added to the array
     */
    public void add(Object element) {
        if (array.length == this.elementsInArray)
            resizeArray();
        array[elementsInArray] = element;
        elementsInArray++;
        System.out.println("Added to the array : " + element.toString());
    }

    /**
     * This method allows adding a new element in the array at a specified location.
     * If the array if already full, the size of the array is doubled and then the element is added.
     * @param element that needs to be added to the array
     * @param index at which the element needs to be added
     */
    public void add(Object element, int index) {
        if(array.length == elementsInArray)
            resizeArray();
        for(int i=elementsInArray; i>=index; i--)
            array[i] = array[i-1];
        array[index] = element;
        elementsInArray++;
    }

    /**
     * This method allows to remove an element from the UberArray by specifying the index where the element is located
     * @param index at which the element must be removed
     */
    public void remove(int index) {
        if (index < array.length-1) {
            for (int i = index; i < array.length-1; i++)
                array[i] = array[i + 1];
        } else if(index == array.length-1)
            array[index] = null;
        else
            throw new ArrayIndexOutOfBoundsException("Index passed is greater than the length of the array");
        elementsInArray--;
        System.out.println("Removed element from array at index: " + index);
    }

    /**
     * This method allows removing a specific element from the array
     * @param element that needs to be removed
     */
    public void remove(Object element) {
        int indexFound = getIndex(element);
        if(indexFound > -1) {
            remove(indexFound);
            System.out.println("Element was removed");
        } else
            throw new IllegalArgumentException("Element not found");
    }

    /**
     * This method returns the current occupied size of the array
     * @return the number elements in the array
     */
    public int numberOfElements() {
        return elementsInArray;
    }

    /**
     * This method returns the total occupied size of the array in memory
     * @return the capacity of the array
     */
    public int capacity() {
        return array.length;
    }

    /**
     *This method reduces the memory footprint of the array if the physical size of the array far exceeds the number of elements in the array.
     */
    public void optimize() {
        boolean optimized = false;
        while(elementsInArray <= (array.length/2)) {
            optimized = true;
            Object[] newArray = new Object[array.length/2];
            for(int i = 0; i< elementsInArray; i++)
                newArray[i] = array[i];
            array = newArray;
        }
        if(optimized)
            System.out.println("The Array has been optimized");
        else
            System.out.println("The Array is already optimized");
    }

    /**
     *This methods prints all the elements in the array
     */
    public void print() {
        for (int i = 0; i < elementsInArray; i++)
            if(i < elementsInArray -1)
                System.out.print(array[i] + " , ");
            else
                System.out.println(array[i]);
    }

    /**
     * This method allows to create a clone of an array
     * @return the cloned array
     */
    public UberArray clone() {
        Object[] clonedArray = new Object[elementsInArray];
        for(int i=0; i<=elementsInArray-1; i++)
            clonedArray[i] = array[i];
        return new UberArray(clonedArray);
    }

    /**
     * This method allows increasing the capacity of the array
     * @param capacity to which the array's capacity has to increased
     */
    public void increaseCapacity(int capacity) {
        if(capacity <= array.length)
            throw new IllegalArgumentException("The specified capacity should be greater than the existing capacity of the array");
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    /**
     * This method helps to check if an array is empty
     * @return true or false
     */
    public boolean isArrayEmpty() {
        return elementsInArray == 0;
    }

    /**
     * This method helps to check if an array is full
     * @return true or false
     */
    public boolean isArrayFull() {
        return elementsInArray == array.length;
    }

    /**
     * The method helps to check if an element exists in the array
     * @param element the element that needs to be checked for existence in the array
     * @return true or false
     */
    public boolean elementExists(Object element) {
        for(int i=0; i<elementsInArray-1; i++) {
            if (array[i] == element)
                return true;
        }
        return false;
    }

    private void resizeArray() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}