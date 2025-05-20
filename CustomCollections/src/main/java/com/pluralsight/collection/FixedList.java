package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T>{
    protected List<T> items;
    protected int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>(); //Initialize List
    }

    public List<T> getItems() {
        return items;
    }

    public void add(T item){
        if (items.size() >= maxSize){
            System.out.println("List max size is bigger than: " + maxSize + " !");
            return;
        }
        items.add(item);
    }
}
