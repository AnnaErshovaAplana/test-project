import java.util.Scanner;

/**
 * @author Anna Ershova
 * Creating a calulator
 * @see #calculate(float, int, float)
 * */
public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое дробное число: ");
        float first = scanner.nextFloat();
        System.out.println("Введите действие\n 1 - сложение;\n 2 - вычитание;\n 3 - умножение;\n 4 - деление\n ");
        int action = scanner.nextInt();
        System.out.println("Введите второе дробное число: ");
        float second = scanner.nextFloat();
        scanner.close();
        System.out.printf("Результат операции: %.4f \n", calculate(first, action, second));
    }

    /**
     *
     * @param number1 first number for calculation
     * @param action action that must be performed with two numbers
     * @param number2 second number for calculation
     * @return calculation of number1 and number2 based on action (1 - сложение; 2 - вычитание; 3 - умножение; 4 - деление)
     */
    public static float calculate(float number1, int action, float number2) {
        float result;
        if (action == 1) {
            result = number1 + number2;
        } else if (action == 2) {
            result = number1 - number2;
        } else if (action == 3) {
            result = number1 * number2;
        } else {
            result = number1 / number2;
        }
        return result;
    }
}