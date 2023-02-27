package numAdder;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		System.out.println(" Enter N1 : ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		System.out.println(" Enter N2 : ");
		int n2 = sc.nextInt();
		
		int sum = (n1+n2);

	System.out.println(" The Sum of Numbers Is = " +sum);
	if(n1 > n2) {
		System.out.println("The Greater Number Is = " +n1 + " (N1)");
	}else {
		System.out.println("The Greater Number Is = " +n2 + " (N2)");
	}
	
	}

}
