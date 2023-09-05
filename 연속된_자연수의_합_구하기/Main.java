package 연속된_자연수의_합_구하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start_index = 1;
        int end_index = 1;
        int count = 1;

        //
        while (end_index != N){
            long total = sum(start_index,end_index);
            if(total < N){
                end_index++;
            }
            else if(total == N){
                count++;
                end_index++;
            }
            else{
                start_index++;
            }
        }

        System.out.println(count);
    }

    public static long sum(int start, int end){
        long result = 0;

        for(int i = start ; i <= end ; i++){
            result += i;
        }

        return result;
    }
}
