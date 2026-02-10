public class DuplicateCharacter {

    public static void duplicates(String st){
        int[] freq = new int[256];

        for(int i = 0; i < st.length(); i++){
            freq[st.charAt(i)]++;
        }

        for(int i = 0; i < 256; i++){
            if(freq[i] > 1){
                System.out.println((char)i + "->" + freq[i] );
            }
        }
    }
    public static void main(String[] args) {
        String st = "geeks for geeks";
        duplicates(st);
    }
}
