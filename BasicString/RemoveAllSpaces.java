public class RemoveAllSpaces {
    public static void main(String[] args) {
        String st = "   Hello  World  ";
        st = st.replaceAll("\\s", "");
        System.out.println(st);
    }
}
