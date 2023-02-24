package BuiltInClassesAndMore;

import java.io.Console;
import java.util.Scanner;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder("Mugen");
        StringBuilder str3 = new StringBuilder("Tsukiyomi");

        System.out.println(str1.append(str2));
        System.out.println(str2.insert(str2.length()-1, str3));
        System.out.println(str2.codePointAt(0));


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println("Welcome to Java "+name+"!");
        sc.close();//Close the scanner and releases all system resources


        Console console = System.console();

        console.printf("Name", "args");
    }
}
