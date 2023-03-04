package Practice.BuiltInClassesAndMore;

public class Customer {
    private int custId;
    private String custName;


    public Customer(int cuatId, String custName){
        this.custId = cuatId;
        this.custName = custName;
    }


    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }


    @Override
    public boolean equals(Object object){
        Customer c1 = (Customer) object;
        if(c1.getCustId() == this.getCustId())
            return true;

        return false;
    }

    @Override
    public int hashCode(){
        return this.getCustId();
    }
    
    public static void main(String[] args) {

        System.out.println("WRAPPERS");
        Integer i1 = new Integer(1234);
        Integer i2  = new Integer(12345);
        
        if((i1.compareTo(i2)) ==0){
            System.out.println("Equal");
        }
        else if((i1.compareTo(i2)) >= 0)
            System.out.println("val1 > val 2");
        else if((i1.compareTo(i2)) <= 0)
            System.out.println("val2 > val1");

        String name = "Hamachi";
        String name1 = "Hamachi";

        System.out.println(name.equals(name1));
        System.out.println(name.hashCode() + " : " + name1.hashCode());

        String name2 = new String("Hamachi");
        System.out.println(name1.equals(name2));
        System.out.println(name2.getClass() + " : " + name1.hashCode());

        
        String id = "100";
        int custId = Integer.parseInt(id); 

        Customer c1 = new Customer(custId, "Ajay");
        Customer c2 = new Customer(10, "Ajay");
        
        if(c1.equals(c2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
