import java.util.Arrays;

public class copyElementsIntoAnotherArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] Arr = new int[arr.length];
        System.out.println(Arrays.toString(Arr));

        for(int i = 0; i < arr.length; i++){
              Arr[i] = arr[i];
        }
        System.out.println(Arrays.toString(Arr));
    }
}
