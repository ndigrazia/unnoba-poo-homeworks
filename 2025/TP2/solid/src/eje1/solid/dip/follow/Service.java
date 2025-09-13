package eje1.solid.dip.follow;

public class Service {

    /* Service knows about Client. 
    Client knows Service.
    Violation: Circular dependency: Service is tightly coupled to Client 
    Service can't be reused from other Clients (Classes). For example ClientB, ClientC
    **/
    public void doSomethingAsync(CallBack callback) { 
        callback.doSomethingAsync();
    }
    
}
