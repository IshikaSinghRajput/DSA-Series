import java.util.LinkedList;
import java.util.Queue;

class myStack {

    public myStack() {
    }; // Constructor

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }

        q1.add(x);

        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.remove();
        }
    }

    public int pop() {
        int ans = q1.peek();
        q1.remove();
        return ans;
    }

    public int top() {
        return q1.peek();
    }

    public void display() {
        for(int q : q1) {
            System.out.print(q + "->");
        }
    }
}

class ImplementStackUsingQueues {

    public static void main(String[] args) {
        myStack obj = new myStack();
        obj.push(12);
        obj.push(15);
        obj.push(19);
        //obj.pop();
        obj.display();
    }

}