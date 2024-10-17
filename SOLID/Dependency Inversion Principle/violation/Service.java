package violation;

public class Service {

    /*Service knowns about Client. 
    Client knowns Service.
    Violation: Circular dependency: Service is tightly coupled to Client 
    Service can't be reused form other Clients(Classes). For example ClienteB, ClienteC
    **/
    public void doSomethingAsync(Client client) { 
        //Do something Async
        //After that, it call client's method.
        client.doSomethingPhaseTwo();
    }
    
}
