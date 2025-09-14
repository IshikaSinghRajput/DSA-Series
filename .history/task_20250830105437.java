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
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(4);
        a.next = b;
        b.next = c;
        a = insertAtEnd(a, 2)
        System.out.println(a);
    }
}
