class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

}


class LLCycle{

    public static boolean isCycle(Node head){
        if(head == null) return false;
        if(head.next == null) return false;
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
      
            slow = slow.next;
          
            fast = fast.next.next;

            if(fast == slow) return true;
        }
        return false;
    }

     public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(10);

        head.next.next.next.next.next = head.next.next;  // Creating cycle
        System.out.println(isCycle(head));
       
    }
}