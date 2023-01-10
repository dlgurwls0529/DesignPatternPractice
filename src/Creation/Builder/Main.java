package Creation.Builder;

public class Main {
    public static void main(String[] args) {
        /*
        https://dreamcoding.tistory.com/56

        배경 :
          일관된 process 가 없다.
          객체가 불완전하게 만들어진다.
            예시 : 여행 계획에서 Day 는 있으나 Night 가 없는 경우
          생성자 파라미터 목록이 너무 장황하다.
          생성자가 많으면 헷갈려.

        의미 :
          객체를 생성하는 과정(생성자)과 객체를 조립(파라미터로 필드 설정
          그냥 setter 처럼 필드 설정하는 과정?)
          하는 과정을 분리하여, 동일한 생성 과정(인터페이스에 정의된
          순차 단계는 같음)으로 다양한 결과의 객체를 만드는 패턴(같은 프로세스
          를 따르나 각 프로세스가 Concrete Builder 에 따라 달라짐(
          오버라이딩 구현이 달라짐))

          공통 프로세스를 인터페이스 추상메소드로 정의,
          Concrete Builder 를 통해 각기 다른 표현을 만드는 방식을 구현,
          이후 자신이 원하는 객체의 형태에 따라서(Long Tour 인지 Short Tour 인지)
          Concrete Builder 를 설정하여 객체를 생성한다.


        lombok annotation:
          클래스 위에 @Builder 붙이면, 사용 시 빌더처럼 쓸 수 있다.

        Builder 필드:
          Builder 부분에도 Product 의 필드를 명시하는 경우 장황할 수 있다.
          이 경우 Product 객체를 Builder 필드로 추가하고 빌더 객체 생성 시
          이를 초기화한다음, Product 객체로 필드에 접근하면 된다.

        장점 :
          순서를 강제할 수 있다. (스텝별 interface)
          생성자에 파라미터 넘길 때, 그것을 검증? 하는 로직을 분리 할 수 있다. (SRP?)
          동일한 프로세스(날짜, 계획, 제목 ..)로 다양한 형태를 가진
          (shortTourPlanBuilder, vipTourPlan Builder.. (인자 처리 방식이 살짝 다른))
          객체를 생성할 수 있다.

        단점 :
          Director 나 아니면 Builder 클래스를 따로 만들어야 한다.
          구조가 복잡하다.

          객체 생성 패턴
          1.

          메소드 체이닝
          https://dreamcoding.tistory.com/60
         */

    }
}
