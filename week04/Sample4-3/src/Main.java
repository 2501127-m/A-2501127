import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int won; //data
        float convert; //data
        float dollar; //정보

        System.out.print("오늘의 달러 환율 입력: ");
        convert = keyboard.nextFloat();
        System.out.print("원화 금액을 입력 : ");
        won = keyboard.nextInt();

        dollar = won /convert;

        System.out.printf("원화 %,d원은 %,f 달러입니다.\n", won, dollar);
    }
}