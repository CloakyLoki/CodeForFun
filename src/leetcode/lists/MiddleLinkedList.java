package leetcode.lists;

/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
 */
public class MiddleLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(middleNode(head).val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null) {
            return null;
        } else {
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

