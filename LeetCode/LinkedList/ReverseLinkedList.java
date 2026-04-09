import java.util.*;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }

}



class ReverseLinkedList{

    public static Node reverse(Node head){
    Node prev = null;
    Node after = null;
    Node curr = head;

    while(curr != null){
        after = curr.next;
        curr.next = prev;
        prev = curr;
        curr = after;
    }
    return prev;
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

        display(head);
        head = reverse(head);
        display(head);
    }
}