package follow;

public class Source {
    
    private EventBusPublisher publisher;

    Source(EventBusPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishEvent() {
        Event e = new Event();

        publisher.publish(e);
    }

    public void setEventBusPublisher(EventBusPublisher publisher) {this.publisher = publisher;}
    
}
