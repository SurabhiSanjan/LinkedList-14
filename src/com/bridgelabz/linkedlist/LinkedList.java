package com.bridgelabz.linkedlist;
public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void printNode () {
        if (head == null) {
            System.out.println("Linked list is empty...");
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "=>");
            tempNode = tempNode.next;
        }
        System.out.println("null  is our current linked list");
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;
        while(tempNode.next != null){
            tempNode= tempNode.next;
        }
        tempNode.next = newNode;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void insertBW(int data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        Node first = head;
        Node last = head.next;
        while(last.data != 70 && first.data !=56){
            last = last.next;
            first = first.next;
        }
        first.next=newNode;
        newNode.next=last;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        if(head.next == null){
            head= null;
            return;
        }
        Node secoundLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secoundLast = secoundLast.next;
        }
        secoundLast.next= null;
    }

    public static void main (String[] args){
        System.out.println("Welcome to LinkedList Practice Problem");
        LinkedList ll = new LinkedList();
        ll.addLast(59);
        ll.addLast(70);
        ll.insertBW(30);
        System.out.print("After inserting 30 between 59 and 70 ... ");
        ll.printNode();
        ll.deleteFirst();
        System.out.print("After deleting first element ... ");
        ll.printNode();
        ll.deleteLast();
        System.out.print("After deleting last element ... ");
        ll.printNode();
    }
}