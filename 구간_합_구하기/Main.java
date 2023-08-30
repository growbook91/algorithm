package 구간_합_구하기;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // int N과 M을 선언
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // sum[]을 선언
        long[] sum = new long[N];
        // input[]을 선언하고 값을 받는다.
        int[] inputs = new int[N];

        for(int i = 0 ; i < inputs.length ; i++){
            inputs[i] = Integer.parseInt(st.nextToken());

            if(i == 0){
                sum[i] = inputs[i];
            }
            else{
                sum[i] = sum[i-1] + inputs[i];
            }

        }
        // sum을 계산
        // for문에서 계산 값을 준다.
        for(int i = 0 ; i < M ; i++){
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if(start <= 1){
                System.out.println(sum[end-1]);
            }

            else {
                System.out.println(sum[end-1] - sum[start-2]);
            }
        }
    }
}
