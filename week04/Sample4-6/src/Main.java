import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height;
        float weight;
        final float FEETUNIT = 0.0328084f;
        final float POUNTUNIT = 2.20462f ;

        float feet, pound;

        System.out.printf("당신의 키 입력 (170,3Cm) : ");
        height = keyboard.nextFloat();
        System.out.printf("당신의 몸무게는 입력(72,3Kg) :");
        weight = keyboard.nextFloat();

        feet = height * FEETUNIT;
        pound = weight * POUNTUNIT;

        System.out.printf("당신의 키(%.2f Cm)는 %.2f 피트(feet)입니다.\n", height, feet);
        System.out.printf("당신의 몸무게(%.2f)는 %.3f 파운드(pound)입니다.\n", weight, pound);
    }
}