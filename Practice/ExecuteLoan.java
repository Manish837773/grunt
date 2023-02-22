class Loan{
    protected int tenure;
    protected float interestRate;
    protected double principal; 

    public Loan(int tenure, float interestRate){
        this.tenure = tenure;
        this.interestRate = interestRate;
    }
}

class HomeLoan extends Loan{
    double principal;
    HomeLoan(int principal){
        super(5,8.5f);
        this.principal = principal;
        super.principal = this.principal;  
    }
    public double calculateInterest(){
        double simpleInterest = (principal * tenure * interestRate)/100;
        double emi = (simpleInterest + principal)/tenure;
        int additionalTax = 200;
        return emi + additionalTax;
    }
}

class ExecuteLoan{
    public static void main(String[] args) {
        HomeLoan h = new HomeLoan(2000000);
        System.out.println(h.calculateInterest());
    }
    
}