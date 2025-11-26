import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int first, second;
        int result;

        first = Input.readData("첫번째 데이터 입력 : ");   // call by value
        second = Input.readData("두번째 데이터 입력 : ");   // call by value

        result = Compute.add(first, second);    // call by value

        Output.display(first, second, result);  // call by value
    }
}