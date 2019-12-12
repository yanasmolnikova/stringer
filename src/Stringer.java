import java.util.Stack;

public class Stringer implements Comparable<StringBuilder> {
    private StringBuilder sb;   // delegation StringBuilder's methods
    private Stack<Action> actions = new Stack<>();   // history stack

    private interface Action {
        void undo();
    }

    public Stringer(String str) {
        this.sb = new StringBuilder(str);   // create StringBuilder object
        this.updateHistory("");     // initial history value
    }

    private void updateHistory(String str) {
        Action action = () -> sb.delete(sb.length() - str.length(), sb.length());
        this.actions.add(action);
    }

    public int compareTo(StringBuilder another) {
        return this.sb.compareTo(another);
    }

    public void undo() {
        if (!this.actions.empty()) {
            this.actions.pop().undo();
        }
    }

    public Stringer append(Object obj) {
        this.updateHistory(this.sb.toString());     // save old version
        return this.append(String.valueOf(obj));
    }

    public Stringer append(String str) {
        this.updateHistory(this.sb.toString());
        this.sb.append(str);
        return this;
    }

    public Stringer append(StringBuffer sb) {
        this.updateHistory(this.sb.toString());
        this.sb.append(sb);
        return this;
    }

    public Stringer append(CharSequence s) {
        this.updateHistory(this.sb.toString());
        this.sb.append(s);
        return this;
    }

    public Stringer append(CharSequence s, int start, int end) {
        this.updateHistory(this.sb.toString());
        this.sb.append(s, start, end);
        return this;
    }

    public Stringer append(char[] str) {
        this.updateHistory(this.sb.toString());
        this.sb.append(str);
        return this;
    }

    public Stringer append(char[] str, int offset, int len) {
        this.updateHistory(this.sb.toString());
        this.sb.append(str, offset, len);
        return this;
    }

    public Stringer append(boolean b) {
        this.updateHistory(this.sb.toString());
        this.sb.append(b);
        return this;
    }

    public Stringer append(char c) {
        this.updateHistory(this.sb.toString());
        this.sb.append(c);
        return this;
    }

    public Stringer append(int i) {
        this.updateHistory(this.sb.toString());
        this.sb.append(i);
        return this;
    }

    public Stringer append(long lng) {
        this.updateHistory(this.sb.toString());
        this.sb.append(lng);
        return this;
    }

    public Stringer append(float f) {
        this.updateHistory(this.sb.toString());
        this.sb.append(f);
        return this;
    }

    public Stringer append(double d) {
        this.updateHistory(this.sb.toString());
        this.sb.append(d);
        return this;
    }

    public Stringer appendCodePoint(int codePoint) {
        this.updateHistory(this.sb.toString());
        this.sb.appendCodePoint(codePoint);
        return this;
    }

    public Stringer delete(int start, int end) {
        this.updateHistory(this.sb.toString());
        this.sb.delete(start, end);
        return this;
    }

    public Stringer deleteCharAt(int index) {
        this.updateHistory(this.sb.toString());
        this.sb.deleteCharAt(index);
        return this;
    }

    public Stringer replace(int start, int end, String str) {
        this.updateHistory(this.sb.toString());
        this.sb.replace(start, end, str);
        return this;
    }

    public Stringer insert(int index, char[] str, int offset, int len) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(index, str, offset, len);
        return this;
    }

    public Stringer insert(int offset, Object obj) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(offset, obj);
        return this;
    }

    public Stringer insert(int offset, String str) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(offset, str);
        return this;
    }

    public Stringer insert(int offset, char[] str) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(offset, str);
        return this;
    }

    public Stringer insert(int dstOffset, CharSequence s) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(dstOffset, s);
        return this;
    }

    public Stringer insert(int dstOffset, CharSequence s, int start, int end) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(dstOffset, s, start, end);
        return this;
    }

    public Stringer insert(int offset, boolean b) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(offset, b);
        return this;
    }

    public Stringer insert(int offset, char c) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(offset, c);
        return this;
    }

    public Stringer insert(int offset, int i) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(offset, i);
        return this;
    }

    public Stringer insert(int offset, long l) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(offset, l);
        return this;
    }

    public Stringer insert(int offset, float f) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(offset, f);
        return this;
    }

    public Stringer insert(int offset, double d) {
        this.updateHistory(this.sb.toString());
        this.sb.insert(offset, d);
        return this;
    }

    public int indexOf(String str) {
        return this.sb.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return this.sb.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return this.sb.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return this.sb.lastIndexOf(str, fromIndex);
    }

    public Stringer reverse() {
        this.updateHistory(this.sb.toString());
        this.sb.reverse();
        return this;
    }

    @Override
    public String toString() {
        return this.sb.toString();
    }
}
