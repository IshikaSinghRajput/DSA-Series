public class ReverseString{

    public static void reverse(String str){
        char[] arr = str.toCharArray();
        int s = 0;
        int e = str.length()-1;

        while(s < e){
            char temp = str.charAt(s);
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        System.out.println(new String(arr));
    }
    public static void main(String[] args) {
        String s = "Hello";
        reverse(s);
    }
}