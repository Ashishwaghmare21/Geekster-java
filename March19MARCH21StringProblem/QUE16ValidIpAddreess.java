package March19MARCH21StringProblem;

public class QUE16ValidIpAddreess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Que : check if the string is a valid IpAddress

				String ip = "154.78.65.243";
				boolean valid = true;

				ip = ip.replace(".", " ");
				System.out.println(ip);

				String[] arr = ip.split(" ");
				int len = arr.length;

				if (len == 4) {
					for (int i = 0; i < arr.length; i++) {
						String word = arr[i];

						int x = Integer.parseInt(word);

						if (!(x > 0 && x < 255)) {
							valid = false;
						}
					}
				}
				System.out.println("valid = " + valid);
	}

}
