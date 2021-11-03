package basic;

import java.util.Scanner;

public class baekjoon_10 {

	public static void main(String[] args) {
		//백준 3052번
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		
		for(int i=0; i<10; i++) {
			int tmp = 0;
			for(int k=i+1; k<10; k++) {
				if(arr[i] == arr[k]) {
					tmp++;
				}
			}
			if(tmp == 0) {
				count++;
			}
		}
		System.out.println(count);

		
		
		
		
	}

}
