package example1.violation;

/**More than one reason SRP violation*/
public class Employee {

    private String id;

    public String getId() { 
        return id;
    }
    
    /** Financial department: new types of employee benefits */
    /** Calculate payment */
    public float calculateMonthlySalary() {
        HoursReport hourReport = produceMonthlyHoursReport(); // Unintentional change

        return 0;
    }

    /** RH: Report format to comply with regulations */
    /** Intentional Change: Reduce overwork in hours stating with 11 */
    public HoursReport produceMonthlyHoursReport() {
        return null;
    }

    /**Response: Save the current state of employee. for example BataBase */
    public void  saveModifications() {
    }

}
