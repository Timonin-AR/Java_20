import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Прохожу курс по JAVA 2.0
 *
 * @author TIMONIN
 * Пишу кайфовый жи есть канкулятор
 */

public class Base {
    public static void main(String[] args) throws IOException {
//        System.out.println("Вечер в хату, мир");
//        System.out.printf("%d", 7845)
        //ЗАДАНИЕ 3
        System.out.println("Какую программу хотете запустить? \n 1 - Какалятор \n 2 - БигСлово");
        BufferedReader readr = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(readr.readLine());
        switch (start) {
            case (1):
                System.out.println("Какое действие хотите выполнить?\n 1 - Сложение.\n 2 - Вычитание. \n 3 - Умножение. \n 4 - Деление.");
                int startCal = Integer.parseInt(readr.readLine());
                System.out.println("Введите первое число");
                int one = Integer.parseInt(readr.readLine());
                System.out.println("Введите второе число");
                int two = Integer.parseInt(readr.readLine());
                switch (startCal) {
                    case (1):
                        System.out.println("Результат: " + (one + two));
                        break;
                    case (2):
                        System.out.println("Результат: " + (one - two));
                        break;
                    case (3):
                        System.out.println("Результат: " + (one * two));
                        break;
                    case (4):
                        System.out.println("Результат: " + (one / two));
                        break;
                }
                break;
            case (2):
                System.out.println("Заполните массив");
                ArrayList<String> list = new ArrayList<String>();
                while (true) {
                    if (readr.readLine().equals("")) {
                        break;
                    }
                    else
                        list.add(readr.readLine());
                }
                int i = 0;
                int cur, indexOfMax = 0, maxLen = list.get(0).length();
                while (i < list.size() - 1) {
                    cur = list.get(++i).length();
                    if (cur > maxLen) {
                        indexOfMax = i;
                        maxLen = cur;
                    }
                }
                System.out.println("Слово максимальной длины: " + list.get(indexOfMax) + ", длина: " + maxLen);

        }
    }
}
