package WrapperClass;
import java.util.*;
public class UnboxingaNumber {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        Integer obj = Integer.valueOf(input);
	        int num = obj.intValue();
	        System.out.println("Unboxed int: " + num);
	    }
}
