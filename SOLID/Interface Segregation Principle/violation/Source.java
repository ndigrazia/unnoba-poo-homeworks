package violation;

public class Source {
    
    private EventBus eventBus;

    Source(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void publishEvent() {
        Event e = new Event();

        eventBus.publish(e);
    }

    public void setEventBus(EventBus eventBus) {this.eventBus = eventBus;}
    
}
