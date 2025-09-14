import java.util.*;

public class task {
    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val + "");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(6);
            Node c = new Node(4);
            a.next = b;
            b.next = c;

        }
    }
}
