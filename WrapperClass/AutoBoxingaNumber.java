package WrapperClass;
import java.util.*;
public class AutoBoxingaNumber {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an int value: ");
	        int num = sc.nextInt();

	        Integer obj = num;
	        System.out.println("Auto-boxed Integer: " + obj);
	    }
}
