package follow;

public class SalaryCalculator {
    
    private TaxCalculatorFactory factory;

    public float calculateSalary(Employee employee) {
        TaxCalculator taxCalculator= factory.createTaxCalculator(employee.getType());
        float taxDeduction = taxCalculator.calculateTax(employee);

        return 0;
    }

    public void setTaxCalculatorFactory(TaxCalculatorFactory factory) {
        this.factory = factory;
    }
    
}
