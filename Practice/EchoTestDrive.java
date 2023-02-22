class EchoTestDrive{
	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();

		int x = 0;
		while(x < 4){
			p1.hello();
			p1.count = p2.count + 1;
			if (x > 0){
				p2.count = p2.count + 1;
			}
			if(x > 1){
				p2.count += p1.count;
			}
			x++;
		}
		System.out.println(p2.count);
	}
}

class Player{
	int count = 0;
	void hello(){
		System.out.println("Hello .....");
	}
}