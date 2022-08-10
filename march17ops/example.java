package march17ops;
class AA{
	void show() {
		System.out.println("AA");
	}
	AA(){
		System.out.println("AA constructor");
	}
}

class BB extends AA{
	void show() {
		System.out.println("BB");
	}
	BB(){
		System.out.println("BB constructor");
	
	}
}
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AA b=new BB();
        b.show();
	}

}
