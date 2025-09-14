import java.util.*;

public class task {
    public static class Node {
        int val;
        Node next;
        int size;

        public Node(int val, int size) {
            this.val = val;
            this.next = null;
            this.size = 0;
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
        size++;
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
        size++;
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
