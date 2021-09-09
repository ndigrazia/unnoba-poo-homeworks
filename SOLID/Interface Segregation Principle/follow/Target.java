package follow;

public class Target implements Suscriber {

    private EventBusSuscriber suscriber;

    Target(EventBusSuscriber suscriber) {
        this.suscriber = suscriber;
        suscriber.suscriber(this);
    }
    
    public void onEvent(Event e) {
        //suscriber.onEvent(e); It isn't possible
    }

    public void setEventBusSuscriber(EventBusSuscriber suscriber) {this.suscriber = suscriber;}
}
