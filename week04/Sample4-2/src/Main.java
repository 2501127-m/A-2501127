import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int op1, op2;
        int result1, result2;
        float result3;

        System.out.printf("첫 번째 수를 입력 (분자) :");
        op1 = keyboard.nextInt();
        System.out.printf("두 번째 수를 입력 (분모) : ");
        op2 = keyboard.nextInt();

        result1 = op1 / op2; // 몫
        result2 = op1 % op2; // 나머지
        result3 = (float) op1 / op2 ; // 몫 실수


        System.out.printf("%d를 %d로 나누면 몫 = %d, 나머지 = %d 이다.", op1, op2, result1, result2);
        System.out.printf("%d를 %d로 나누면 = %.1f 이다.", op1, op2, result3);

    }
}