class ShortDisToTargetString {

    public static int closeDist(String[] words, String target, int stIdx) {
        int n = words.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int diff = Math.abs(i - stIdx);
                int circularDis = Math.min(diff, n - diff);
                ans = Math.min(ans, circularDis);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {
        String[] words = { "hello", "i", "am", "leetcode", "hello" };

        System.out.println(closeDist(words, "hello", 1));
    }
}
