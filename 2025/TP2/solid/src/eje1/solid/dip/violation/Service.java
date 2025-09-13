package eje1.solid.dip.violation;

public class Service {

    /* Service knows about Client. 
    Client knows Service.
    Violation: Circular dependency: Service is tightly coupled to Client 
    Service can't be reused from other Clients (Classes). For example ClientB, ClientC
    **/
    public void doSomethingAsync(Client client) { 
        // Do something Async
        // After that, it calls client's method.
        client.doSomethingPhaseTwo();
    }
    
}
