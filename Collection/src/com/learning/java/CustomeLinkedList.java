package com.learning.java;

import com.learning.java.Node;

public class CustomeLinkedList {

    private Node first;

    public CustomeLinkedList() {
        first = null;
    }

    public CustomeLinkedList(Node first) {
        this.first = first;
    }



    public boolean isEmpty(){
        if (first == null){
            return true;
        }
        else {
            return false;
        }


    }

    public void insertFirstElement(int id, double dd){
        Node head = new Node(id,dd);
        head.nextNode=first;
        first=head;
    }

    public Node deleteFirstElement(){
       Node temp = first;
       first= first.nextNode;
       return temp;

    }

    public void displayLinkedList(){
        Node current = first;
         while(current != null){
             current.displayNode();
             current= current.nextNode;
         }
    }


       public Node findByKey(int key){

        Node current = first;

        while(current.getData() != key){

            if (current.nextNode == null){
                return null;
            } else{
                current=current.nextNode;
            }

        }
        return current;
       }
    public Node deleteByKey(int key){

        Node current = first;
        Node previous = first;

        while(current.getData() != key){

            if (current.nextNode == null){
                return null;
            } else{
                previous = current;
                current=current.nextNode;
            }

        }

        if(current== first){
            first=first.nextNode;
        }else{
            previous.nextNode=current.nextNode;
        }
        return current;
    }

    int ListLength(Node node){
        int length=0;
        Node currentNode=node;
        while(currentNode != null){
            length++;
            currentNode= node.getNextNode();
        }
       return length;

    }

// single method to insert in linkedList
    public  Node InsertInLinkedList(Node headNode,Node nodeToInsert,int position){
        if(headNode == null)
            return nodeToInsert;
        int size=ListLength(headNode);

        if(position > size + 1 || size < 1 ){
                System.out.println("Position to be inserted is valid . Valid inputs are 1 to "  + (size+1));
                return headNode;
        }

        if (position == 1){
            nodeToInsert.setNextNode(headNode);
            return nodeToInsert;
        }else{
           Node previousNode = headNode;
           int count =1;
           while (count  < position-1){
               previousNode=previousNode.getNextNode();
               count++;
           }

           Node currentNode=previousNode.getNextNode();
           nodeToInsert.setNextNode(currentNode);
            previousNode.setNextNode(nodeToInsert);
        }
        return headNode;

    }

}
