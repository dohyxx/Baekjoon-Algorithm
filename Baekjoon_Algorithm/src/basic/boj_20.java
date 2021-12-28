package basic;

import java.util.Scanner;

public class boj_20 {

	public static void main(String[] args) {
		// 백준 2675번
		// 문자열 반복

		Scanner sc = new Scanner(System.in);
        
        // 입력 값 저장
        int index = sc.nextInt();
        
        // 개수만큼 반복
        for (int i = 0; i < index; i++) {

            int reqeat = sc.nextInt();// 반복 출력 횟수 저장
           
            String str = sc.next(); // 반복 출력할 문자열 저장
            
            // 문자열 길이만큼 반복, 한글자씩  반복 
            for (int j = 0; j < str.length(); j++) {
                // 반복 출력 횟수 만큼 반복
                for (int r = 0; r < reqeat; r++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        	
        	}
        }
}
