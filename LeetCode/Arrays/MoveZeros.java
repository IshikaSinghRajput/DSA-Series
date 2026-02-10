import java.util.Arrays;

public class MoveZeros {

    public static int[] moveZero(int[] arr){
        int[] prr = new int[arr.length];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                prr[idx++] = arr[i];
            }
        }
       
        return prr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZero(arr)));
    }
}
