package Creation.Prototype._04;

import java.util.Objects;

public class Cookie implements Cloneable {

    private Source source;

    public void setSource(Source source) {
        this.source = source;
    }

    public Source getSource() {
        return source;
    }

    public Cookie(Source source) {
        this.source = source;
    }

    @Override
    protected Object clone(){
        Object obj;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            obj = null;
        }

        return obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cookie cookie = (Cookie) o;
        return Objects.equals(source, cookie.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source);
    }
}
