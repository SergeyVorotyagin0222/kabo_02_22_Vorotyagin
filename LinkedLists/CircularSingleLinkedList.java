package mirea.LinkedLists;

import java.util.*;
import java.io.*;

public class CircularSingleLinkedList {
    static class Node{int data; Node link;}

    static class Queue{Node front, rear;}

    static void enQueue(Queue q, int value){
        Node temp = new Node();
        temp.data = value;
        if (q.front == null){q.front = temp;}
        else{q.rear.link = temp;}
        q.rear = temp;
        q.rear.link = q.front;
    }

    static int deQueue(Queue q){
        if (q.front == null){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        int value;
        if (q.front == q.rear){
            value = q.front.data;
            q.rear = null;
            q.front = null;
        }else{
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    static void print(Queue q){
        Node temp = q.front;
        System.out.println("Elements:");
        while (temp.link != q.front){
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }

    public static void main (String[] args){
        Queue q = new Queue();
        q.front = q.rear = null;
        enQueue(q, 1);
        enQueue(q, 3);
        enQueue(q, 5);
        print(q);

        System.out.println("Deletion");
        deQueue(q);
        print(q);

        System.out.println("Adding");
        enQueue(q, 100);
        enQueue(q, 12);
        print(q);


    }

}
