import java.util.*;

public class task {
    public static class Node {
        int val;
        Node next;
        Node head;
        Node tail;

        public Node(int val) {
            this.val = val;
            this.next = head;

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

    static void insertAtBeggining(Node head, int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(4);
        a.next = b;
        b.next = c;
        insertAtBeggining(a, 2);
        display(a);
    }
}
