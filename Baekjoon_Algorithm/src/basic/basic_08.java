package basic;

import java.util.Scanner;

public class basic_08 {

	public static void main(String[] args) {
		// 백준 2562번 최댓값
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		int max = 0;
		int count = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
		
	}

}
