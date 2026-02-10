public class RemoveVowels {

    public static String removeVowels(String st){
      StringBuilder sb = new StringBuilder();
        for(int i = 0; i < st.length(); i++){
            char c = st.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String st = "geeks for geeks";
        System.out.println(removeVowels(st));
    }
}
