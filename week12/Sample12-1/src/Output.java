public class Output {
    public static void display(int first, int second, int result) {
        display();     // call by name
        System.out.printf("%d + %d = %d\n", first, second, result);
        display();   // call by name
    }


    private static void display() {
        System.out.println("*****************************");
    }
}
