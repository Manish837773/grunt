interface IBankNew{
    boolean applyForCreditCard(Customer customer);
}


 interface IBank extends IBankNew{
    int CAUTIONMONEY = 2000;
    String createAccount(Customer customer);
    double issueVehicleLoan(String vehicleType, Customer customer);
    double issueHouseLoan(Customer customer);
    double issueGoldLoan(Customer customer);
}

class Customer{
    String name;
    String phoneNumber;
    String emailId;
    
}

class MumbaiBank implements IBank{

    @Override
    public String createAccount(Customer customer) {
        // TODO Auto-generated method stub
        return "Acc12345";
    }

    @Override
    public double issueGoldLoan(Customer customer) {
        // TODO Auto-generated method stub
        return 50000;
    }

    @Override
    public double issueHouseLoan(Customer customer) {
        // TODO Auto-generated method stub
        return 2000000;
    }

    @Override
    public double issueVehicleLoan(String vehicleType, Customer customer) {
        // TODO Auto-generated method stub
        if(vehicleType.equals("bike"))
            return 100000;
        else
            return 200000;
    }

    @Override
    public boolean applyForCreditCard(Customer customer) {
        // TODO Auto-generated method stub
        return true;
    }
   
    @Override
    public Object getClass(){
        return new Object();
    }

   
}


class Execute {
    public static void main(String[] args) {
        IBank ib = new MumbaiBank();
        Customer c = new Customer();
        c.name = "Manish";
        c.phoneNumber = "83478920";
        c.emailId = "email@email.com";

        System.out.println(ib.applyForCreditCard(c));
        System.out.println(c.name.toString());
    }
}
