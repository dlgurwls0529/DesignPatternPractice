package Structure.Proxy._03_after;

public class ProxyTestEventService implements EventService {

    TestEventService testEventService;

    public ProxyTestEventService(TestEventService testEventService) {
        this.testEventService = testEventService;
    }

    @Override
    public void createEvent() {
        long begin = System.currentTimeMillis();
        testEventService.createEvent();
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void publishEvent() {
        long begin = System.currentTimeMillis();
        testEventService.publishEvent();
        System.out.println(System.currentTimeMillis() - begin);
    }
}
