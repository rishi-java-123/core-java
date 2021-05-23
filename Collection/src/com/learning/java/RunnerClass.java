package com.learning.java;

public class RunnerClass {
    public static void main(String[] args) {
        CustomeLinkedList customeLinkedList= new CustomeLinkedList();
        Node node1= new Node(4,6);
        Node node4= new Node(8,12);
        Node node3= new Node(5,8);
        Node node5= new Node(18,28);
        Node node2= new Node(17,27);
        customeLinkedList.append( node1);
        customeLinkedList.append( node5);
        customeLinkedList.append( node3);
        customeLinkedList.InsertInLinkedList(node4,0);
        customeLinkedList.InsertInLinkedList(node2,1);
        customeLinkedList.displayLinkedList();
        customeLinkedList.deleteFromLinkedList(3);
        customeLinkedList.displayLinkedList();


    }
}
