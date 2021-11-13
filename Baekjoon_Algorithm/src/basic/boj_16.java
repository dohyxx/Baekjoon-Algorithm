package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boj_16 {

	public static void main(String[] args) throws IOException {
		//백준 1065번
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(count(N));
	}
	
	public static int count(int N) {
		
		if(N < 100) {
			return N;
		}else {
			
			int a;
			int b;
			int c;
			int count = 99;
			
			if(N == 1000) count--;
			
			for(int i=100; i<= N; i++) {
				
				a= i%10;
				b= (i / 10) % 10;
				c= (i / 100) % 10;
				
				if(a-b == b-c) count++;
		}
		
		return count;
	}
		
		
		
	}
	

}
