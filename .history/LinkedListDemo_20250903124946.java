import java.util.*;

public class LinkedListDemo {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node insertAtEnd(Node head, int val) {
        Node node = new Node(val);
        if (head == null)
            return node;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
        return head;
    }

    static int countNodes(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    static boolean target(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val)
                return true;
            temp = temp.next;
        }
        return false;
    }

    static boolean targeRect(Node head, int val) {
        if (head == null)
            return false;
        if (head.val == val)
            return true;
        return targeRect(head.next, val);
    }

    static Node deleteByVal(Node head, int val) {
        if (head == null)
            return null;
        if (head.val == val)
            return head.next;
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    static Node deleteByValRec(Node head, int val) {
        if (head == null)
            return null;
        if (head.val == val)
            return head.next;
        head.next = deleteByValRec(head.next, val);
        return head;
    }

    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node after = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    static Node revRec(Node head) {
        if (head.next == null)
            return head;
        Node newHead = revRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    static Node middle(Node head) {
        if (head == null)
            return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static boolean isCycle(Node head) {
        if (head == null)
            return false;
        if (head.next == null)
            return false;
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            if (slow == null)
                return false;
            slow = slow.next;
            if (fast.next == null)
                return false;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    static Node duplicates(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        Node temp = head;
        while (temp != null) {
            if (temp.val == temp.next.val)
                temp = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);
        head = insertAtEnd(head, 50);

        // head = deleteByValRec(head, 10);
        // head = revRec(head);
        // display(head); // Output: 10 -> 20 -> 30 -> null
        // System.out.println(countNodes(head));
        // System.out.println(targeRect(head, 1));
        // Node mid = middle(head);
        // System.out.println(mid.val);
        head = duplicates(head);
        display(head);
    }
}