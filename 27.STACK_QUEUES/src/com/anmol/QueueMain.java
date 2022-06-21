package com.anmol;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        CircularQueue queue = new CircularQueue(5);

        DynamicQueue queue = new DynamicQueue(5);

        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(16);
        queue.insert(20);
        queue.insert(25);
        queue.insert(36);
        queue.insert(50);

        queue.display();
        System.out.println(queue.remove());

        queue.insert(100);
        queue.display();

        queue.remove();
        queue.remove();
        queue.display();
    }
}
