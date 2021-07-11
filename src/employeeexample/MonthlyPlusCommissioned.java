package employeeexample;

public class MonthlyPlusCommissioned extends Employee{
    private double baseSalary; 
    private double commissionRate;
    private double grossSale;
    private LoanableImpl loanableImpl;

    public MonthlyPlusCommissioned(double baseSalary, double commissionRate, double grossSale, String name) {
        super(name);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    public LoanableImpl getLoanableImpl() {
        return loanableImpl;
    }

    public void setLoanableImpl(LoanableImpl loanableImpl) {
        this.loanableImpl = loanableImpl;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    @Override
    public double getTotalEarning() {
        return baseSalary + ((commissionRate*grossSale)/100); 
    }
    
}
