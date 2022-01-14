package basic;

import java.util.Scanner;

public class boj_25 {

	public static void main(String[] args) {
		//백준 2941번 크로아티아 알파벳
		
		Scanner sc = new Scanner(System.in);
		
		//크로아티아 알파벳 배열에 저장
		String str[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		
		String input = sc.nextLine();
		
		//입력받은 데이터가 str 배열 안 알파벳을 포함하고 있으면 if문 실행 후,
		//해당 하는 알파벳을 0으로 바꾼다.  lj -> 0
		for (int i = 0; i < str.length; i++) {
			if (input.contains(str[i])) { 
				input = input.replace(str[i], "0"); 
			}
		}
		
		System.out.println(input.length()); //입력받은 input의 길이 출력

	}

}
