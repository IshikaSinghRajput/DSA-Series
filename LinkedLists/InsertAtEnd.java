public class InsertAtEnd {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtHead(int data) { // O(1)
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }

        void insertAtEnd(int data) { // O(n)
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtBeggining(int data) { // O(1)
            Node temp = new Node(data);
            if (head == null) {
                insertAtEnd(data);
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtIndex(int idx, int data) { // O(n/2) = O(n)
            Node t = new Node(data);
            Node temp = head;

            if (idx == size) {
                insertAtEnd(data);
                return;
            } else if (idx == 0) {
                insertAtHead(data);
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtIdx(int idx) {
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // int size() { //O(n)
        // Node temp = head;
        // int count = 0;
        // while (temp != null) {
        // count++;
        // temp = temp.next;
        // }
        // return count;
        // }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(2);

        ll.insertAtBeggining(12);

        ll.insertAtIndex(0, 76);

        System.out.println(ll.getAt(3));
        ll.display();
        ll.deleteAtIdx(2);
        ll.display();

    }
}
