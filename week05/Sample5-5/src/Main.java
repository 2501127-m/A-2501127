import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int data = 0;
        String result = "";

        System.out.print("양의 정수 입력 : ");
        data = keyboard.nextInt();

        result = ((data % 2) == 0) ? "짝수" : "홀수";

        System.out.printf("%d는 %s입니다\n", data, result);
    }
}