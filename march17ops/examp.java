package march17ops;

 class Gms{
	 protected void getData()
	 {
         System.out.println("inside hello");		 
	 }
 }
 class Gs extends Gms {
	protected void getData() 
	 {
		super.getData();      ///doni value print hote super is construter
		 System.out.println("inside ");
	 }
 }
public class examp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Gms g=new Gs();
	
			g.getData();
			
	}
  
}
