public class Raghav {

    // Counting the length of a LinkedList
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void insertAtEnd(Node head, int data) {
        Node temp = new Node(data);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
    }

    public static void disRec(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        disRec(head.next);
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(17);
        Node d = new Node(12);
        Node e = new Node(11);

        // 5 2 17 12 11
        a.next = b; // 5 -> 2 17 12 11
        b.next = c; // 5 -> 2 -> 17 12 11
        c.next = d; // 5 -> 2 -> 17 -> 12 11
        d.next = e; // 5 -> 2 -> 17 -> 12 -> 11

        // Displaying Data From LinkedList
        // Node temp = a;
        // for (int i = 1; i <= 5; i++) {
        // System.out.print(temp.data + " -> ");
        // temp = temp.next;
        // }

        display(a);
        System.out.println();
        disRec(a);
        System.out.println();
        System.out.println(length(a));
        insertAtEnd(a, 85);
        display(a);
    }
}
