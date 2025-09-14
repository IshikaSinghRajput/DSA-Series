public class SortedArray {

    static boolean sort(int[] arr, int index){
        if(index == arr.length-1) return true;

        return arr[index] < arr[index+1] && sort(arr, index+1);
    }
    
    public static void main(String[] args) {
        int arr[] = {22,33,44,55,56};
        System.out.println(sort(arr, 0));
    }
}
