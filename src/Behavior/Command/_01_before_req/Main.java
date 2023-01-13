package Behavior.Command._01_before_req;

public class Main {
    public static void main(String[] args) {
        ButtonA buttonA = new ButtonA(new Faucet());
        ButtonB buttonB = new ButtonB(new Faucet());
        ButtonC buttonC = new ButtonC(new Computer());

        buttonA.press();
        buttonB.press();
        buttonC.press();

        /*
        요구 사항에 맞추어 바꾸어라
        1. light 에 끄기 기능을 추가하라, 모든 버튼에 해당 기능 넣기
        - Light 클래스에 turnOff 메소드 추가
        - ButtonA 클래스에 turnOn 메소드 turnOff 로 바꾸기
        - ButtonB 클래스에 turnOn 메소드 turnOff 로 바꾸기
        2. 새로운 가구인 컴퓨터를 추가하라, ButtonC 에 추가.
        - Computer 클래스 만들기
        - ButtonC 클래스 필드 수정
        - ButtonC 클래스 생성자 수정
        - ButtonC 클래스 메소드 수정
        - Main 에서 ButtonC 생성자 인자 수정
        3. ButtonA, B의 기능을 faucet 으로 바꾸어라
        - ButtonA 클래스 필드 수정
        - ButtonA 클래스 생성자 수정
        - ButtonA 클래스 메소드 수정
        - Main 에서 ButtonA 인자 수정
        - ButtonB 클래스 필드 수정
        - ButtonB 클래스 생성자 수정
        - ButtonB 클래스 메소드 수정
        - Main 에서 ButtonB 인자 수정
        4. faucet 의 turnOn에 세기 옵션을 추가
        - faucet 에서 메소드 시그니처 변경
        - ButtonB 의 수정
        - ButtonA 의 수정
        */
    }
}
