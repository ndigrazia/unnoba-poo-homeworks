package violation;

public class Target implements Suscriber {

    private EventBus eventBus;

    Target(EventBus eventBus) {
        this.eventBus = eventBus;

        eventBus.suscriber(this);
    }

    public void onEvent(Event e) {
        /*VIOLATION: More event exchanged between clases
        can make your code unmaintainable 
        Flow between components are difficult to maintain*/
        eventBus.publish(new Event());
    }

    public void setEventBus(EventBus eventBus) {this.eventBus = eventBus;}
    
}
