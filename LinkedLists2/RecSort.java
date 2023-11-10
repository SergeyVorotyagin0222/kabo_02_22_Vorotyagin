package mirea.LinkedLists2;

public class RecSort {

    static class Node{
        int data;
        Node next;
    }

    static Node swapNodes(Node head_ref, Node currX, Node currY, Node prevY){
        head_ref = currY;
        prevY.next = currX;
        Node temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;
        return head_ref;
    }

    static Node recurSelectionSort (Node head){
        if (head.next == null) {return head;}

        Node min = head;
        Node beforeMin = null;

        for (Node ptr = head; ptr.next != null; ptr = ptr.next){
            if (ptr.next.data < min.data){
                min = ptr.next;
                beforeMin = ptr;
            }
        }

        if (min != head){
            head = swapNodes(head, head, min, beforeMin);
        }

        head.next = recurSelectionSort(head.next);

        return head;
    }

    static Node sort(Node head_ref){
        if (head_ref == null){return null;}
        head_ref = recurSelectionSort(head_ref);
        return  head_ref;
    }

    static Node push (Node head_ref, int new_data){
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static void printList(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main (String[] args){
        Node head = null;

        head = push(head, 40);
        head = push(head, 30);
        head = push(head, 10);
        head = push(head, 50);
        head = push(head, 70);
        head = push(head, 30);

        System.out.println("List: ");
        printList(head);

        head = sort(head);

        System.out.println("\nSorted List: ");
        printList(head);
    }
}
