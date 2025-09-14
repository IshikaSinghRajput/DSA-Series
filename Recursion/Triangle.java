public class Triangle {
    
    static void func(int r, int c){
        if(r == 0) return;

        if(c < r){
            System.out.print("*");
            func(r, c+1);
        }
        else{
            System.out.println();
            func(r-1, 0);
        }
    }

    static void func2(int r, int c){
        if(r == 0) return;

        if(c < r){
           
            func2(r, c+1);
            System.out.print("*");
        }
        else{
           
            func2(r-1, 0);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        func(4, 0);
        func2(4, 0);
    }

}
