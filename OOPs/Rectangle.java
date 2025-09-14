class Area{
    int length;
    int width;

    Area(int length, int width){
       this.length = length;
       this.width = width;
    }

    void displayDetails(){
        System.out.println("Area : " + length * width);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Area myArea = new Area(2, 2);
        myArea.displayDetails();
    }
}
