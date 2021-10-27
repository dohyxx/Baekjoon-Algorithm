package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class basic_04 {

	public static void main(String[] args) throws IOException {
		
		//입력때 Scanner, 출력때 System.out.print
		// 둘중 하나라도 사용하면 시간초과가 난다.
		// 입력할땐 BufferedReader 사용, 출력할땐 BufferedWriter를 사용한다.
		
		// 입출력은 실행시간에 큰 영향을 주는 작업이므로 1~2개가 아닌 100만~200만이라고 가정했을 때,
		// Buffered를 사용하는 것이 입출력이 훨씬 빠르며 효율적이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String str = br.readLine();
			int A = Integer.parseInt(str.split(" ")[0]);
			int B = Integer.parseInt(str.split(" ")[1]);
		
			bw.write(A+B  +"\n");
		}
		bw.flush(); //출력이 필요할때 한번만 수행해주면 된다.
		
	
		
	}

}
