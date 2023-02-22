class Chocolate{
	private int barCode;
	private String name;
	private int weight;
	private int cost;

	public Chocolate(){

	}

	public void setBarCode(int barCode){
		this.barCode = barCode;
	}

	public int getBarCode(){
		return barCode;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getWeight(){
		return weight;
	}

	public void setCost(int cost){
		this.cost = cost;
	}

	public int getCost(){
		return cost;
	}
}





public class ChocolateTester{
   public static void main (String[] args){
      //Create an object of chocolate
      //Use getter methods to display the values
      //Use setter methods to modify the values
      //Use getter methods to display the modified values

   	Chocolate c = new Chocolate();
   	c.setName("Hershey's");
   	c.setCost(10);
   	c.setWeight(2);
   	c.setBarCode(1231231);

   	System.out.println(c.getName());
   }
}