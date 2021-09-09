package violation;

public class Client {
    
    private Service service;


    public void doSomething() {
        doSomethingPhaseOne();
        service.doSomethingAsync(this);
    }

    public void doSomethingPhaseOne() {}
    public void doSomethingPhaseTwo() {}
}
