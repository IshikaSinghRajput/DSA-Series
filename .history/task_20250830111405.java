import java.util.*;

public class task {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node insertAtBeggining(Node head, int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        return head;
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

    static int count(Node head) {
        if (head == null)
            return 0;
        int size = 0;
        Node temp = head;
        while (temp.next != null)
            size++;
        temp = temp.next;
        return size;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        insertAtBeggining(head, 3);
        insertAtEnd(head, 6);
        display(head);
    }
}
