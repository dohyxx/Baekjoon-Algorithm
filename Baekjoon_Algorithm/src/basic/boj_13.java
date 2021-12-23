package basic;

import java.util.Scanner;

public class boj_13 {
    //======다시보기=======
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//백준 4344번 평균은 넘겠지
		
		/*	각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 
			소수점 셋째 자리까지 출력한다.
			첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
			둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
 			N명의 점수가 주어진다.
		*/
		
		//평균, 평균을넘는학생&평균                                                                            
		
		int c = sc.nextInt(); //케이스 수
		int n = 0; //학생 수
		double avg = 0; //평균
		
		int arr[] = new int[10];
		
		for(int i=0; i< c; i++) { //1.케이스 수만큼 
			n = sc.nextInt(); //학생 수
			int total = 0;
			int num= 0;
			
			for(int k=0; k<n; k++) { //2.학생 수만큼 
				arr[k] = sc.nextInt(); //각 학생의 점수
				total += arr[k]; //합계구하기
			}
			
			avg = (double) total / n; //평균구하기
			
			for(int k=0; k<n; k++) {//3.평균보다 높은 학생 수 구하기 
					if(arr[k] > avg) { 
						num++;
					}
			}
			System.out.printf("%.3f", 100.0 * num / n);
			System.out.println("%");
		}
		
		
		
		
		
	}
}
