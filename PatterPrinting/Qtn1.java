package PatterPrinting;

public class Qtn1 {
    public static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.println("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pattern(4);
       
    }
}
