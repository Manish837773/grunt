public class MyFirstApp{
	public static void main(String args[]){
		System.out.println("I Rule!");
		System.out.println("The World");
		Loopy loopy = new Loopy();
		loopy.loopyFunction();
	}
}

class Loopy{
	public void loopyFunction(){
		int x = 1;
		System.out.println("Before loop");
		while(x <= 10){
			System.out.println("In loop");
			System.out.println("Value of x:"+x);
			x = x + 1;
		}
		System.out.println("Exited loop");
	}
}