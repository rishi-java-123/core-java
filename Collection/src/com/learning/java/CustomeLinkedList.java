package com.learning.java;

public class CustomeLinkedList {

    private Node head;

    public CustomeLinkedList() {
        head = null;
    }

    public CustomeLinkedList(Node first) {
        this.head = first;
    }



    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        else {
            return false;
        }


    }

    public void insertElement(int firstdata,double secondData ){
        Node head = new Node(firstdata,secondData);
        head.next = this.head;
       this.head =head;
    }

    public Node deleteFirstElement(){
       Node temp = head;
       head = head.next;
       return temp;

    }

    public void displayLinkedList(){
        Node current = head;
         while(current != null){
             current.displayNode();
             current= current.next;
         }
    }


       public Node findByKey(int key){

        Node current = head;

        while(current.getData() != key){

            if (current.next == null){
                return null;
            } else{
                current=current.next;
            }

        }
        return current;
       }
    public Node deleteByKey(int key){

        Node current = head;
        Node previous = head;

        while(current.getData() != key){

            if (current.next == null){
                return null;
            } else{
                previous = current;
                current=current.next;
            }

        }

        if(current== head){
            head = head.next;
        }else{
            previous.next =current.next;
        }
        return current;
    }

    int ListLength(Node node){
        int length=0;
        Node currentNode=node;
        while(currentNode != null){
            length++;
            currentNode= node.getNext();
        }
       return length;

    }

// single method to insert in linkedList
    public  void InsertInLinkedList(Node nodeToInsert,int position){

        if (position < 0 )
            position=0;
        int size=ListLength(nodeToInsert);

        if (position >size )
            position=size;

        if(head == null) {

            head = nodeToInsert;
            System.out.println(head.getNext());
        }


      /*  if(position > size + 1 || size < 1 ){
                System.out.println("Position to be inserted is valid . Valid inputs are 1 to "  + (size+1));
                return headNode;
        }*/

      else  if (position == 0){
            nodeToInsert.next = head;
            head = nodeToInsert;
        }else{
            Node traversingNode = head;
             for(int i = 1; i<position;i++){
                 traversingNode=traversingNode.next;
             }
            nodeToInsert.next=traversingNode.next;
             traversingNode.next=nodeToInsert;
             
        }
        System.out.println(head.getData() +"," + head.getNext());
    }


    public  void display(){
        Node  temp = head;
        while (temp != null){
            System.out.println(temp.getData() + "");
            temp=temp.next;
        }

    }


    public void append(Node nodeToappend){
        if (head == null){
            head = nodeToappend;
            return;
        }
        /*  This new node is going to be the last node, so
              make next of it as null */
        nodeToappend.next = null;

        Node tempNode = head;
        while(tempNode.next != null){
            tempNode=tempNode.next;
        }
       tempNode.next=nodeToappend;
        return;
    }

}
