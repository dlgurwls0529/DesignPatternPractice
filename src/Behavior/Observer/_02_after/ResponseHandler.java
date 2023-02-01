package Behavior.Observer._02_after;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String response) {
            System.out.println("\nReceived Response: " + response);
        }
    }
}
