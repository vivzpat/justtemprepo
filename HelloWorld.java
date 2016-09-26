import java.util.*;

public class HelloWorld {
//	public static void main (String[] args){
//		System.out.print("Hello World !"); 	
//	}
//}
	public static double degrees = 0.0;
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		degrees = reader.nextDouble();
		String a = "2";
		convertToCelcius();
		System.out.println(a);
	}

	public static void convertToCelcius() {
		degrees = (degrees - 32.0) * 5.0 / 9.0;
	}
}