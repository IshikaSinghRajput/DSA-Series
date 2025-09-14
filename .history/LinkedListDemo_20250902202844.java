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
        Node temp = head;
        while (temp != null) {
            if (temp.val == val)
                temp = temp.next.next;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        // display(head); // Output: 10 -> 20 -> 30 -> null
        // System.out.println(countNodes(head));
        // System.out.println(targeRect(head, 1));
        System.out.println(deleteByVal(head, 10));
    }
}