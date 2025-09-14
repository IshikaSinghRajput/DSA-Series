public class Reverse {

    static int func(int num, int rev){
        if(num == 0) return rev;
       
        return func(num/10, rev * 10 + num%10);
    }

    public static void main(String args[]){
        int num = 321;
        System.out.println(func(num, 0));
    }
}
