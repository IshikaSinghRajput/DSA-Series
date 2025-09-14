class Employeee{
    String name;
    int id;
    int salary;

    Employeee(){
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0;
    }

    Employeee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary :" + salary);
        System.out.println();
    }
}

public class Employee {
    public static void main(String[] args) {
        //Creating an object using the default constructor
        Employeee emp1 = new Employeee();

        //Creating an object using the parameterized constructor
        Employeee emp2 = new Employeee("Ishika", 102, 90000);

        emp1.displayDetails();
        emp2.displayDetails();

    }
}
