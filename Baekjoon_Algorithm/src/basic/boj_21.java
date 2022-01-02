package basic;

import java.util.Scanner;

public class boj_21 {

	public static void main(String[] args) {
		//백준 1157번  단어공부
		
		Scanner sc = new Scanner(System.in);
		
        String str = sc.next().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) -'A' ;
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                answer = (char)(i+'A');
            } else if (max == count[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
	}
	
	//String.toUpperCase(); 모두 대문자로 변경, 소문자는 String.toLowerCase();
	//알파벳 개수(배열크기)만큼 반복문 실행
	//-> 가장 중복값이 큰지 비교하며 max에 저장
	//-> 해당 위치 알파벳 알아내기 위해 (index + 'A')

}
