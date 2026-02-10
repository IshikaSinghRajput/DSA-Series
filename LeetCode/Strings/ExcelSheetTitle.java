public class ExcelSheetTitle {

    public static String title(int n){
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            int r = (n - 1) % 26;
            sb.append((char) (r + 'A'));
            n = ( n - 1 ) / 26;
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(title(n));
    }
}
