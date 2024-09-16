package follow;

public class TaxCalculatorFactory implements CalculatorFactory {
    
    public TaxCalculator createTaxCalculator(String type) {
        switch (type) {
            case "FULL_TIME":
                return new FullTimeTaxCalculator();
            case "FREELANCE":
                  return new FreelanceTaxCalculator();
            default:
                return null;     
        }
    }
}
