class Bank{
String bankName;
String area;
String phoneNo;

	public Bank(){
		bankName = "Default";
		area = "Deafult Area";
		phoneNo = "Default Number";

	}

	public Bank(String bname,String barea , String  bphone){
		bankName = bname;
		area = barea;
		phoneNo = bphone;
	}

	void display(){
		System.out.println("Bank Name : "+bankName);
		System.out.println("Bank Area : "+area);
		System.out.println("Bank Phone : "+phoneNo);
	}

	public static void main(String[] args) {
		Bank a = new Bank();
		Bank b = new Bank("Mani Bank", "Man", "2384");
		a.display();
		b.display();
	}
}