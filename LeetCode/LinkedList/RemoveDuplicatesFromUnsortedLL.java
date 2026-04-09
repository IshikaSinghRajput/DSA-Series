import java.util.HashSet;

class Node {
    int val;
    Node next;
    public Node left;
    public TreeNode right;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

}

public class RemoveDuplicatesFromUnsortedLL {

    public static Node duplicates(Node head) {
        Node t1 = head;

        while (t1 != null) {
            Node t2 = t1;

            while (t2.next != null) {
                if (t2.next.val == t1.val) {
                    t2.next = t2.next.next;
                } else
                    t2 = t2.next;
            }
            t1 = t1.next;
        }
        return head;
    }

    public static Node duplicates2(Node head) {
        Node curr = head;
        Node prev = null;

        HashSet<Integer> set = new HashSet<>();

        while (curr != null) {
            if (set.contains(curr.val)) {
                // Element is present, remove it
                prev.next = curr.next;
            } else {
                set.add(curr.val);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

    public static void display(Node var0) {
        while (var0 != null) {
            System.out.print(var0.val + "->");
            var0 = var0.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(41);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(21);

        display(head);
        head = duplicates2(head);
        display(head);

    }
}
