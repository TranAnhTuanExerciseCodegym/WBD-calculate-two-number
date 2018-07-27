import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 3;
        Scanner scanner = new Scanner(System.in);
        String opera = scanner.nextLine();

        double calculator = opreation(number1, number2, opera);
        System.out.println(calculator);
    }

    private static double opreation(int number1, int number2, String oprea) {
//        switch (oprea) {
//            case "+":
//                return number1 + number2;
//            case "-":
//                return number1 - number2;
//            default:
//                return 0;
//        }
        return 0;
    }
}
