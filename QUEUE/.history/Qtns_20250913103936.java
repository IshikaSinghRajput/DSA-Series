import java.util.LinkedList;
import java.util.Queue;

public class Qtns {

    void reverse(Queue<Integer> q) {
        if (q.size() == 0)
            return;
        int front = q.remove();
        reverse(q);
        q.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(10);
        q.add(10);
        q.add(10);
        q.add(10);

    }
}
