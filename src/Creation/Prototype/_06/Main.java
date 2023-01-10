package Creation.Prototype._06;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Cookie chocoCookie = new Cookie(
                new Source("choco")
                , "chocoCookie"
                , "1000"
                , "yudakyum");

        printField(chocoCookie);

        Cookie planeCookie = (Cookie) chocoCookie.clone();
        planeCookie.setName("planeCookie");
        planeCookie.setSource(null);

        printField(planeCookie);

        /*Cookie advancedChocoCookie = (Cookie) chocoCookie.clone();
        printField(advancedChocoCookie);*/
        // Cookie 클래스에서 clone 함수 리턴 시 object o = new Cookie(source, this.getName(), this.getCost(), this.getMaker());
        // 처럼 Cookie 타입 객체가 한번 Object 타입으로 업캐스팅 된 후
        // Main 클래스에서 (Cookie) chocoCookie.clone();로써 다시 다운캐스팅 된거니까
        // 다운캐스팅 오류 안뜬다.

        AdvancedCookie advancedCookie = new AdvancedCookie(new Source("choco"), "advancedCookie", "10000", "na", "31");
        AdvancedCookie advancedCookie1 = (AdvancedCookie) advancedCookie.clone();
        printField(advancedCookie1);

        // AdvancedCookie advancedCookie1 = (AdvancedCookie) chocoCookie.clone();
        // 안됨, 왜냐하면, clone 으로 생성된 o 객체가 AdvancedCookie 에서 Object 타입으로 업캐스팅 된 적이 없기 때문
        // 위에꺼는 Cookie 클래스에서 Cookie 객체가 반환 타입으로 인해 Object 로 업캐스팅 되었지만
        // 아래꺼는 그러한 과정이 없기 때문




    }

    private static void printField(Object o) {
        Class<?> clz = o.getClass();
        Field[] field = clz.getDeclaredFields();

        System.out.println("< " + o.hashCode() + " >");

        for(int i = 0; i < field.length; i++) {
            field[i].setAccessible(true);
            try {
                System.out.println(field[i].getName() + " : " + field[i].get(o));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }
}
