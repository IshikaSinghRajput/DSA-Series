public class Insertion {

    public static void main(String args[]) {
        LL list = new LL();
        list.insertFirst(4);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertLast(14);
        list.insert(100, 4);
        list.display();
        System.out.println(list.deleteFirst());

        System.out.println(list.deleteLast());
        list.display();

    }

}
