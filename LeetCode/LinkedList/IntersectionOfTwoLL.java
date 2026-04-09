class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

}

public class IntersectionOfTwoLL {

    public static Node intersection(Node l1, Node l2) {
        Node t1 = l1;
        Node t2 = l2;
        int lengthA = 0, lengthB = 0;

        while (t1 != null) {
            lengthA++;
            t1 = t1.next;
        }

        while (t2 != null) {
            lengthB++;
            t2 = t2.next;
        }

        t1 = l1;
        t2 = l2;

        int diff = Math.abs(lengthA - lengthB);

        if (lengthA > lengthB) {
            for (int i = 0; i < diff; i++) {
                t1 = t1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                t2 = t2.next;
            }
        }

        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }

    public static Node intersection2(Node l1, Node l2){
        Node p1 = l1;
        Node p2 = l2;

        while(p1 != p2){
            p1 = (p1 == null) ? l1 : p1.next;
            p2 = (p2 == null) ? l2 : p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        // Common part
        Node common = new Node(7);
        common.next = new Node(8);

        // List A: 1 → 2 → 3 → 7 → 8
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = common;

        // List B: 4 → 5 → 6 → 7 → 8
        Node headB = new Node(4);
        headB.next = new Node(5);
        headB.next.next = new Node(6);
        headB.next.next.next = common;

        Node result = intersection2(headA, headB);

        if (result != null) {
            System.out.println("Intersection at node: " + result.val);
        } else {
            System.out.println("No intersection");
        }

    }

}
