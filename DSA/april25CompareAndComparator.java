package DSA;
import java.util.*;
public class My{
	static public class comp implements comparator {
		public int compare(object a, object b) {
			Integer x=(Integer)a;
			Integer y=(Integer)b;
			return -1=(x-y);
			
		}
		
	}
}
public class april25CompareAndComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []arr= {1,2,0,11,4,15};
		
		Arrays.sort(arr, new comp());
		
		for(int x : arr) {
			System.out.println(x+" ");
		}

	}

}

