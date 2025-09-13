package eje1.solid.dip.follow;

public class Client implements CallBack {
    
    private Service service;

    /** No chain of dependencies from Service to Client */
    public void doSomething() {
        doSomethingPhaseOne();
        service.doSomethingAsync(this);
    }

    public void doSomethingPhaseOne() {}

    public void doSomethingAsync() {
        doSomethingPhaseTwo();
    }

    public void doSomethingPhaseTwo() {}
}
