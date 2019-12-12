public class Main {
    public static void main(String[] args) {
        Stringer stringer = new Stringer("Hello");
        stringer.append(" World");

        System.out.println(stringer.toString());
    }
}
