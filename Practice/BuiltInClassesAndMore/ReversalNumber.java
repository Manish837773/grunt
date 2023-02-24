package BuiltInClassesAndMore;

import java.util.Scanner;

public class ReversalNumber {
    public static void main(String[] args) {
        System.out.print("Input a number : ");
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        int n = 0, d = 0;
        while(number > 0){
            d = (number % 10);
            number /= 10;
            n = (n * 10) + d;
        }
        System.out.println("Reversed number : "+ n);

        StringBuilder num = new StringBuilder(n);
        System.out.println("Reversed using StringBuilder " + num.reverse().toString());
        sc.close();
    }
}
