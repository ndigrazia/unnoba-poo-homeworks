package violation;

import java.util.ArrayList;
import java.util.List;

public class EventBus {

    private List<Suscriber> suscribers = new ArrayList<Suscriber>();

    public void suscriber(Suscriber suscriber) {
        suscribers.add(suscriber);
    }

    public void unsuscriber(Suscriber suscriber) {
        suscribers.remove(suscriber);
    }

    public void publish(Event e){
        for (Suscriber suscriber : suscribers) {
            suscriber.onEvent(e);
        }
    }

}