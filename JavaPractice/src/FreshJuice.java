
public class FreshJuice {

	enum FreshJuiceSize{ SMALL, MEDIUM, LARGE}
	
	FreshJuiceSize size;
	
	public static void main (String []args) {
		
		FreshJuice sizing= new FreshJuice();//new instance of the class is being created to use the enum types and the size variable through which they can be accessed
				
		sizing.size =FreshJuice.FreshJuiceSize.MEDIUM; //local instance of "FreshJuice", set the juice size to the predefined enum type, Medium
		
		System.out.println("the size of the juice is "+ sizing.size); //print out the current size of the juice
	
	
	}
	
}
