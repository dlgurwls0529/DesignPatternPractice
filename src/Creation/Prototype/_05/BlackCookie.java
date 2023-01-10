package Creation.Prototype._05;

public class BlackCookie extends Cookie {

    public BlackCookie(Source source) {
        super(source);
    }

    @Override
    protected Object clone() {
        Source source = new Source(null);
        source.setName(this.getSource().getName());

        BlackCookie blackCookie = new BlackCookie(null);
        blackCookie.setSource(source);

        return blackCookie;
    }
}
