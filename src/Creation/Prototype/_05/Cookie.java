package Creation.Prototype._05;

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
        Source source = new Source(null);
        source.setName(this.getSource().getName());

        Cookie cookie = new Cookie(null);
        cookie.setSource(source);

        return cookie;
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
