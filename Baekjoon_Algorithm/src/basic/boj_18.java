package basic;

import java.util.Scanner;

public class boj_18 {

	public static void main(String[] args) {
		
		//백준 11720번 숫자의 합
		/*
		 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //숫자 개수
		String str = sc.next(); //입력 값
		
		int result = 0;
		
		for(int i = 0; i<num; i++) {
			
			result += str.charAt(i) - '0';
		}
		System.out.println(result);
		
		
		
		/*
		 * String 타입으로 값을 입력받고 charAt() 메서드로 문자를 숫자로 형변환 시킨다.
		 * char형에 - 연산자를 사용하면 int형으로 변환된다. 
		 */
	}

}
