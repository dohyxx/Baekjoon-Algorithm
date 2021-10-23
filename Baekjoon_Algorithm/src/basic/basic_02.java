package basic;

import java.util.Scanner;

public class basic_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =  sc.nextInt();
		
		System.out.println(b%10);
		System.out.println(a* 5);
		System.out.println(a* (b%10));
		System.out.println(a* (b%100/10));
		System.out.println(a* (b/100));
		System.out.println(a*b);
		
		
		
		
	}
		

}
