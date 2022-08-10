package march17ops;
class DD{
	//default
	 void getData() {                             
		System.out.println("hello");
	}
}
  class EE extends DD{
	  //private
	 private void getData()
	  {
		  System.out.println("bye");
		  
	  }
  }
public class Examp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         DD g= new EE();
         g.getData();
     }

}
