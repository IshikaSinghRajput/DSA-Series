public class ConvertStrToLowerOrUpper {
    public static void main(String[] args) {
        String st = "Hello World";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < st.length(); i++){
            char c = st.charAt(i);

            if(c >= 65 && c <= 90){
                sb.append(Character.toLowerCase(c)) ;
            }
            else if(c >= 97 && c <= 122){
                sb.append(Character.toUpperCase(c)); 
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
