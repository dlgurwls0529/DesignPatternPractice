package Creation.Prototype._07;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Cookie cookie = new Cookie();
        Cookie cookie1 = (Cookie) cookie.clone();

        CoconutCookie coconutCookie = new CoconutCookie();
        CoconutCookie coconutCookie1 = (CoconutCookie) coconutCookie.clone();

        // 1. Cookie 에서만 오버라이딩, 얕은 복사
        // 2. Cookie 에서만 오버라이딩, 깊은 복사, line10에서만 타입 에러
        // 3. Cookie cookie = (Cookie) super.clone(); 이렇게 하면 또 된다.
        // 4. Concrete Prototype 에서도 오버라이딩 해주면 또 된다.
        // 5. 딥카피 할때는 걍 Concrete 에서도 오버라이딩 하는게 정석인듯
        // 웬만하면 그냥 얕은 복사에서도 Concrete 클래스에서 오버라이딩 하는게 좋다.

    }
}
