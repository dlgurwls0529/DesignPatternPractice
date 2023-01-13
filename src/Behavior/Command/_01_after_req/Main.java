package Behavior.Command._01_after_req;

public class Main {
    public static void main(String[] args) {
        ButtonA buttonA = new ButtonA(new FaucetTurnOnCommand(new Faucet()));
        ButtonB buttonB = new ButtonB(new FaucetTurnOnCommand(new Faucet()));
        ButtonC buttonC = new ButtonC(new ComputerTurnOnCommand(new Computer()));

        buttonA.press();
        buttonB.press();
        buttonC.press();

        /*
        요구 사항에 맞추어 바꾸어라
        1. light 에 끄기 기능을 추가하라, 해당되는 모든 버튼에 해당 기능 넣기
        - Light 에 끄기 메소드 추가
        - 끄기 커맨드 클래스 추가
        - Main 에서 커맨드들 인자 바꾸기
        2. 새로운 가구인 컴퓨터를 추가하라, ButtonC 에 추가.
        - Computer 클래스 추가
        - 컴퓨터에 대한 커맨드 클래스 추가
        - Main 에서 해당 커맨드 인자로 넣기
        3. ButtonA, B의 기능을 faucet 으로 바꾸어라
        - Main 에서 ButtonA 인자 수정
        - Main 에서 ButtonB 인자 수정
        4. faucet 의 turnOn에 세기 옵션을 추가
        - faucet 에서 메소드 시그니처 변경
        - FaucetTurnOnCommand 수정
        */
    }
}
