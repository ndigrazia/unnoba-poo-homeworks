package follow;

public class EventBusSuscriber {
    
    private EventBus eventBus;

    EventBusSuscriber(EventBus eventBus) {
        this.eventBus = eventBus;
    }
    
    public void suscriber(Suscriber suscriber) {
        eventBus.suscriber(suscriber);
    }

    public void unsuscriber(Suscriber suscriber) {
        eventBus.unsuscriber(suscriber);
    }

}
