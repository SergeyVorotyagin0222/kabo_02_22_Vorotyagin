package mirea.LinkedLists;

import java.io.*;
import java.util.Scanner;

public class SingleLinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d) {data = d; next = null;}
    }

    public static SingleLinkedList insert(SingleLinkedList list, int data){
        Node new_node = new Node(data);

        if (list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static SingleLinkedList adding(SingleLinkedList list, int data){
        Node new_node = new Node(data);

        System.out.println("Insert sth? (0/1)");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Enter>>");
        int q = scanner.nextInt();
        list = insert(list, q);
        return list;
    }

    public static SingleLinkedList delete(SingleLinkedList list, int index){
        Node currNode = list.head, prev = null;

        if (index == 0 && currNode != null){
            list.head = currNode.next;
            System.out.println(index + " - deleted");
            return list;
        }

        int counter = 0;

        while (currNode != null){
            if (counter == index){
                prev.next = currNode.next;
                System.out.println(index + " - deleted");
                break;
            } else{
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null){
            System.out.println("not found(");
        }
        return list;
    }

    public static void printList (SingleLinkedList list){
        Node currNode = list.head;

        System.out.println("Single Linked List>> ");

        while (currNode != null){
            System.out.println("{" + +currNode.data + "} ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args){
        SingleLinkedList list = new SingleLinkedList();

        list = insert(list, 0);
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        list = insert(list, 9);

        printList(list);
        adding(list, 0);
        printList(list);
        delete(list, 1);
        printList(list);
    }

}
