import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height;
        float standard;

        System.out.print("당신의 키는 입력(170,1) : ");
        height = keyboard.nextFloat();

        standard = (height - 100) * 0.9f;

        System.out.printf("키가 %.2f Cm인 표준 체중은 %.2f Kg입니다.\n", height, standard);

    }
}