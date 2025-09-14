import java.util.*;

public class BasicSTL {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.print(q + " ");

        Queue<Integer> r = new LinkedList<>();
        while (q.size() > 0) {
            r = q.remove();
        }
    }
}