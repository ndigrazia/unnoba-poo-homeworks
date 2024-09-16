package follow;

public class Tax2CalculatorFactory extends TaxCalculatorFactory {
    
    public TaxCalculator createTaxCalculator(String type) {
        switch (type) {
            case "HALF_SHIFT":
                  return new HalfShiftTaxCalculator();
            default:
                return super.createTaxCalculator(type);     
        }
    }
}
