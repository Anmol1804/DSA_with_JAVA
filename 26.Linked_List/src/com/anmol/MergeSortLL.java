package com.anmol;

public class MergeSortLL {

    public Node sortList(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node prev_mid = null, slow_mid = head, fast = head;

        // finding middle also left should be made null at end
        while(fast != null && fast.next != null){
            prev_mid = slow_mid;
            fast = fast.next.next;
            slow_mid = slow_mid.next;
        }

        // making left half to point null else stackoverflow
        prev_mid.next = null;

        Node left = sortList(head);
        Node right = sortList(slow_mid);

        return mergeTwoLists(left, right);


    }

    Node mergeTwoLists(Node list1, Node list2) {
        Node ansHead = new Node();

        // making temp to iterate
        Node temp = ansHead;

        // heads of respective lists
        // list1, list2 are heads given

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        while(list1 != null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while(list2 != null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return ansHead.next;
    }


}

 class Node {
    int val;
     Node next;

     Node() {
    }

     Node(int val) {
        this.val = val;
    }

     Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
