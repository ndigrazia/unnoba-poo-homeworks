package extended_follow;

public class TaxCalculatorFactoryImpl2 implements TaxCalculatorFactory {
    
    public TaxCalculator createTaxCalculator(String type) {
        switch (type) {
            case "FULL_TIME":
                return new FullTimeTaxCalculator();
            case "FREELANCE":
                  return new FreelanceTaxCalculator();
            case "PART_TIME":
                  return new PartTimeTaxCalculator();
            default:
                return null;     
        }
    }
}
