public class LLImp {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public class LLQueue {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Empty");
                return -1;
            }
            return head.val;
        }

        void display() {
            if (head == null)
                System.out.println("Empty");
            Node temp = head;
            while (temp != null) {

            }
        }
    }

    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        q.add(10)

        q.add(20);
        q.add(30);
    }

}
