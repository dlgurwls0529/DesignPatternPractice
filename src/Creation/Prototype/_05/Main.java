package Creation.Prototype._05;

public class Main {
    public static void main(String[] args) {
        Cookie cookie = new Cookie(new Source("choco"));
        Cookie cookie1 = (Cookie) cookie.clone();

        //https://simuing.tistory.com/entry/JAVA-Test111-%EC%83%81%EC%86%8D-%EA%B4%80%EA%B3%84%EC%97%90-%EC%9E%88%EB%8A%94-%ED%81%B4%EB%9E%98%EC%8A%A4%EB%93%A4-%EA%B0%84%EC%9D%98-%EC%BA%90%EC%8A%A4%ED%8C%85-%EC%97%85-%EC%BA%90%EC%8A%A4%ED%8C%85-%EB%8B%A4%EC%9A%B4-%EC%BA%90%EC%8A%A4%ED%8C%85

        System.out.println(cookie != cookie1);
        System.out.println(cookie.equals(cookie1));
        System.out.println(cookie.getSource() == cookie1.getSource());

        // https://hyunmin1906.tistory.com/176

        Cookie blackCookie = new BlackCookie(new Source("blackChoco"));
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
