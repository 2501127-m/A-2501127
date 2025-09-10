import java.util.Scanner;

public class Main {
    private static Scanner keyboard;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;
        String addr = "";

        System.out.print("당신의 이름은 ?");
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는 ?", name);
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("%s님의 주소는 ?", name);
        addr = keyboard.nextLine();

        System.out.printf("\n%s님의 나이는 %d살 입니다. \n", name, age);
        System.out.printf("%s님의 주소는 %s 입니다. \n", name, addr);
    }
}