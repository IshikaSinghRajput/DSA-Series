import java.util.Stack;

class ValidParenthesis{

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '(') st.push(arr[i]);
            else if(arr[i] == ')') {
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(()))";

        System.out.println(isValid(s));
    }
}