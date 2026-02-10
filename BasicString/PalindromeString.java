public class PalindromeString {
    public static void main(String[] args) {
        String st = "racecare";
        st = st.toLowerCase();
        boolean isPalindrom = true;
        char[] arr = st.toCharArray();
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        for (int i = 0; i < st.length(); i++) {
            if (arr[i] != st.charAt(i))
                isPalindrom = false;
                break;
        }

        System.out.println(isPalindrom);
    }
}
