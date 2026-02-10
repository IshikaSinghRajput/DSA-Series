import java.util.Arrays;

public class SquaresOfSortedArr {

    public static int[] squareArray(int[] arr){
        int[] res = new int[arr.length];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            res[idx++] = arr[i] * arr[i];
        }
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = { -7,-3,2,3,11 };
        System.out.println(Arrays.toString(squareArray(arr)));
    }
}
