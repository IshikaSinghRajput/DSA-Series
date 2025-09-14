public class Task {

    public static class Queue {
        private int f = -1;
        private int r = -1;
        private int[] arr = new int[5];

        void add(int val) {
            if (f == arr.length - 1) {
                System.out.println("Queue is Full");
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = val;
            } else {
                arr[++r] = val;
            }
        }

        int remove() {
            if (f == -1)
                System.out.println("Queue is full");

            f++;
            return arr[r - 1];
        }

        int peek() {
            if (f == -1)
                System.out.println("Queue is empty");
            else
                return arr[f];
        }

        void display() {
            if (f == -1)
                System.out.println("Queue is Empty");
            else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Queue.add(19);
        Queue.add(12);
        Queue.add(38);
        Queue.display();
    }
}