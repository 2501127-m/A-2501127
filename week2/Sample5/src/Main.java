import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        short age = 0;
        float height = 0.0f;
        double weight = 0.0;

        System.out.print("당신의 이름은 ?");
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는 ?", name);
        age = keyboard.nextShort();
        System.out.printf("%s님의 키는 ?", name);
        height = keyboard.nextFloat();
        System.out.printf("%s님의 몸무게는 ?", name);
        weight = keyboard.nextDouble();


        System.out.printf("\n%s님의 나이는 살 입니다. \n", name, age);
        System.out.printf("%s님의 키는 %f Cm 입니다.", name, height);
        System.out.printf("%s님의 몸무게는 %f Kg 입니다.", name, weight);
    }
}