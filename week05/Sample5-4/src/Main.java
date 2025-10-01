public class Main {
    public static void main(String[] args) {
        int b = 5;
        int a = 5 > 3 ? b++ : --b;
        System.out.printf("a = %d, b = %d\n", a, b);

        a = 5 > 3 && b > a ? b++ : --b; //a = 6, b = 7
        System.out.printf("a = %d, b = %d\n", a, b);

        a = 5 < 3 && b > a ? b++ : --b; //a = 6, b = 6
        System.out.printf("a = %d, b = %d\n", a, b);
    }
}