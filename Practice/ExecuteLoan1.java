

class Loan{
    protected int tenure;
    protected float interestRate;
    protected double principal;
    Loan(int tenure, float interestRate){
        this.interestRate = interestRate;
        this.tenure = tenure;
    }
    public double calculateInterest(){
        double simpleInterest = (principal * tenure * interestRate)/100;
        double emi = (simpleInterest + principal)/tenure;
        int additionalTax = 200;
        return emi + additionalTax;
    }
}

class HomeLoan extends Loan{


    HomeLoan(double principal, int tenure, float interestRate){
        super(tenure, interestRate);
        super.principal = principal;
    }

    @Override
    public double calculateInterest(){
    double emi = super.calculateInterest();
    return emi;
    }

}

         
class ExecuteLoan1{
    public static void main(String[] args) {
      Loan loan = null;
      loan =  new HomeLoan(20000000, 5, 8.5f);                 // Runtime polymorphism
      double hloan = loan.calculateInterest();
      System.out.println("Home loan emi per year..."+ hloan);
    }
  }
   
 
