package basic;

public class boj_15 {

	//셀프넘버 구하는 메서드
	public static int Self(int n) {
		int total = n;
		while(n != 0 ) {
			total += (n % 10);
			n /= 10;
		}
		
		return total;
}
	//백준 4673번  셀프넘버 
	public static void main(String[] args) {
		
		//셀프넘버 넣을 배열
		boolean check[] = new boolean[10001];
		
		//1-10000까지 반복 -> 셀프넘버가 아니면 배열에 true로 입력
		for(int i=1; i<10001; i++) {
				int n = Self(i);
				if(n<10001) check[n] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		
		//false인 경우 셀프넘버
		for(int i=1; i<10001; i++) {
				if(check[i] != true) {
					sb.append(i).append('\n');
				}
		}
		
		System.out.println(sb);
		
		
		
		
		
		
	}
}