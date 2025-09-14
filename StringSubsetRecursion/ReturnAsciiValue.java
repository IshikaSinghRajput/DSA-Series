import java.util.ArrayList;

public class ReturnAsciiValue {
    public static void main(String[] args) {
    System.out.println(arrListAscii(" ", "abc"));
    }

    static void substringAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        substringAscii(p + ch, up.substring(1));
        substringAscii(p , up.substring(1));
        substringAscii(p + (ch+0) , up.substring(1));
    }

    static ArrayList<String> arrListAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = arrListAscii(p + ch, up.substring(1));
        ArrayList<String> second = arrListAscii(p , up.substring(1));
        ArrayList<String> third = arrListAscii(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
