
class Account {
    static int minBalance;

    static {
        minBalance = 500;
    }

    public  int getMinBalance(){
        return minBalance;
    }

    public static void main(String[] args) {
        Account a = new Account();
        System.out.println("The value of min balance is : "+ a.getMinBalance());
    }
}
