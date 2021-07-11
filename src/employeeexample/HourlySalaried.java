package employeeexample;

public class HourlySalaried extends Employee{
    private double hourlyRate;
    private double totalHour; 

    public HourlySalaried(double hourlyRate, double totalHour, String name) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.totalHour = totalHour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(double totalHour) {
        this.totalHour = totalHour;
    }

    @Override
    public double getTotalEarning() {
        return hourlyRate * totalHour; //To change body of generated methods, choose Tools | Templates.
    }
    
}
