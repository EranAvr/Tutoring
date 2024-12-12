package com.Mahat;

import com.exercise.Node;

import java.util.ArrayDeque;
import java.util.Queue;

public class M2021b {
    public static void main(String[] args) {
        // ex1:


    }
    // ex1-a:
    public static Queue<Integer> ex1a(int N){
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                q.add(i);
            }
        }
        return q;
    }
    // ex1-b:
    public static boolean ex1b(Queue<Integer> q, int N){
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                if (j != q.remove())
                    return false;
            }
        }
        return true;
    }

    // ex2-a:
    public static boolean ex2a(Node<Integer> root){
        // initial settings:
        int sum = root.getInfo();
        root = root.getNext();

        // traversing the linked list:
        while (root != null){
            // compare current value with running-sum:
            if (root.getInfo() != sum)
                return false;
            // advance:
            sum += root.getInfo();
            root = root.getNext();
        }
        return true;
    }
    // ex2-b:
    public static boolean ex2b(Node<Integer> root){
        Node<Integer> tempNext;
        // traversing the linked list:
        while (root.getNext() != null){
            // iteration's initial settings:
            int sum = 0;
            tempNext = root.getNext();
            // calc running sum:
            while (tempNext != null){
                sum += tempNext.getInfo();
                tempNext = tempNext.getNext();
            }
            // compare current value with running-sum:
            if (root.getInfo() != sum)
                return false;
            // advance:
            root = root.getNext();
        }
        return true;
    }
}
