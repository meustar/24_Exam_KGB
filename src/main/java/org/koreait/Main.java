package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가로길이, 세로길이의 정수를 입력하면, 사각형 넓이만큼의 별을 찍어냅니다.");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();  // 가로길

        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}