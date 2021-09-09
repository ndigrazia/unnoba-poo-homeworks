package violation;

public class SalaryCalculator {
    
    public float calculateSalary(Employee employee) {
        float taxDeduction = calculateTax(employee);

        return 0;
    }

    /**
     * Calculate tax deduction
     * VIOLATE: We expect new types employees with different tax mechanics
     * Every additional type of employee I will need open this class and make some change
     */
    public float calculateTax(Employee employee) {
        switch (employee.getType()) {
            case "FULL_TIME":
                return 0;
            case "FREELANCE":
                return 0;
            default:
                return 0;
        }
    }
}
