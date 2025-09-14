public class third {
    public static void pTTERn(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pTTERn(4);
    }
}
