package employeeexample;

public class MonthlySalaried extends Employee implements Loanable{
    private double basesalary;

    public MonthlySalaried(double basesalary, String name) {
        super(name);
        this.basesalary = basesalary;
    }

    public double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(double basesalary) {
        this.basesalary = basesalary;
    }

    @Override
    public double getTotalEarning() {
       return basesalary;
    }

    @Override
    public void calculateLoan() {
        
    }
     
}
