/*
1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
ВЫПОЛНЕНО В ЗАДАНИИ 2
2. Поиск максимального элемента в массиве.
Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
После чего в консоли вводятся слова в количестве равном заданной длине массива.
В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
3. Программа должна выполнять одно из заданий на выбор.
Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
*/

import java.util.Scanner;
/**
 * @author Anna Ershova
 * @see #calculate(float, int, float)
 * @see #getLongestWord()
 * */
public class Task_3 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие:\n Запустить калькулятор - 1\n Поиск самого длинного слова в массиве - 2");
        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("Введите первое дробное число: ");
            float first = scanner.nextFloat();
            System.out.println("Введите действие\n 1 - сложение;\n 2 - вычитание;\n 3 - умножение;\n 4 - деление\n ");
            int action = scanner.nextInt();
            System.out.println("Введите второе дробное число: ");
            float second = scanner.nextFloat();
            System.out.printf("Результат операции: %.4f \n", calculate(first, action, second));
        }
        else {
            System.out.print(getLongestWord());
        }
            scanner.close();

    }

    /**
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

    /**
     *
     * @return the longest word in the array
     */
        public static String getLongestWord() {
            String theLongest = "";
            Scanner scanner = new Scanner(System.in);
            // Определяем длину массива
            System.out.print("Введите количество слов в массиве:\n ");
            int wordNumber = scanner.nextInt();
            // Заполняем массив словами
            String[] wordsArray = new String[wordNumber];
            for (int i = 0; i < wordNumber; i++) {
                System.out.print("Введите " + (i + 1) + "-е слово в массиве:\n ");
                wordsArray[i] = scanner.next();
            }
            scanner.close();
            // Определяем самое длинное слово
            for (String word : wordsArray) {
                if (word.length() > theLongest.length()) {
                    theLongest = word;
                }
            }
            return "Самое длинное слово в массиве: " + theLongest;
        }
    }

