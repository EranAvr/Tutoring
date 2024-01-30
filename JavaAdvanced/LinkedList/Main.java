package com.example.MyLinkedList;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating 3 new Nodes-
        IntNode n1 = new IntNode(1);
        IntNode n2 = new IntNode(2);
        IntNode n3 = new IntNode(3);
        // Chaining (connecting) the nodes to each other-
        // (This way we create a list of links, or "Linked-List")
        n1.setNext(n2);
        n2.setNext(n3);
        System.out.println("Our list after linking: " + n1);

        // Create new node 'n5'-
        IntNode n5 = new IntNode(5);
        // After creating n5,
        // we will replace it with n2.
        // So n2 is deleted from our list
        n1.setNext(n5);
        n5.setNext(n3);
        // Now our list is 1->5->3
        System.out.println("Our list after replacing n2 with n5: " + n1);

        // Creating new node with Copy Constructor-
        IntNode n6 = new IntNode(n5);
        System.out.println("Value in n5: " + n5.getValue());
        System.out.println("Value in n6: " + n6.getValue());
        n6.setValue(6);
        // Adding n6 instead of n5-
        // Connect n1 to n6-
        n1.setNext(n6);
        // Because of the copy-constructor
        // n6 is also pointing to n3,
        // so no need to use 'n6.setNext()'.
        System.out.println(n1);


        // Searching for a value in the list-
        System.out.println("Enter value to search: ");
        Scanner s = new Scanner(System.in);
        int seekValue = s.nextInt();
        // Temp node called 'cursor',
        // to save reference to head of the list n1-
        IntNode cursor = n1;
        // while cursor-node is not null and value not found,
        // advance cursor to next node-
        while (cursor != null && cursor.getValue() != seekValue){
            cursor = cursor.getNext();
        }
        // While-loop stops when cursor reach the end,
        // and cursor==null.
        // if value is found, then print-
        if (cursor != null)
            System.out.println("Value pointed by cursor: " + cursor.getValue());



        /*
        System.out.println("Enter value to remove: ");
        int removeValue = s.nextInt();

        IntNode removeCursor = n1;  // main cursor. searching node to remove.
        IntNode prevCursor = n1;    // backup cursor. saves history of previous node.
        while (removeCursor != null && removeCursor.getValue() != removeValue){
            prevCursor = removeCursor;
            removeCursor = removeCursor.getNext();
        }
        */
    }
}