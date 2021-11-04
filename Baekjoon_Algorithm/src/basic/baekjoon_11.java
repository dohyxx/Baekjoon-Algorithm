package basic;

import java.util.Scanner;

public class baekjoon_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//백준 1546번
		
		int n = sc.nextInt();
		int max = 0;
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int score = sc.nextInt();
			sum += score; //총합
			if(score > max) { //최대값구하기
				max = score;
			}
		}
		
		//곱셈과 나눗셈은 우선순위가 같아서 여러개일 때는 왼쪽->오른쪽 순으로 연산한다.
		double  avg = 0;
		avg = 100.0 * sum / max / n; 
		System.out.printf("%.2f", avg); //소수점 둘째자리까지만 출력.
		
		

	}

}
