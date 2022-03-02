package com.eshwarnag.code.collections;

public class UberArray {

    private Object[] array;
    private int length = 0;

    public UberArray() {
        this(2);
    }

    public UberArray(int n) {
        array = new Object[n];
    }

    public void add(Object data) {
        if(array.length == this.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i=0; i<array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[array.length] = data;
            array = newArray;
            length++;
        }
        else {
            array[length] = data;
            length++;
        }
    }

    public void print() {
        for (int i=0; i<length; i++)
            System.out.println(array[i]);
    }

    public int getLength() {
        return array.length;
    }
}