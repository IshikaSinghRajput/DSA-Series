public class RemoveElement {

    public static int removeElement(int[] arr, int val){
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val){
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3,2};
        int val = 3;

        System.out.println(removeElement(arr, val));
    }
}
