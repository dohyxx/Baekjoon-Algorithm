package basic;

import java.util.Scanner;

public class boj_14 {
	
	static long sum(int[ ] a) {
		long  b = 0;
		for(int i=0; i<a.length; i++) {
			b += a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		//백준 15596번
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sum(arr));
		
		
		

		
		
		
	}

}
