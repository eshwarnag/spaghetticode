package com.eshwarnag.code.collections.structures;

public class UberArray implements Structure {

    private Object[] array;
    private int length = 0;

    public UberArray() {
        this(5);
    }

    public UberArray(int n) {
        array = new Object[n];
    }

    @Override
    public void add(Object data) {
        if (array.length == this.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[array.length] = data;
            array = newArray;
        } else {
            array[length] = data;
        }
        length++;
        System.out.println("Added to the array : " + data.toString());
    }

    @Override
    public void remove(int index) {
        if (index < array.length-1) {
            for (int i = index; i < array.length-1; i++)
                array[i] = array[i + 1];
        } else if(index == array.length-1)
            array[index] = null;
        else
            throw new ArrayIndexOutOfBoundsException("Index passed is greater than the length of the array");
        length--;
    }

    @Override
    public int size() {
        return length;
    }

    public int capacity() {
        return array.length;
    }

    @Override
    public void optimize() {
        while(length <= (array.length/2)) {
            Object[] newArray = new Object[array.length/2];
            for(int i=0; i<length; i++)
                newArray[i] = array[i];
            array = newArray;
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < length; i++)
            if(i < length-1)
                System.out.print(array[i] + " , ");
            else
                System.out.println(array[i]);
    }
}