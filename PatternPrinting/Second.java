public class Second {
    public static void pTTERn(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 0; col <= n-row; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pTTERn(4);
    }
}
