import java.util.*;

public class SubString {
    public static void main(String[] args) {
      System.out.println(arrList("", "abc"));
    }

    static void substring(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        substring(p + ch, up.substring(1));
        substring(p , up.substring(1));
    }

    static ArrayList<String> arrList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = arrList(p + ch, up.substring(1));
        ArrayList<String> right = arrList(p , up.substring(1));

        left.addAll(right);
        return left;
    }
}
