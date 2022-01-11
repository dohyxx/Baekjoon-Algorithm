package basic;

import java.util.Scanner;

public class boj_23 {

	public static void main(String[] args) {
		//백준 2908번 상수
		
		 Scanner sc = new Scanner(System.in);

	        int a = reversNum(sc.nextInt()); //입력과 동시에 메서드 호출
	        int b = reversNum(sc.nextInt());// ""

	        System.out.println((a>b)? a:b);
	    }

	    static int reversNum(int num){
	    	
	        String number = String.valueOf(num);
	        String temp = "0";
	        
	        for (int i = 3; i > 0; i--) {
	            temp += number.charAt(i-1);  //뒤에서 부터 저장.
	        }
	        return Integer.parseInt(temp); //형변환 후 값 리턴

	}

}
