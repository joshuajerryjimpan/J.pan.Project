package com.jpan.box;

import java.util.Scanner;

public class Box {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object\'s length :");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s width :");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s height：");
        int height = Integer.parseInt(scanner.next());
    }
}
