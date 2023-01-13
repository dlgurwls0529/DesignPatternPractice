package Behavior.ChainOfResponsibility._04_;

public abstract class RequestHandler {

    private final RequestHandler requestHandler;

    protected RequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void handle(Request request) {
        if(requestHandler != null) {
            requestHandler.handle(request);
        }
        // 이 부분이 핵심
        // 여기를 가지고, 요청 처리 객체와 요청 보내는 객체를 분리할 수 있다.
        /*
        뭔 소리냐면,
        <요청 보내는 클래스>
        요청
        필터 = 요청 필터 1(요청) // 처리하는 객체
        요청 보냄
        필터 = 요청 필터 2(요청) // 처리하는 객체
        요청 처리
        필터 = 요청 필터 3(요청) // 처리하는 객체
        요청 처리

        이런식으로 처리했는데,

        저 부분으로 연쇄처리를 캡슐화하면

        필터들 = 필터1(필터2(필터3(null)))
        요청 처리

        이런식으로 되어서,(캡슐화에 의한 분리)

        <처리 객체 컨테이너?>
        return 필터1(필터2(필터3(null)))
        // 요청 필터를 구성.

        <요청 보내는 클래스>
        필터들 = 처리 객체 컨테이너.getFilter()
        필터들.처리(요청)

        이러면 처리 하는 부분이 보내는 부분에서 없어진다.

        일케 되어서, 보내는 부분이 여러개라서, 처리 사슬을
        <보내는 곳 1>
            처리1
            처리2
            처리3
        <보내는 곳 2>
            처리1
            처리2
            처리3
        <보내는 곳 3>
            처리1
            처리2
            처리3
        이러면, 처리 사슬을 바꾸려면 싹다고쳐야하는데
        <보내는 곳 1>
            처리
        <보내는 곳 2>
            처리
        <보내는 곳 3>
            처리
        <컨테이너>
            처리1
            처리2
            처리3
        컨테이너만 건들믄 된다.

        사실 캡슐화, SRP, .. 의 효과라 봐도 된다.

         */
    }
}
