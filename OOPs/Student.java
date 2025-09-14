class Studentt{
    String name;
    int age;
    float marks;

void displayDetails(){
    System.out.println("Name : " + name);
    System.out.println("Age: " + age);
    System.out.println("Marks : " + marks);
    System.out.println();
}
}

public class Student {
    

    public static void main(String[] args) {
        Studentt Ishika = new Studentt();
        Ishika.name = "Ishika";
        Ishika.age = 20;
        Ishika.marks = 90;

        Studentt Rahul = new Studentt();
        Rahul.name = "Rahul";
        Rahul.age = 22;
        Rahul.marks = 87;

        Ishika.displayDetails();
        Rahul.displayDetails();

        
    }
}
