package Creation.Prototype._08;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Cookie cookie = new Cookie();
        Cookie cookie1 = (Cookie) cookie.clone();

        CoconutCookie coconutCookie = new CoconutCookie();
        CoconutCookie coconutCookie1 = (CoconutCookie) coconutCookie.clone();
        // cookie 에서 Object 로 한번 업캐스팅 함.
        // 가능한거는 Object 에서 cookie 로 다운캐스팅
        // d


    }
}
