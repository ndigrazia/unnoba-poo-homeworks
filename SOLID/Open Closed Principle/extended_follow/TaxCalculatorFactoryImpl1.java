package extended_follow;

public class TaxCalculatorFactoryImpl1 implements TaxCalculatorFactory {
    
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
