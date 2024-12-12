package com.Mahat;


import java.util.ArrayDeque;
import java.util.Queue;

public class M2023b {
    public static void main(String[] args) {
        // Testings:

        // ex1a:
        Queue<Integer> myQ = new ArrayDeque();
        myQ.add(2);
        myQ.add(10);
        myQ.add(12);
        myQ.add(3);
        myQ.add(7);
        myQ.add(4);
        myQ.add(1);

        // ex1b:
        change(myQ, 9);
        printQueue(myQ);

        // ex1c:
        // Complexities:
        // strangers() => O(n)
        // change() => O(n^2)   - because in each iteration of while-loop, we call the method strangers().


        // ex2a:
        // construct a list-
        List<Integer> lst = new List<>();
        lst.insert(null, 7);
        lst.insert(null, 11);
        lst.insert(null, 6);
        lst.insert(null, 4);
        lst.insert(null, 8);
        lst.insert(null, 7);
        lst.insert(null, 5);
        lst.insert(null, 20);
        lst.insert(null, 10);

        // print original list-
        printList(lst.getFirst());
        Node<Integer> newList = split(lst.getFirst());
        // print original after change-
        printList(lst.getFirst());
        // print new list-
        printList(newList);

    }

    /* Helper Methods: */
    public static void printQueue(Queue<Integer> q){    // this method destroys the queue
        while (!q.isEmpty()){
            System.out.print(q.remove() + ",");
        }
        System.out.println();
    }
    public static void printList(Node<Integer> node){
        while (node != null){
            System.out.print(node.getInfo() + ",");
            node = node.getNext();
        }
        System.out.println();
    }


    /* Method Implementations: */

    // ex1a:
    public static boolean strangers(int num1, int num2){
        int smallest = Math.min(num1, num2);

        for (int i=2; i <= smallest ; i++){
            if (num1 % i == 0 && num2 % i == 0)
                return false;
        }

        return true;
    }

    // ex1b:
    // operations: add, remove, peek.
    public static void change(Queue<Integer> q, int num){
        Queue<Integer> strangers = new ArrayDeque<>();
        Queue<Integer> notStrangers = new ArrayDeque<>();

        while (!q.isEmpty()){
            int head = q.remove();
            if (strangers(num, head)){
                strangers.add(head);
            } else {
                notStrangers.add(head);
            }
        }

        while (!strangers.isEmpty()){
            q.add(strangers.remove());
        }
        while (!notStrangers.isEmpty()){
            q.add(notStrangers.remove());
        }
    }

    // ex2a:
    public static Node<Integer> split(Node<Integer> chain){
        Node<Integer> newChain = new Node<>(0);
        Node<Integer> newChainTail = newChain;

        Node<Integer> originalHead = chain;    // save head's value for parity check

        while (chain != null){
            // The first element is guaranteed to not enter the if-block.
            if (chain.getInfo() % 2 != originalHead.getInfo() % 2){  // check number's parity with head's parity
                newChainTail.setNext(chain);    // add current node to new list
                newChainTail = chain;   // update our tail reference

                Node<Integer> previousNode = originalHead;
                while (previousNode.getNext() != chain) // find previous node
                    previousNode = previousNode.getNext();

                previousNode.setNext(chain.getNext());  // delete current node from original list
            }

            chain = chain.getNext();    // advance current node
        }

        return newChain.getNext();
    }

}
