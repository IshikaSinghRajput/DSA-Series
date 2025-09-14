//Find nth node from last

public class nthNodeFromLast {

    public static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        // mth node from start
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(17);
        Node d = new Node(12);
        Node e = new Node(11);
        Node f = new Node(18);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 5 2 17 12 11 18

        Node q = nthNode2(a, 2);
        System.out.println(q.data);

    }
}
