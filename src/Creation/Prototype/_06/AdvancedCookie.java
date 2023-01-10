package Creation.Prototype._06;

public class AdvancedCookie extends Cookie{

    private String size;

    public AdvancedCookie(Source source, String name, String cost, String maker, String size) {
        super(source, name, cost, maker);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    protected Object clone() {
        Source source = new Source(null);
        source.setName(this.getSource().getName());

        return new AdvancedCookie(source, this.getName(), this.getCost(), this.getMaker(), this.getSize());
    }
}
