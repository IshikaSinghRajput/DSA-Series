public class CompareRTwoStrings {
    public static void main(String[] args) {
        String st = "Hello World";
        String pt = "Hello World";
        st = st.toLowerCase().replaceAll(" ", "");
        pt = pt.toLowerCase().replaceAll(" ", "");
        boolean isEqual = true;

        if (st.length() != pt.length()) {
            System.out.println("false");
            return;
        }

        for (int i = 0; i < st.length(); i++) {

            if (st.charAt(i) != pt.charAt(i)) {
                isEqual = false;
                break;

            }
        }
        System.out.println(isEqual);
    }
}
