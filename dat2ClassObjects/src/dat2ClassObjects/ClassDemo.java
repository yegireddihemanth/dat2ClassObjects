package dat2ClassObjects;

public class ClassDemo {
	
	int a=10; //globle variable or instance variable or a date member
	void m() {
		int a =20; 
		System.out.println(a);// it will print 20 because local variable has a high preceedance than the local variables
		
		System.out.println(this.a); // this will print goble becase of this.
		
}

}
