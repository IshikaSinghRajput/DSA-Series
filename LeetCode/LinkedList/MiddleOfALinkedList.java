class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }

}


class MiddleOfALinkedList{

    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void delete(Node node){
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void display(Node head){
    while(head != null){
        System.out.print(head.val + "->");
        head = head.next;
    }
    System.out.println("null");
}



    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println(middle(head).val);

        delete(head);
        display(head);
    }
}