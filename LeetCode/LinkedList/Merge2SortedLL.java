class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

}

class Merge2SortedLL {

    public static Node merge(Node list1, Node list2) {
        Node t1 = list1;
        Node t2 = list2;
        Node h = new Node(100);
        Node temp = h;

        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }

        if (t1 == null) {
            temp.next = t2;
        } else
            temp.next = t1;

        return h.next;
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        // List 1
        Node l1 = new Node(10);
        l1.next = new Node(20);
        l1.next.next = new Node(30);

        // List 2
        Node l2 = new Node(15);
        l2.next = new Node(25);
        l2.next.next = new Node(35);

        Node merged = merge(l1, l2);
        display(merged);
    }
}