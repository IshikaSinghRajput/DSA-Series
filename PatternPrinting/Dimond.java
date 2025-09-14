public class Dimond{

public static void pattern(int n){
    for(int row = 1; row <= 2*n; row++){
        int totalColInRow =row <= n ? 2 * row - 1 : 2 * (2 * n - row) - 1;

        int totalSpace = row <= n ? n - row : row - n;
        for(int space = 1; space <= totalSpace; space++){
            System.out.print(" ");
        }

        for(int col = 1; col <= totalColInRow; col++){
            System.out.print("*");
        }
        System.out.println();
    }
}


    public static void main(String[] args) {
        pattern(4);
    }
}