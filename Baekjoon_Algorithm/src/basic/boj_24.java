package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_24 {

	public static void main(String[] args) throws IOException{
		//백준 5622번 다이얼 문제풀이

		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String dial = bf.readLine(); //String
        bf.close();
        
        // 알파벳은 26개
        int [] time = new int[]{3,3,3,          //ABC
                                4,4,4,          //DEF
                                5,5,5,          //GHI
                                6,6,6,          //JKL
                                7,7,7,          //MNO
                                8,8,8,8,       //PQRS
                                9,9,9,          //TUV
                                10,10,10,10}; //WXYZ
        
 
        int result = 0;
         for(int i=0; i<dial.length(); i++) {
            
            // 문자를 10진수로 표현
            int ch = dial.charAt(i);
            int alpha = ch-65; // A와 거리가 얼마나 떨어져있는가?
            result += time[alpha];
            
        }
        
        bw.write(String.valueOf(result));
        bw.flush();//남아있는 데이터를 모두 출력시킴
        bw.close();//스트림을 닫음

	}

}
