public class FindLargestWordInSentence {
    public static void main(String[] args) {
        String st = "I love programming";
        int maxLen = 0;
        String currWord = "";
        String maxWord = "";

        for (int i = 0; i <= st.length(); i++) {
            if (i == st.length() || st.charAt(i) == ' ') {
                if (currWord.length() > maxLen) {
                    maxLen = currWord.length();
                    maxWord = currWord;
                }
                currWord = "";
            } else {
                currWord += st.charAt(i);
            }
        }
        System.out.println(maxWord + " " + maxLen);
    }
}
