package follow;

public class EventBusPublisher {
    
    private EventBus eventBus;

    EventBusPublisher(EventBus eventBus) {
        this.eventBus = eventBus;
    }
    
    public void publish(Event e){
        eventBus.publish(e);
    }

}
