package Behavior.ChainOfResponsibility._03_;

public class ClientA {

    public void work() {
        // 여기까지는 이전과 똑같다. 처리 과정이 노출되어있다.
        RequestHandler requestHandler = new AuthRequestHandler(
                new LoggingRequestHandler(
                        new PrintRequestHandler(null)
                )
        );

        // 외부에서의 의존성 주입으로 여기처럼 처리 과정을 Client 로부터 숨길 수 있다.
        requestHandler = RequestHandlerContainer.getRequestHandler();

        // new 연쇄를 감추어야 하는 이유 -> 다수 클라이언트에서
        // 생성부를 알게되면,후에 변경해야 하는 코드량(Client 에 비례) 증가

        // _01_ : 하나의 핸들러에 모든 코드 : 핸들러에서 낮은 응집도, 캡슐화 잘 안됨
        // _02_ : 처리 과정이 Client 에게 노출 : 핸들러를 각각 캡슐화 응집도 증가 : 각 핸들러(처리)의 연쇄적 과정이 클라이언트에 노출
        // _03_ : 책임 연쇄 패턴 : 조합과 그 처리가 분리가 가능하게 함(DI 안쓰면 노출)

        // 즉, 이 패턴은 처리 작업과 연쇄 처리의 조합 과정을 분리하여 DI 같은 것을 통해 은닉할 수 있게 한다.

        Request checkedRequest = new Request("윤기좋아.:인증OK");
        requestHandler.handle(checkedRequest);
    }
}
