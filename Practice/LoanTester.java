class Loan{
    private int loan;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;
    private static int loanCounter = 100;

    Loan(){
        loanCounter++; 
    }

    Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest ){
        loanCounter++;
    }

    public int getLoan() {
        return loan;
    }
    public void setLoan(int loan) {
        this.loan = loan;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public int getCustomerNo() {
        return customerNo;
    }
    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }
    public float getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }
    public int getLoanDuration() {
        return loanDuration;
    }
    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }
    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
    }
    public int getLoanCounter(){
        return loanCounter;
    }
    
    
    
}

public class LoanTester{
    public static void main (String[] args){
       //Create 2 objects of Loan class using the default and 2 using parametrized constructor.
       //Use getter methods and display the value of loanCounter for every instance
       Loan l = new Loan();
       System.out.println(l.getLoanCounter());
       Loan l1 = new Loan(0, 0, 0, 0, 0);
       System.out.println(l1.getLoanCounter());

   }
 }
 