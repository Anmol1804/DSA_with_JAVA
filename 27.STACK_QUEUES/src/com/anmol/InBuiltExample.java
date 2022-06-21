package com.anmol;

import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//      Empty stack will throw exception
//        System.out.println(stack.pop());



        // Imagine queue as Linked List
        // move head to next is like pop
//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        queue.add(16);
//
//        // peek get first value but dont remove it like remove
//        System.out.println(queue.peek());

        // DeQue -> doubly ended queue
        // Insert and remove from both ends

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(78);
        deque.addLast(21);
        System.out.println(deque);
        System.out.println(deque.removeFirst());



    }
}
