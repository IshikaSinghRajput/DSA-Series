public class FindFrequencyOfElement {

    public static int frequency(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                count++;
        }
        return count;
    }

    public static int maxFeq(int[] arr){
        int maxFreq = 0;
        int element = arr[0];
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == arr[i]){ 
                    count++;
                }
            }
            if(count > maxFreq){
                maxFreq = count;
                element = arr[i];
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 3 };
        int target = 2;

       // System.out.println(frequency(arr, target));
        System.out.println(maxFeq(arr));
    }
}
