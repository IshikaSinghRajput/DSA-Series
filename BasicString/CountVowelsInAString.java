public class CountVowelsInAString {
    public static void main(String[] args) {
        String st = "Hello World";
        st = st.toLowerCase().replace(" ", "");

        int vowels = 0;
        int cons = 0;

        for(int i = 0; i < st.length(); i++){
            char c = st.charAt(i);
            
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
            else cons++;
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + cons);
    }
}
