import java.util.LinkedList;
import java.util.Queue;

public class Qtns {

    void reverse(Queue q, int val) {
        if (q.size() == 0)
            q.add(val);
        int top = q.remove();
        reverse(q, val);
        q.add(val);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

    }
}
