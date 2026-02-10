public class ReverseAString {
    public static void main(String[] args) {
        String st = "Hello World";
        
       char[] arr = st.toCharArray();
       int s = 0;
       int e = arr.length-1;

        while(s < e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        // String reversed = new String(arr);
        System.out.println(arr);
     

        }
    }
