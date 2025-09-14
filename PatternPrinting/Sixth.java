public class Sixth {
    public static void pTTERn(int n){
        for(int row = 1; row <= n; row++){
            int totalColInRow = n > row ? 2 * n - row : row;
            for(int space = 0; space < n-row; space++){
                System.out.print("  ");
            }

            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }

            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pTTERn(4);
    }
}
