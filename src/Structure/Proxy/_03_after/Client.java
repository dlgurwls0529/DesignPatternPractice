package Structure.Proxy._03_after;

public class Client {

    public static void main(String[] args) {
        EventService eventService = new ProxyTestEventService(
                new TestEventService()
        );

        eventService.createEvent();
        eventService.publishEvent();
    }
}
