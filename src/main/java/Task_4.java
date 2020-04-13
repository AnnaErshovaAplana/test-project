import java.util.Random;

/**
 * 1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 * 2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */

/**@author Anna Ershova
 * @see #switchMaxAndMin()
 */
public class Task_4 {
    public static void main(String[] args) {
        System.out.println(switchMaxAndMin());
        System.out.println();

        Chocolate choco1 = new Chocolate("Mars", 50, 23.50, false);
        Candy lolly1 = new Candy();
        lolly1.setName("Chupa-chups");
        lolly1.setWeight(5);
        lolly1.setPrice(8);
        lolly1.setColor("pink");
        Cake biscuit = new Cake("Ololo", 150, 200, true);

        System.out.println("Общая стоимость подарка: " + Present.presentPrice(choco1, lolly1, biscuit));
        System.out.println("Общий вес подарка: " + Present.presentWeight(choco1, lolly1, biscuit));
        Present.presentInfo(choco1, lolly1, biscuit);
    }

    /**
     * @return массив, в кот.поменены местами максимальный отрицательный и минимальный положительный элементы
     */
    public static String switchMaxAndMin() {
        // Создаем массив из 20 ячеек
        int[] array = new int[20];
        // Заполнем его случайными числами
        String initArray = ""; // для вывода полученного массива в консоль
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            array[i] = r.nextInt(20) - 10;
            initArray += array[i] + " ";
        }
        System.out.println("Созданный массив: " + initArray);
        //находим максимальный отрицательный и минимальный положительный элементы массива
        // максимальный отрицательный элемент
        int maxNeg = 0;
        int maxNegIndex = 0;
        // минимальный положительный элемент
        int minPos = 10;
        int minPosIndex = 0;
        for (int j = 0; j < 20; j++) {
            if(array[j] < maxNeg & array[j] < 0) {
                maxNeg = array[j];
                maxNegIndex = j;
            }
            else if (array[j] < minPos & array[j] > 0) {
                minPos = array[j];
                minPosIndex = j;
            }
        }
        System.out.println("макс. отрицательный элемент: " + maxNeg);
        System.out.println("индекс макс. отрицательного элемента: " + maxNegIndex);
        System.out.println("мин. положительный элемент: " + minPos);
        System.out.println("индекс мин. положительного элемента: " + minPosIndex);

        //Меняем местами элементы
        int temp = array[minPosIndex];
        array[minPosIndex] = array[maxNegIndex];
        array[maxNegIndex] = temp;
        String result = "";
        for (int elem : array) {
            result += elem + " ";
        }
        return ("Итоговый массив: " + result);
    }


}


