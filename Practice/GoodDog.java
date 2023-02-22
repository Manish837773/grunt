class GoodDog {
	private int size;

	public int getSize(){
		return size;
	}

	public void setSize(int size){
		if(size > 3)
			this.size = size;
		else
			System.out.println("Not the right size");
	}

	public void bark(){
		if(size > 60){
			System.out.println("Woof! Woof!");
		}
		else if(size > 14)
			System.out.println("Ruff! Ruff!");
		else
			System.out.println("Yip! Yip!");
	}
public static void main(String[] args) {
	GoodDog dog = new GoodDog();
	dog.setSize(0);
	dog.setSize(10);
	dog.bark();
}

}

