public class CountWordsInSentence {
    public static void main(String[] args) {
        String st = "My name is Ishika";
        st = st.toLowerCase();
        int count = 1;
        char[] c = st.toCharArray();

        for(int i = 0; i < st.length(); i++){
           
            if(c[i] == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
