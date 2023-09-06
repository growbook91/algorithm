import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Scanner sc = new Scanner(System.in);
        //아 여기를 1로 하는 게 말이 안되는 거였네
        int count = 0;
        int start_index = 0;
        int end_index = 0;
        // N 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        // M 입력 받기
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        
        
        // 고유 값 저장하는 배열 선언
        int[] unique = new int[N];
        // 고유 값 입력
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            unique[i] = Integer.parseInt(st.nextToken());
        }

        // 고유값을 정렬해야 해!!
        Arrays.sort(unique);
        // 13699 18554
        // 투 포인터 알고리즘
        while(end_index < N && start_index < N){
            if(M > unique[start_index] + unique[end_index]){
                end_index++;
            }
            else if(M == unique[start_index] + unique[end_index]){
                count++;
                end_index++;
            }
            else if(M < unique[start_index] + unique[end_index]){
                start_index++;
            }
        }

        System.out.println(count);
        

    }


}
