package dat2ClassObjects;

public class ChocolateFactory {
	
	public static void main(String args[]) {
	
	Chocolate cadburyDairymilk = new Chocolate("dark Milk", 156.00, 199.00,"paperbox", true);
	Chocolate star=new Chocolate("new soft Bar", 25.00,10.00, "silverfoil", false);
	Chocolate snickers = new Chocolate("peanutFilled",100.00,50.00,"SilverFoil", false);
	
	Chocolate  bounty = new Chocolate("choco", 120.00, 75.00, "paper foil", true);
	System.out.println(cadburyDairymilk);
	System.out.println(star);
	System.out.println(snickers);
	System.out.println(bounty.getDescription());
	System.out.println(bounty.getPrice());
	
	Chocolate choco[]= new Chocolate[3];
	
	choco[0]= cadburyDairymilk;
	choco[1]= star;
	choco[2]= snickers;
	System.out.println("description : \n ");
	for(int i=0 ; i<choco.length; i++) {
		
		
		System.out.println(choco[i].getDescription());
	}
	
	  
	

}
}