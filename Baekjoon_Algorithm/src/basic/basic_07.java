package basic;

import java.util.Scanner;

public class basic_07 {

	public static void main(String[] args) {
			//백준 10818번 최소,최대
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
				}
			
			int min = arr[0]; //둘다 인덱스 0으로 초기화
			int max = arr[0];
			
			for(int i=0; i<arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
				}
				if(max < arr[i]) {
					max = arr[i];
				}
			}
			System.out.println(min + " " + max);
			

	}

}
