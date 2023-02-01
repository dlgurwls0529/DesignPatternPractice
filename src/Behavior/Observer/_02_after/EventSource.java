package Behavior.Observer._02_after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {
        // 콘솔에서 입력받는 스트림
        final InputStreamReader isr = new InputStreamReader(System.in);
        final BufferedReader br = new BufferedReader(isr);

        // 계속 입력받는다.
        while(true) {
            try {
                final String response = br.readLine();
                // 변경되었음을 알리는 state 를 true 로 바꾸는 듯
                super.setChanged();
                // 등록된 옵저버들에게 response 전달하고 콜백 호출
                super.notifyObservers(response);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
