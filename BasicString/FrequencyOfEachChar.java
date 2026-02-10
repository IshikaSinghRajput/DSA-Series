public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String st = "Hello World";
        st = st.toLowerCase();
        boolean[] visited = new boolean[st.length()];

        for (int i = 0; i < st.length(); i++) {
            if (visited[i])
                continue;
            char c = st.charAt(i);
            int count = 1;
            for (int j = i + 1; j < st.length(); j++) {
                if (c == st.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }
            if (c != ' ') {
                System.out.println(c + " count : " + count);
            }

        }

    }
}
