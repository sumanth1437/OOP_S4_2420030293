package WrapperClass;
import java.util.*;
public class BoxingaNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an int value: ");
        int num = sc.nextInt();
        Integer obj = Integer.valueOf(num);
        System.out.println("Boxed Integer: " + obj);
    }
} 
