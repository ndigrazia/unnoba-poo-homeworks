package follow;

public interface CalculatorFactory {

    public TaxCalculator createTaxCalculator(String type);

}
