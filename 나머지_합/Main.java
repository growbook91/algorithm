package 나머지_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 일단, N과 M을 받고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long count = 0;
        // left[]를 만들자.
        int[] left = new int[N+1];
        // 연산
        int[] matchingInteger = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i < left.length ; i++){
            left[i] = (left[i-1] + Integer.parseInt(st.nextToken())) % M;
            matchingInteger[left[i]]++;
        }
        // 그리고 전부 다 계산해서 count++
        for(int i = 1 ; i < N + 1 ; i++){
            if(left[i] ==0){
                count++;
            }
        }

        for (int i : matchingInteger){
            count += (long) i*(i-1)/2;
        }

        System.out.println(count);
    }
}

