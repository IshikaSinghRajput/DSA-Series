//Leetcode 682

import java.util.Stack;

public class BaseBallGame {

    public static int baseBall(String[] operations){
        Stack<Integer> st = new Stack<>();

        for(String op : operations){
            if(op.equals("+")){
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
            }

            else if(op.equals("D")){
                st.push(2 * st.peek());
            }

            else if(op.equals("C")){
                st.pop();
            }

            else st.push(Integer.parseInt(op));
        }

        int total = 0;
        for(int n : st){
            total += n;
        }
        return total;
    }
    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(baseBall(operations));
    }
}
