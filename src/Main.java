public class Main {
    public static void main(String[] args) {
        Stringer stringer = new Stringer("Hello");
        stringer.append(" World");
        stringer.undo();
        stringer.undo();
        stringer.undo();
        System.out.println(stringer.toString());

        UStringBuilder builder = new UStringBuilder();

        builder.append("Hello");
        builder.append(", Yana");
        builder.undo();

        System.out.println(builder.toString());
    }
}
