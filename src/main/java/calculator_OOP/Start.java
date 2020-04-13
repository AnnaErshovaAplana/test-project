package calculator_OOP;

import java.util.Scanner;

/**
 * @author Anna Ershova
 * Creating a calulator
 */

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //сохраняем значение через конструктор, кот принимает значение
        System.out.println("Введите первое дробное число (c запятой в качестве разделителя): ");
        Number firstNumber = new Rational(scanner.nextDouble());
        //сохраняем значение через стандартный конструктор по умолчанию
        System.out.println("Введите второе дробное число (c запятой в качестве разделителя): ");
        Number secondNumber = new Rational();
        secondNumber.setValue(scanner.nextDouble());

        //сохраняем действие
        System.out.println("Введите первую букву действия\n С - сложение;\n В - вычитание;\n У - умножение;\n Д - деление\n ");
        String action = scanner.next();
        scanner.close();

        switch (action) {
            case "C": //буква в англ. раскадке
            case "С": //буква в рус. раскадке
                System.out.printf("Результат операции сложение: %.4f \n", firstNumber.addition(secondNumber));
                break;
            case "В":
                System.out.printf("Результат операции вычитание: %.4f \n", firstNumber.deduction(secondNumber));
                break;
            case "У":
                System.out.printf("Результат операции умножение: %.4f \n", firstNumber.multiplication(secondNumber));
                break;
            case "Д":
                System.out.printf("Результат операции деление: %.4f \n", firstNumber.division(secondNumber));
                break;
            default:
                System.out.println("Указано несуществующее действие. Невозможно выполнить операцию");
        }
    }
}
