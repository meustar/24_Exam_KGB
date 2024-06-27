package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하면 입력받은 정수만큼의 " +
                "최상의 레벨과 갯수에서 시작하며 역 피라미드" +
                "형식으로 줄어듭니다.");
        int userNum = sc.nextInt();

        for (int i = 1; i <= userNum; i++) {
            for (int j = i; j <= userNum; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }

        // 1. 숫자가 순차적으로 찍히려면 어떻게?
        // 1-1. 1,2,3,4,5~ 는 되는데.. 역순으로는 어떻게?  >>>> -1 해주면 되는거 아닌가? 왜 안돼?
        // 2. 어떻게 피라미드 모양으로 할 수 있을까?

//        for (int i = 1; i <= userNum; i++) {
//            for (int j = i; j <= userNum; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
        sc.close();
    }
}