class Salary{
	int s = 1;
	Salary(){

	}
	Salary(Salary s){
		System.out.println(s);
	}
	public static void  main(String[] args){
		Salary s = new Salary();
		Salary s1 = new Salary(s);
		s = s1;
		
		double sal[] =  {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		double avg = 0.0;
		for(double sals : sal){
			avg = sals + avg;
		}

		avg = avg/(sal.length);

		int cAbv = 0, cBl = 0;
		for(double sals : sal){
			if(sals > avg)
				cAbv++;
			else if(sals < avg)
				cBl++;
		}

		System.out.println("Salaries above average "+cAbv);
		System.out.println("Salaries below average "+cBl);	


	}

}