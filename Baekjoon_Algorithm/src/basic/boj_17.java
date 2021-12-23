package basic;

import java.util.Scanner;

public class boj_17 {

	public static void main(String[] args) {
	
		//백준 11654번 아스키코드
		
		/*알파벳 대소문자나 숫자 0~9를 입력했을 때 
		   그에 맞는 아스키 코드를 출력하는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int result = num.charAt(0);
		
		System.out.println(result);
		
		
		
		/*
		 * 1. 숫자나 문자를 입력받아야 하므로 String 변수로 입력받는다.
		 * 2. charAt(0)  입력받은 문자가 하나이므로 변수 num에서 0번째 문자를 int로 넣는다.
		 * 3. 아스키코드는 정수로 이루어져 있기 때문에 int 타입으로 변환하면 아스키코드값으로 저장된다.
		 */
	}
}




