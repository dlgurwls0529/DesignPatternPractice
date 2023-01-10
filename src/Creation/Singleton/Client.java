package Creation.Singleton;

public class Client {
    public static void main(String[] args) {
/*
        // 시스템 런타임, 환경 세팅 정보 등 인스턴스가 여러개로 존재하면 문제가 생기는 경우가 있다.
        // 이때, 단 하나의 유일한 인스턴스를 제공하는 클래스가 필요하다.

        // 싱글톤 패턴이란 단 하나의 유일 인스턴스를 제공하는 클래스 구현 방식이다.

        // 두 객체가 같은지 검사한다.
        // True 면 싱글턴이 제대로 적용된 것이다.

        // 첫 번째는 가장 기본적인 싱글톤이다.
        // 생성자를 private 으로 묶고, static 필드를 선언해 싱글톤을 관리한다.
        // 단점 1. 멀티스레드 환경에서 안전하지 않다.
        BasicSingleton basicSingleton1 = BasicSingleton.getInstance();
        BasicSingleton basicSingleton2 = BasicSingleton.getInstance();
        System.out.println(basicSingleton1.equals(basicSingleton2));

        // 두 번째는 동기화된 싱글톤이다.
        // 단순히 getInstance 함수에 synchronized 키워드를 추가하여,
        // 해당 함수 내에 복수 스레드의 접근을 제한한다.
        // 장점 1. 멀티스레드 환경에서 안전하다.
        // 장점 2. 객체 생성 비용이 클 때, 비교적 효율적이다. (Lazy Initialization)
        // 단점 1. 항상 getInstance 호출 시 synchronized 키워드에서 오버헤드에 의한 성능 저하가 발생한다.
        SynchronizedSingleton synchronizedSingleton1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton synchronizedSingleton2 = SynchronizedSingleton.getInstance();
        System.out.println(synchronizedSingleton1.equals(synchronizedSingleton2));

        // 세 번째는 Eager Initialization 방식이다.
        // final 인스턴스를 미리 생성하여 getInstance 호출 시마다 반환만 하는 것이다.
        // 클래스 로드 시점에 단 한번만 객체가 만들어진다.
        // 장점 1. 멀티스레드 환경에서 안전하다.
        // 장점 2. getInstance 호출 시 별도의 오버헤드가 없다.
        // 단점 1. 객체 생성 비용이 클 때, 비효율적이다. (Eager Initialization)
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1.equals(eagerSingleton2));

        // 네 번째는 Double checked locking 방식이다.
        // if 로 null 을 검사한 뒤, synchronized 블록으로 동기화된
        // (synchronized(<클래스>.class), 해당 클래스에서 블록의 접근을 통제)
        // if 절로 null 을 다시 검사하는 것이다.
        // 그리고 instance 필드에 volatile 키워드를 붙인다.
        // 장점 1. instance 가 null 인 상황에서만 동기화 블록이 작동되므로, 오버헤드가 덜하다.
        // 장점 2. 객체 생성 비용이 클 때, 비교적 효율적이다. (Lazy Initialization)
        // 단점 1. 너무 복잡하다.
        // 단점 2. 자바 1.5 버전 이상에서만 작동한다.
        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton2 = DoubleCheckSingleton.getInstance();
        System.out.println(doubleCheckSingleton1.equals(doubleCheckSingleton2));

        // 다섯 번째는 static inner 클래스를 활용한 방식이다. (권장)
        // 이너클래스(Holder)를 선언하고, 그 안에 인스턴스 필드를 선언 및 생성한다. (이너 클래스는 반드시 static 붙이는게 원칙이다!)
        // 이후, getInstance 에서는 홀더의 인스턴스를 반환한다.
        // 언뜻 보면 Eager Initialization 같지만, 이너 클래스는 getInstance 가 호출될 때
        // 로딩이 된다. 정확히는 이너 클래스가 사용될 때 로딩이 되므로, Lazy 방식이다.
        // 그냥 클래스는 컴파일 타임에 전부 로딩된다는 점과 대비된다.
        // 장점 1. 간단하다.
        // 장점 2. 객체 생성 비용이 클 때, 비교적 효율적이다. (Lazy Initialization)
        // 장점 3. 동기화 블록에 의한 별도의 오버헤드가 없다.
        HolderSingleton holderSingleton1 = HolderSingleton.getInstance();
        HolderSingleton holderSingleton2 = HolderSingleton.getInstance();
        System.out.println(holderSingleton1.equals(holderSingleton2));

        // 이상의 싱글톤은 리플렉션과 직렬화&역직렬화 방식으로 깨뜨릴수 있다.
        // 근데, 이거는 너무 복잡해서 그냥 넘어간다.

        // 여섯 번째는 enum 을 활용한 방식이다. (권장)
        // enum 으로 클래스의 역할을 대신한다.
        // 그리고 그냥 INSTANCE 키워드로 인스턴스를 선언한다.
        // 이후 <Enum 이름>.INSTANCE 방식으로 인스턴스에 접근한다.
        // 장점 1. 리플렉션과 직렬화에도 안전하다.
        // 단점 2. 객체 생성 비용이 클 때, 비효율적이다. (Eager Initialization)
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton1.equals(enumSingleton2));
*/

    }
}
