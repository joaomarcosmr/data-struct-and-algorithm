package chall_2_addTwoNumbers;

public class addTwoNumbers {
    /*
    *  You are given two non-empty linked lists representing two non-negative integers.
    *  The digits are stored in reverse order, and each of their nodes contains a single digit.
    *  Add the two numbers and return the sum as a linked list.
    *  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    *
    * Input: l1 = [2,4,3], l2 = [5,6,4]
    * Output: [7,0,8]
    * Explanation: 342 + 465 = 807.
    * */
    public class ListNode {
      int val;
      ListNode next;

      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = sumLists(l1, l2);
        return listNode;
    }

    private ListNode sumLists(ListNode l1, ListNode l2){
        ListNode sumListsResult = new ListNode();
        ListNode sumListsResultCurrent = sumListsResult;
        ListNode sumListNext = null;

        ListNode l1Current = l1;
        ListNode l1Next = null;
        ListNode l2Current = l2;
        ListNode l2Next = null;

        while(l1Current != null && l2Current != null){
            int val1 = l1Current != null ? l1Current.val : 0;
            int val2 = l2Current != null ? l2Current.val : 0;
            int resultSum = val1 + val2;

            if(resultSum > 9){
                resultSum -= 10;
                l1Current.next.val += 1;
            }

            sumListsResultCurrent.val = resultSum;
            sumListsResultCurrent.next = new ListNode();

            sumListNext =  sumListsResultCurrent.next;
            sumListsResultCurrent = sumListNext;

            l1Next = l1Current.next;
            l1Current = l1Next;
            l2Next = l2Current.next;
            l2Current = l2Next;
        }

        return sumListsResult;
    }

    private ListNode reverse(ListNode list){
        ListNode prev = null;
        ListNode current = list;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
