package com.anmol;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        // create a new node
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }


    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        // just previous so we can start from 1 or i<index-1
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;

    }

    // insert using recursion
    // when not given size, tail

    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, --index, node.next);
        return node;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;

        return value;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);

        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        size--;

        return val;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }

            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }





    // QUESTIONS

    // 1. Remove Duplicates
    public void removeDuplicates(){
        Node temp = head;

        while (temp.next != null){
            if (temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }
            else {
                temp = temp.next;
            }
        }

        tail = temp;
        tail.next = null;
    }


    // 2.merge two lists
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();

        while ( f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while( f != null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while( s != null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }



    public void bubbleSort(){
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int r, int c){
        if(r==0){
            return;
        }

        if(c<r){
            Node first = get(c);
            Node second = get(c+1);

            if(first.value > second.value){
                // swap - 3 cases
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(c-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(c - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(r, c+1);
        } else {
            bubbleSort(r-1, 0);
        }
    }


    // Recursion Reverse

    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


    // inplace reversal - google, Amazon ..
    // https://leetcode.com/problems/reverse-linked-list/

    public void reverse(){
        if(size < 2){
            return;
        }

        Node prev = null;
        Node pres = head;
        Node nxt = pres.next;

        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = nxt;
            if(nxt != null){
                nxt = nxt.next;
            }
            head = prev;
        }
    }


//    https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        // skip left-1 nodes
        ListNode current = head;
        ListNode prev = null;

        for (int i = 0; current!= null && i < left-1; i++) {
            prev = current;
            current = current.next;
        }


        ListNode last = prev;
        ListNode newEnd = current;

        // reverse btw left and right
        ListNode nxt = current.next;
        for (int i = 0; current!=null && i < (right-left+1); i++) {
            current.next = prev;
            prev = current;
            current = nxt;
            if(nxt != null){
                nxt = nxt.next;
            }
            head = prev;
        }

        if(last != null){
            last.next = prev;
        }else {
            head = prev;
        }

        newEnd.next = current;

        return head;
    }



//    https://leetcode.com/problems/palindrome-linked-list/
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode rereverseHead = secondHead;

        // comapre both halves

        while (head!=null && secondHead!=null){
            if(head.val != secondHead.val){
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseList(rereverseHead);

        if(head == null || secondHead==null){
            return true;
        }

        return false;

    }
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode nxt = pres.next;

        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = nxt;
            if(nxt != null){
                nxt = nxt.next;
            }
            head = prev;
        }

        return prev;
    }
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;
            f= f.next.next;
        }
        return s;
    }



//    https://leetcode.com/problems/reorder-list/
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;

        // rearrage
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            ListNode temp2 = hs.next;
            hs.next = hf;
            hs = temp2;
        }

        // next of tail2 to null
        if(hf!=null) {
            hf.next = null;
        }
    }




//  Google, Amazon, FB, Microsoft
//    https://leetcode.com/problems/reverse-nodes-in-k-group/

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (true) {
            ListNode last = prev;
            ListNode newEnd = current;

            // reverse btw left and right
            ListNode nxt = current.next;
            for (int i = 0; current!=null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = nxt;
                if(nxt != null){
                    nxt = nxt.next;
                }
                head = prev;
            }

            if(last != null){
                last.next = prev;
            }else {
                head = prev;
            }

            newEnd.next = current;

            if(current == null) {
                break;
            }

            prev = newEnd;
        }

        return head;
    }
//    public static void main(String[] args){
//        LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(3);
//
//        list.removeDuplicates();
//        list.display();


//        LL list1 = new LL();
//        LL list2 = new LL();
//
//        list1.insertLast(1);
//        list1.insertLast(3);
//        list1.insertLast(9);
//
//        list2.insertLast(1);
//        list2.insertLast(2);
//        list2.insertLast(9);
//        list2.insertLast(14);
//
//        LL out = LL.merge(list1, list2);
//        out.display();

          LL list = new LL();

        list.insertLast(6);
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);

        list.display();
        list.bubbleSort();
        list.display();
    }




}
