package Behavior.Observer._02_after;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Text >");

        // 이벤트 발행자를 생성
        final EventSource evSrc = new EventSource();
        final ResponseHandler respHandler = new ResponseHandler();

        evSrc.addObserver(respHandler);

        // 입력 이벤트를 계속 발행하는 쓰레드 시작.
        // 이벤트 : 상태 변화 혹은 어떤 사건의 발생
        // 이벤트 소스 : 마우스, 키보드 입력 .. 등 내외부 입력
        // 이벤트 알림 : 이벤트 발생 시 이벤트 소비자에게 알린다.(소비자에게 메시지로 전달 = 소비자의 메소드 호출)
        Thread thread = new Thread(evSrc);
        thread.start();
    }
}
