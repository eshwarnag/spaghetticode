package com.eshwarnag.code.collections.structures;

public interface Structure {
    void add(Object data);
    void remove(int index);
    int size();
    int capacity();
    void optimize();
    void print();
}
