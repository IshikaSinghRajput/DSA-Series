public class fourth {
    public static void pTTERn(int n){
        for(int row = 1; row <= n; row++){
            int totalColInRow = n > row ? 2 * n - row : row;
            for(int col = 0; col <= totalColInRow; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pTTERn(4);
    }
}