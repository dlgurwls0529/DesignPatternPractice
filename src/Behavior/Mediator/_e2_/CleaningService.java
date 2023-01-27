package Behavior.Mediator._e2_;

import java.util.Map;

public class CleaningService extends Colleague{

    public CleaningService(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg, Map<String, Object> par) {
        // System.out.println("미구현");
    }

    @Override
    public void receive(Colleague sender, String msg, Map<String, Object> par) {
        if(msg.equals("clean") && sender instanceof Gym) {
            System.out.println("start gym cleaning");
        }
        else if(msg.equals("clean") && sender instanceof Restaurant) {
            System.out.println("start restaurant cleaning");
        }
        else if(msg.equals("getTower")) {
            try {
                System.out.println("give " + par.get("name") + " " + par.get("numberOfTower") + " towers");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else {

        }
    }
}
