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

    public void search(int data){
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        Node first = head;
        Node last = head.next;
        while(first.data != data){
            first = first.next;
            last=last.next;
            if (last==null && first.data==data){
                System.out.println(data +" Exists in the Current Linkedlist");
                return;
            }
            if(last==null && first.data!=data){
                System.out.println(data +" Doesn't Exists in the Current Linkedlist");
                return;
            }
        }

        System.out.println(data +" Exists in the Current Linkedlist");
    }

    public void after(int data, int after){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        Node first = head;
        Node second = head.next;
        while(first.data != after){
            first = first.next;
            second=second.next;
        }
        first.next=newNode;
        newNode.next=second;

    }

    public void delete(int data){
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        Node first = head;
        Node last = head.next;
        Node temp = null;
        while(first.data != data){
            temp = first;
            first = first.next;
            last=last.next;
            if (last==null && first.data==data){
                temp.next=null;
                return;
            }
            if(last==null && first.data!=data){
                System.out.println(data +" Doesn't Exists in the Current Linkedlist");
                return;
            }
        }
        temp.next=last;

    }
    public void count(){
        Node temp;
        temp = head;
        int count = 0;
        if (head == null) {
            System.out.println("Linked list empty!!");
        } else {
            while (temp.next != null) {
                temp = temp.next;
                count++;
            }
            count++;
            System.out.println("Size of Linked list is " + count);
        }
    }
    public static void main (String[] args){
        System.out.println("Welcome to LinkedList Practice Problem");
        LinkedList ll = new LinkedList();
        ll.addLast(59);
        ll.addLast(70);
        ll.addLast(30);
        //ll.insertBW(30);
        System.out.print("After inserting 30 between 59 and 70 ... ");
        ll.printNode();
        ll.after(40,30);
        System.out.print("Adding 40 after 30 ... ");
        ll.printNode();
        ll.addLast(80);
        ll.addLast(90);
        System.out.print("Adding more values to the list ... ");
        ll.printNode();
        ll.delete(40);
        System.out.print("After deleting 40 from the list ... ");
        ll.printNode();

    }
}
