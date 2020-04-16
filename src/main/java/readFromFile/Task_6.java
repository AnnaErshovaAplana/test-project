package readFromFile; /**
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле.
 * Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */
import java.io.*;
import java.util.*;


public class Task_6 {
    public static void main(String[] args) {
        String s;
        List<String> allWords = new ArrayList<String>();
//создаем объект FileReader, помещенный в оболочку на основе класса BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\wordsforcount.txt"))) {
            // считываем строки пока они не закончатся
            while ((s = br.readLine()) != null) {
                // разделяем строку на слова и записываем их в список allWords
                String[] temp = s.split(" ");
                for (String word : temp) {
                    allWords.add(word);
                }
            }
            //сортируем список реулизуя метод интерфейса Comporator
            Collections.sort(allWords, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareToIgnoreCase(o2);
                }
            });

            //создаем обьект для хранения слов и их повторяемости
            Map<String, Integer> wordCounter = new HashMap<>();
            // считаем сколько раз каждое слово встречается.Если слово еще нет в словаре, то создаем новую пару. Если есть, увеличиваем счетчик
            for (String word : allWords) {
                if (wordCounter.containsKey(word)) {
                    wordCounter.put(word, (wordCounter.get(word) + 1));
                } else {
                    wordCounter.put(word, 1);
                }
            }
            //выводим статистику на консоль
            System.out.println("Считаем, сколько раз каждое слово встречается в файле");
            for (Map.Entry e : wordCounter.entrySet()) {
                System.out.println(e);
            }
            System.out.println();
            //ищем и выводим слово с макимальной частотностью
            int temp = 0;
            String tempWord = "";
            for (Map.Entry e : wordCounter.entrySet()) {
                if (((int) e.getValue()) > temp) {
                    temp = (int) e.getValue();
                    tempWord = (String) e.getKey();
                }
            }
            System.out.println("Выводим на консоль слово с максимальным количеством повторений.");
            System.out.println("Слово " + tempWord + " отображается " + temp + " раз");
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
