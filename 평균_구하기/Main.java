package 평균_구하기;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // N을 받는다.
        int N = Integer.parseInt(sc.nextLine());

        // int score, int max, sum를 선언
        int score = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        // 입력을 받는다.
        // 모든 scores를 더해서 sum을 구하면서 max 값을 저장한다.
        for(int i = 0 ; i < N ; i++){
            score = sc.nextInt();
            if(score > max){
                max = score;
            }
            sum += score;
        }

        // /M*100연산을 진행한다.
        System.out.println((double) sum/max*100/N);
    }

}
