package ControlStatements;
import java.util.Scanner;
public class NumberUntilUserEnters0 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;

	        while ((num = sc.nextInt()) != 0) {
	            System.out.println("You entered: " + num);
	        }
	    }
}
