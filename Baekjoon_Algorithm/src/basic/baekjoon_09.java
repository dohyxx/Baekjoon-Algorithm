package basic;

import java.util.Scanner;

public class baekjoon_09 {

	public static void main(String[] args) {
		//백준 2577번 숫자의 개수
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = (a*b)*c;
		
		int arr[] = new int[10]; //0~9
		while(sum > 0) {
			arr[sum % 10]++; //나머지 값에 해당하는 인덱스의 값을 하나씩 증가시킨다.
			sum /= 10; // 나머지 1의 자리는 버린다.
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
