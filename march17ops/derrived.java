package march17ops;
 class Test{
	 void myMethod() {
		 System.out.println("hello");
	 }
 }

public class derrived extends Test{
    protected void myMethod(int x) {
    	System.out.println("good");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        derrived object = new derrived();
         object.myMethod();
	}

}
