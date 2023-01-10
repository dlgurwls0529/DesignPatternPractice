package Creation.Prototype._06;

import java.util.Objects;

public class Cookie implements Cloneable {

    private Source source;
    private String name;
    private String cost;
    private String maker;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Source getSource() {
        return source;
    }

    public Cookie(Source source, String name, String cost, String maker) {
        this.source = source;
        this.name = name;
        this.cost = cost;
        this.maker = maker;
    }

    @Override
    protected Object clone(){
        Source source = new Source(null);
        source.setName(this.getSource().getName());

        return new Cookie(source, this.getName(), this.getCost(), this.getMaker());
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
