public class StringRev {

    public static String rev(String st){
        String rev = "";

        for(int i = st.length()-1; i >= 0; i--){
            rev = rev + st.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String st = "hello";
        
        System.out.println(rev(st));
    }
}
