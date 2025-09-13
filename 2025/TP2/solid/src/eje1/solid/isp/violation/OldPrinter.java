package eje1.solid.isp.violation;

public class OldPrinter implements Machine {

    @Override
    public void print(String content) {
        // Printing logic
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String document) {
        throw new UnsupportedOperationException("This printer does not support scanning.");
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("This printer does not support faxing.");
    }
    
}
