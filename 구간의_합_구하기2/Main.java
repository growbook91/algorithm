package 구간의_합_구하기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 2차원 배월의 크기과 질문 개수를 입력 받아 변수들을 선언한다.
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[][] sum = new long[N][N];
        // 구간합을 계산
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N ; j++){
                if(i > 0 && j > 0){
                    sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + Integer.parseInt(st.nextToken());
                }
                else if(j > 0){
                    sum[i][j] = sum[i][j-1] + Integer.parseInt(st.nextToken());
                }
                else if(i > 0){
                    sum[i][j] = sum[i-1][j] + Integer.parseInt(st.nextToken());
                }
                else{
                    sum[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        // 계산 값을 출력
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 자기 자신도 생각
            if(x1 > 1 && y1 > 1){
                System.out.println(sum[x2-1][y2-1]+ sum[x1-2][y1-2] - sum[x1-2][y2-1] - sum[x2-1][y1-2]);
            }
            else if(x1 > 1){
                System.out.println(sum[x2-1][y2-1] - sum[x1-2][y2-1]);
            }
            else if(y1 > 1){
                System.out.println(sum[x2-1][y2-1] - sum[x2-1][y1-2]);
            }
            else{
                System.out.println(sum[x2-1][y2-1]);
            }


        }

    }
}

