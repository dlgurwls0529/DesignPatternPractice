package Creation.Prototype._04;

public class Main {
    public static void main(String[] args) {
        Cookie cookie = new Cookie(new Source("choco"));
        Cookie cookie1 = (Cookie) cookie.clone();

        System.out.println(cookie != cookie1);
        System.out.println(cookie.equals(cookie1));
        System.out.println(cookie.getSource() == cookie1.getSource());

        BlackCookie blackCookie = new BlackCookie(new Source("blackChoco"));
        BlackCookie blackCookie1 = (BlackCookie) blackCookie.clone();

        System.out.println(blackCookie != blackCookie1);
        System.out.println(blackCookie.equals(blackCookie1));
        System.out.println(blackCookie.getSource() == blackCookie1.getSource());

        BlueCookie blueCookie = new BlueCookie(new Source("blueChoco"));
        BlueCookie blueCookie1 = (BlueCookie) blueCookie.clone();

        System.out.println(blueCookie != blueCookie1);
        System.out.println(blueCookie.equals(blueCookie1));
        System.out.println(blueCookie.getSource() == blueCookie1.getSource());

    }
}
