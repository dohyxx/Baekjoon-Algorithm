package basic;

import java.util.Scanner;

public class boj_19 {

	public static void main(String[] args) {
		//백준 10809번 알파벳 찾기
		//알파벳 소문자로만 이루어진 단어 S가 주어진다. 
		//각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
		//포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.print(str.indexOf(i) + " ");
		}
		
		// 자바서 indexOf() 함수는 문자열의 위치를 반환하는 함수다.
		// 해당하는 문자가 문자열에 있으면 그 위치를 반환하고 없으면 -1을 반환해준다.
		

	}

}
