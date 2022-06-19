package com.anmol;



class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
 }


 // https://leetcode.com/problems/linked-list-cycle/
//AMAZON And MICROSOFT (both length and cycle)
public class CycleQuestions {
    public boolean hasCycle(ListNode head) {

        // fast and slow pointer approach
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }


    // find length of cycle
    public int lengthCycle(ListNode head) {

        // fast and slow pointer approach
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // calculating length
                ListNode temp = slow;
                int len = 0;
                do{
                    len++;
                    temp = temp.next;
                }
                while (temp != fast);
            }
        }

        // if cycle not present
        return 0;
    }


     public ListNode detectCycle(ListNode head) {
        int len = 0;

         ListNode fast = head;
         ListNode slow = head;

         while (fast != null && fast.next != null) {
             fast = fast.next.next;
             slow = slow.next;

             if (fast == slow) {
                 len = lengthCycle(slow);
                 break;
             }
         }

         // if no cycle len = 0
         if(len == 0){
             return null;
         }

         ListNode first = head;
         ListNode second = head;

         // move 2nd pointer to l then k will be left
         while (len > 0){
             second = second.next;
             len--;
         }

         while (first != second){
             first = first.next;
             second = second.next;
         }

         return second;

     }


     public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (fast != slow);

        if(slow == 1){
            return true;
        }

        return false;
     }

     private int findSquare(int n){
        int ans = 0;
        while (n>0){
            int rem = n%10;
            ans = ans + rem*rem;
            n = n/10;
        }
        return ans;
     }

}

