package com.learning.java;

public class RunnerClass {
    public static void main(String[] args) {
        CustomeLinkedList customeLinkedList= new CustomeLinkedList();
        Node node1= new Node(4,6);
        customeLinkedList.InsertInLinkedList(node1,node1,2);
        customeLinkedList.displayLinkedList();
       /* customeLinkedList.insertFirstElement(5,5.5);
        customeLinkedList.insertFirstElement(6,6.5);
        customeLinkedList.insertFirstElement(8,8.5);

        customeLinkedList.displayLinkedList();

        customeLinkedList.deleteFirstElement();

        customeLinkedList.displayLinkedList();*/

    }
}
