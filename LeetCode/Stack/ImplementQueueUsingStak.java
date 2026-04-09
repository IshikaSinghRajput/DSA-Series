import java.util.Stack;

class myStack {

    public myStack() {
    }; // Constructor

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }

        s1.add(x);

        while (!s2.isEmpty()) {
            s1.add(s2.peek());
            s2.pop();
        }
    }

    public int pop() {
        int ans = s1.peek();
        s1.pop();
        return ans;
    }

    public int top() {
        return s1.peek();
    }

    public void display() {
        for (int q : s1) {
            System.out.print(q + "->");
        }
    }
}

public class ImplementQueueUsingStak {
    public static void main(String[] args) {
        myStack obj = new myStack();
        obj.push(12);
        obj.push(15);
        obj.push(19);
        // obj.pop();
        obj.display();
    }
}
