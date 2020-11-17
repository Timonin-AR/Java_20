import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

//Задание №2 КАКУЛЯТОР НА СЛОЖЕНИЕ ДРОБНЫХ ЧИСЕЛ
        /**
         * Считываем вводные данные с клавиатуры, с кайфом
         */
        BufferedReader readr = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Отдуши передаем данные в переменную "one" и "two" парсим в нужный формат
         */
        System.out.println("Введите первое число");
        float one = Float.parseFloat(readr.readLine());
        System.out.println("Введите второе число");
        float two = Float.parseFloat(readr.readLine());
        /**
         * Складываем наши переменные и выводим результат в заданном формате
         */
        System.out.printf("Результат: " + "%.4f", one + two);

    }
}
