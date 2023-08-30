package 숫자의_합_구하기;
import java.util.Scanner;
public class Fail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 0을 처리하려면...아...그냥 앞의 자리수만 받아도 될려나??
        // N이 100일수도 있어서 쓸 수가 없다...
        // int는 21억이고 long은 19자리라서...
        int N = sc.nextInt();
        sc.nextLine();
        int input = sc.nextInt();
        sc.nextLine();
        int sum = 0;

        for(int i = 0 ; i < N ; i++){
            sum += input%10;
            input /= 10;
        }

        System.out.println(sum);
    }
}
