package basic;

import java.util.Scanner;

public class basic_03 {

	public static void main(String[] args) {
		
		// 백준 2884번 알람시계
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(minute < 45) { // 45분보다 적을 경우 
			hour --;
			minute = 60 - (45 - minute);
			
			if(hour < 0 ) { // 24시간 기준이기 때문에 hour이 0보다 작을경우 23으로 해준다.
				hour = 23;
			}
			System.out.println(hour + " " + minute);
		}else {
			System.out.println(hour + " " + (minute - 45));
		}
	
	}
}
