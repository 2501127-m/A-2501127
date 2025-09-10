import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //준비물
        Scanner keyboard = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int result = 0;

        //Data 입력
        System.out.print("첫번째 정수 입력 : ");
        first = keyboard.nextInt();
        System.out.print("두번째 정수 입력 : ");
        second = keyboard.nextInt();

        //처리
        result = first * second;

        //Information 출력
        System.out.printf("%d * %d = %,d\n", first, second, result);

    }
}