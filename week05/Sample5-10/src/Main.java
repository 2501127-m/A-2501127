import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int APPLE = 500;
        final int PEAR = 600;
        int apple, pear;
        int price1, price2;
        int pay;
        String result;

        System.out.printf("사과(%d 원) 구매 개수 입력 : ",APPLE);
        apple = keyboard.nextInt();
        System.out.printf("배(%d 원) 구매 개수 입력 : ",PEAR);
        pear = keyboard.nextInt();
        System.out.printf("지볼 금액 입력 : ",PEAR);
        pay = keyboard.nextInt();

        price1 = apple * APPLE;
        price2 = pear * PEAR;
        result = pay >= price1 + price2 ?
                String.format("거수름 돈 : %d 원\n", pay - (price1 + price2)) :
                String.format("지볼한 금액이 %d원 부족합니다.", price1 + price2 - pay);

        System.out.printf("사과 %d개의 가격 : %d 원\n", apple, price1);
        System.out.printf("배 %d개의 가격 : %d 원\n", pear, price2);
        System.out.printf("지볼 금액 : %d 원\n", pay);
        System.out.println(result);
    }
}