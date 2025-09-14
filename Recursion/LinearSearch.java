import java.util.ArrayList;

public class LinearSearch {
     
    static boolean find(int[] arr, int target, int index){
        if(target == arr.length) return false;

        return arr[index] == target || find(arr, target, index+1);
    }

     //For Finding the Index
    static int findIndex(int[] arr, int target, int index){
        if(target == arr.length) return -1;

        if(arr[index] == target){
            return index;
        }
        else{
           return findIndex(arr, target, index+1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index){
        if(index == -1) return -1;

        if(arr[index] == target){
            return index;
        }
        else{
           return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findBothIndex(int[] arr, int target, int index){
    if(index == arr.length) return;

     if(arr[index] == target){
        list.add(index);
    }
    
       findBothIndex(arr, target, index + 1);
    }


    public static void main(String[] args) {
        int[] arr = {2,3,4,6,6};

        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 3, 0));
        System.out.println(findIndexLast(arr, 6, 0));
        findBothIndex(arr, 6, 0);
        System.out.println(list);


    }
}
