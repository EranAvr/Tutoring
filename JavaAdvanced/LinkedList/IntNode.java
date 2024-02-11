package com.example.MyLinkedList;

import java.util.Scanner;

public class IntNode {
    private int value;
    private IntNode next;

    // Constructors:
    public IntNode(int v){
        this.value = v;
        this.next = null;
    }
    public IntNode(int v, IntNode nxt){
        // We don't need to define 'value' here again.
        // Instead of duplicating code, we can use
        // the existing constructor above by calling 'this(v)'.
        this(v);
        this.next = nxt;
    }

    // Copy constructor:
    public IntNode(IntNode node){
        this.value = node.value;
        this.next = node.next;
    }


    // Getters and Setters:
    public int getValue(){
        return this.value;
    }
    public void setValue(int v){
        this.value = v;
    }

    public IntNode getNext(){
        return this.next;
    }
    public void setNext(IntNode nxt){
        this.next = nxt;
    }

    // Override the 'toString()' method
    // Now we can print this object to the screen,
    // and see the following string-
    public String toString(){
        return "["+value+", "+next+"]";
    }



    ////////////////////////////////////////////////////////
    /////////////////////     TEST        //////////////////
    ////////////////////////////////////////////////////////

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


        // READ
        // Searching in the list-
        System.out.println("Enter value to search: ");
        Scanner s = new Scanner(System.in);
        int seekValue = s.nextInt();
        // Temp node called 'cursor',
        // to save reference to head of the list n1-
        IntNode searchCursor = n1;
        // while cursor-node is not null and value not found,
        // advance cursor to next node-
        while (searchCursor != null && searchCursor.getValue() != seekValue){
            searchCursor = searchCursor.getNext();
        }
        // While-loop stops when cursor reach the end,
        // and cursor==null.
        // if value is found, then print-
        if (searchCursor != null)
            System.out.println("Value pointed by cursor: " + searchCursor.getValue());



        // DELETE
        // Remove from the list-
        System.out.println("Enter value to remove: ");
        int removeValue = s.nextInt();

        IntNode removeNode = n1;
        IntNode prevNode = n1;
        while (removeNode != null && removeNode.getValue() != removeValue){
            prevNode = removeNode;
            removeNode = removeNode.getNext();
        }
        if (removeNode != null){
            prevNode.setNext(removeNode.getNext());
        }

        // NOTICE!
        // In this formation we cannot delete first node,
        // because variable 'n1' still exists in this program.
        // When implemented in LinkedList class, we can manage a 'root' variable.
        System.out.println(n1);



        // CREATE
        // Add node to the list-
        int newValue = 10;
        int newIndex = 0;

        // 1 -> 2 -> 3
        IntNode addAfter = n1;
        int countSteps = 0;
        while (addAfter.getNext() != null && countSteps < newIndex-1){
            countSteps++;
            addAfter = addAfter.getNext();
        }
        IntNode newIsertion = new IntNode(10);
        newIsertion.setNext(addAfter.getNext());
        addAfter.setNext(newIsertion);

        System.out.println(n1);



        // UPDATE
        //  value in chosen node-
        // Here, we just need to repeat the searching-process,
        // but this time we update the node's value.
        int updateValue = 100;
        System.out.println("Enter old value to update to 100: ");
        int oldValue = s.nextInt();

        // Change only first occurrence-
        IntNode updateCursor = n1;
        while (updateCursor != null && updateCursor.getValue() != oldValue){
            updateCursor = updateCursor.getNext();
        }
        if (updateCursor != null)
            updateCursor.setValue(updateValue);

        System.out.println(n1);
    }
}
