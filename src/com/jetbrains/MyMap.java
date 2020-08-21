package com.jetbrains;

public class MyMap<K, V> {
    int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int Count) {
        this.count = count;
    }

    public static void main(String[] args) {
        MyMap<Integer, String> myMap = new MyMap<Integer, String>();
        System.out.println(myMap.getCount());
    }
}
