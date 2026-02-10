public class StrongPassword {

    public static int strongPass(String st, int n){
        boolean isDigit = false;
        boolean isLower = false;
        boolean isUpper = false;
        boolean isSpecial = false;
        
        String special = "!@#$%^&*()-+";

        for(int i = 0; i < st.length(); i++){
            char c = st.charAt(i);
            if(Character.isDigit(c)) isDigit = true;
            else if(Character.isLowerCase(c)) isLower = true;
            else if(Character.isUpperCase(c)) isUpper = true;
            else if(special.indexOf(c) != -1) isSpecial = true;

        }

        int missing = 0;
        if(!isDigit) missing++;
        if(!isLower) missing++;
        if(!isUpper) missing++;
        if(!isSpecial) missing++;

        return Math.max(missing, 6-n);
    }
    public static void main(String[] args) {
        String st = "Aa1";
        int n = 3;

        System.out.println(strongPass(st, n));
    }
}
