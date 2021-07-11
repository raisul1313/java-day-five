
package employeeexample;

public interface Loanable {
    void calculateLoan();
    default void something(){
        System.out.println("I am Default");
    } 
}
