// File: Student.java

    class Student {
        String name;
        double marks;
        int rollno;
    
        //Setters are the function which can set any value forcefully to private attributes
        // public void setRollno(int rolno) {
        //     // If suppose the argument passed is same as the rollno then it will only point to the argument rollno and hence the rollno declared at class could never be accessed thats why we use this keyword to point class rollno and argument roll no. it can be avoided by usiing different name as arguments
        //     // this.rollno = rollno;
        //     rollno = rolno;
        // }
    
        //Getters are the function which can access the private attributes
        // public int getRollno() {
        //     return rollno;
        // }

        //Default constructor
        // public Student(){

        // }

        //Parameterized Constructor
        public Student(String naam){
            name = naam;
           
        }
    }
    