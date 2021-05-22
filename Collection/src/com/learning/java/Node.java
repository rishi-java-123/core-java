package com.learning.java;

public class Node {

    private int data;
    private double dobuleData;
    public Node next;

    public Node(int data, double dobuleData){
        this.data = data;
        this.dobuleData=dobuleData;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public double getDobuleData() {
        return dobuleData;
    }

    public void setDobuleData(double dobuleData) {
        this.dobuleData = dobuleData;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void displayNode(){
        System.out.println("{" + data + ", " +dobuleData + "}");
    }
}
