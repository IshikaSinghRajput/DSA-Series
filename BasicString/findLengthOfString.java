public class findLengthOfString {
    public static void main(String[] args) {
        String st = "Hello World";
        int count = 0;

        for (char c : st.toCharArray()) {
            count++;

        }
        System.out.println(count);
    }
}