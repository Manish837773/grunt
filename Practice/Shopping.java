

abstract class RRPaymentServices{
    private double balance;
    private int custId;

      abstract  void display();

    RRPaymentServices(){
        
    }

    public void setCustId(int custId){
        this.custId = custId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    RRPaymentServices(double balance, int custId ){
        this.balance = balance;
        this.custId = custId;
    }

    public abstract void payBill(double amount);
}


 class Shopping extends RRPaymentServices{
    static int counter;
    String paymentId;
    Shopping(double balance, int custId){
        super(balance, custId);
    }
    @Override
    public void payBill(double amount) {
        if(paymentId.matches("S[0-9]{4}")){
            if(amount > this.getBalance()){
                System.out.println("Not sufficient balance");
            }
            else{
                System.out.println("Balance amount "+(getBalance() - amount));
            }
        }
        
    }
}

class CreditCardPayment extends RRPaymentServices{

    CreditCardPayment(double balance, int custId){
        super(balance,custId);
    }

    String paymentId;
    double cashBack;
    double balanceDue;

    @Override
    public void payBill(double amount){

    }
}
