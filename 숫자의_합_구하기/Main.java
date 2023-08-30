package 숫자의_합_구하기;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int sum = 0;
        String input = sc.nextLine();

        for(int i = 0 ; i < N ; i++){
           sum += input.charAt(i) - '0';
        }

        System.out.println(sum);
    }



}
