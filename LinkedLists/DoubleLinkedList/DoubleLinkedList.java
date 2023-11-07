package mirea.LinkedLists.DoubleLinkedList;

import java.io.*;

public class DoubleLinkedList {
//    Node head;
//    Node tail;

    static Node head = null;
    static Node tail = null;

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void traverseForward(){
        Node current = head;
        while (current != null){
            System.out.println("{" + current.data + "} ");
            current = current.next;
        }
    }
    public void traverseBackward(){
        Node current = tail;
        while (current != null){
            System.out.println("{" + current.data + "} ");
            current = current.prev;
        }
    }

    static void insertAtBeginning(int data){
        Node temp = new Node(data);
        if (head == null){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }
    public static void insertAtPosition(int data, int position){
        Node temp = new Node(data);
        if (position == 1){insertAtBeginning(data);}
        else{
            Node current = head;
            int currPosition = 1;
            while (current != null && currPosition < position){
                current = current.next;
                currPosition++;
            }
            if (current == null){insertAtEnd(data);}
            else{
                temp.next = current;
                temp.prev = current.prev;
                current.prev.next = temp;
                current.prev = temp;
            }
        }
    }
    static void insertAtEnd(int data){
        Node temp = new Node(data);
        if (tail == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    static void deleteAtBeginning(){
        if (head == null){return;}
        if (head == tail){
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
    }
    static void delete(int pos){
        if (head == null){return;}
        if (pos == 1){deleteAtBeginning();return;}

        Node current = head;
        int count = 1;

        while (current != null && count != pos){
            current = current.next;
            count++;
        }
        if (current == null){
            System.out.println("Wrong position");
            return;
        }
        if (current == tail){deleteAtEnd();return;}

        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.prev = null;
        current.next = null;
    }
    static void deleteAtEnd(){
        if (tail == null){return;}
        if (head == tail){
            head = null;
            tail = null;
            return;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }

    static void fulDelete(){
        Node temp = head;
        while (temp != null){
            deleteAtEnd();
            deleteAtBeginning();
            temp = temp.next;
        }
        deleteAtBeginning();
        deleteAtEnd();
    }

    static void display(Node head){
        Node temp = head;
        if (temp == null){
            System.out.println("empty list");
        }
        System.out.println("Start");
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main (String[] args){
        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);

        System.out.println("Insertion at tail: ");
        display(head);

        System.out.println("Insertion at head: ");
        insertAtBeginning(0);
        display(head);

        System.out.println("Insertion at 2nd pos (ex)");
        insertAtPosition(6,2);
        display(head);

        System.out.println("Deleting at head");
        deleteAtBeginning();
        display(head);

        System.out.println("Deleting at tail");
        deleteAtEnd();
        display(head);

        System.out.println("Deleting at 2nd pos (ex)");
        delete(2);
        display(head);

        System.out.println("Full deletion");
        fulDelete();
        display(head);

    }

}