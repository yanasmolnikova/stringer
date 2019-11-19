public class Stringer implements Comparable<StringBuilder> {
    StringBuilder sb;

    public Stringer(String str) {
        this.sb = new StringBuilder(str);
    }

    public int compareTo(StringBuilder another) {
        return this.sb.compareTo(another);
    }

    public Stringer append(Object obj) {
        return this.append(String.valueOf(obj));
    }

    public Stringer append(String str) {
        this.sb.append(str);
        return this;
    }

    public Stringer append(StringBuffer sb) {
        this.sb.append(sb);
        return this;
    }

    public Stringer append(CharSequence s) {
        this.sb.append(s);
        return this;
    }

    public Stringer append(CharSequence s, int start, int end) {
        this.sb.append(s, start, end);
        return this;
    }

    public Stringer append(char[] str) {
        this.sb.append(str);
        return this;
    }

    public Stringer append(char[] str, int offset, int len) {
        this.sb.append(str, offset, len);
        return this;
    }

    public Stringer append(boolean b) {
        this.sb.append(b);
        return this;
    }

    public Stringer append(char c) {
        this.sb.append(c);
        return this;
    }

    public Stringer append(int i) {
        this.sb.append(i);
        return this;
    }

    public Stringer append(long lng) {
        this.sb.append(lng);
        return this;
    }

    public Stringer append(float f) {
        this.sb.append(f);
        return this;
    }

    public Stringer append(double d) {
        this.sb.append(d);
        return this;
    }

    public Stringer appendCodePoint(int codePoint) {
        this.sb.appendCodePoint(codePoint);
        return this;
    }

    public Stringer delete(int start, int end) {
        this.sb.delete(start, end);
        return this;
    }

    public Stringer deleteCharAt(int index) {
        this.sb.deleteCharAt(index);
        return this;
    }

    public Stringer replace(int start, int end, String str) {
        this.sb.replace(start, end, str);
        return this;
    }

    public Stringer insert(int index, char[] str, int offset, int len) {
        this.sb.insert(index, str, offset, len);
        return this;
    }

    public Stringer insert(int offset, Object obj) {
        this.sb.insert(offset, obj);
        return this;
    }

    public Stringer insert(int offset, String str) {
        this.sb.insert(offset, str);
        return this;
    }

    public Stringer insert(int offset, char[] str) {
        this.sb.insert(offset, str);
        return this;
    }

    public Stringer insert(int dstOffset, CharSequence s) {
        this.sb.insert(dstOffset, s);
        return this;
    }

    public Stringer insert(int dstOffset, CharSequence s, int start, int end) {
        this.sb.insert(dstOffset, s, start, end);
        return this;
    }

    public Stringer insert(int offset, boolean b) {
        this.sb.insert(offset, b);
        return this;
    }

    public Stringer insert(int offset, char c) {
        this.sb.insert(offset, c);
        return this;
    }

    public Stringer insert(int offset, int i) {
        this.sb.insert(offset, i);
        return this;
    }

    public Stringer insert(int offset, long l) {
        this.sb.insert(offset, l);
        return this;
    }

    public Stringer insert(int offset, float f) {
        this.sb.insert(offset, f);
        return this;
    }

    public Stringer insert(int offset, double d) {
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
        this.sb.reverse();
        return this;
    }

    @Override
    public String toString() {
        return this.sb.toString();
    }
}
