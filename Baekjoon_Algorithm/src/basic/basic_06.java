package basic;

import java.util.Scanner;

public class basic_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int count = 0;
		int n = sc.nextInt();
		int temp = n;
		
		while(true) {
			int left = temp / 10;
			int right = temp % 10;
			
			temp = (right * 10) + ((left+right) % 10); //68을 temp에 저장
			count++;
			if(n == temp) break;
		}
			System.out.println(count);
	}

}
