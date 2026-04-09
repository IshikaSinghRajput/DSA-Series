class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

}

class AddTwoNumbers {

    public static Node add(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int num = sum % 10;
            carry = sum / 10;

            curr.next = new Node(num); // ✅ FIX
            curr = curr.next; // ✅ FIX
        }

        return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // First number: 2 -> 4 -> 3
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // Second number: 5 -> 6 -> 4
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = add(l1, l2);

        printList(result);
    }
}