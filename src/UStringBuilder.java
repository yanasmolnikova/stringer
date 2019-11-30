import java.util.Stack;

public class UStringBuilder {
    private interface Action {
        void undo();
    }

    private StringBuilder builder = new StringBuilder();
    private Stack<Action> actions = new Stack<>();

    void append(String str) {
        builder.append(str);

        Action action = () -> builder.delete(builder.length() - str.length(), builder.length());
        actions.add(action);
    }

    void undo() {
        if(!actions.isEmpty()){
            actions.pop().undo();
        }
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
