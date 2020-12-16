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
    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public static class Sweets {
        int weight;
        int price;
        String name;

        Sweets(int weight, int price, String name) {
            this.name = name;
            this.price = price;
            this.weight = weight;

        }
    }

    public static void main(String[] args) throws IOException {
//        System.out.println("Вечер в хату, мир");
//        System.out.printf("%d", 7845)
        //ЗАДАНИЕ 3

        System.out.println("Какую программу хотете запустить? \n 1 - Какалятор \n 2 - БигСлово\n 3 - Массивы" +
                "\n 4 - СюрпрайзМазафака");
        BufferedReader readr = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(readr.readLine());
        switch (start) {
            case (1):
                System.out.println("Какое действие хотите выполнить?\n 1 - Сложение.\n 2 - Вычитание. \n 3 - Умножение. \n 4 - Деление.");
                int startCal = Integer.parseInt(readr.readLine());
                System.out.println("Введите первое число");
                float one = Float.parseFloat(readr.readLine());
                System.out.println("Введите второе число");
                float two = Float.parseFloat(readr.readLine());
                switch (startCal) {
                    case (1):
                        System.out.printf("Результат: " + "%.4f", (one + two));
                        break;
                    case (2):
                        System.out.printf("Результат: " + "%.4f", (one - two));
                        break;
                    case (3):
                        System.out.printf("Результат: " + "%.4f", (one * two));
                        break;
                    case (4):
                        System.out.printf("Результат: " + "%.4f", (one / two));
                        break;
                }
                break;
            case (2):

                System.out.println("Заполните массив. Чтобы прекратить запить напишите \"Стоп\"");
                ArrayList<String> list = new ArrayList<String>();
                while (true) {
                    String line = readr.readLine();

                    if (line.equals("Стоп")) {
                        break;
                    } else {
                        list.add(line);
                    }
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
                break;
            case (3):
                System.out.println("Создаю массив[20] из рандомных чисел от -10 до 10");
                int[] array = new int[20];
                for (int j = 0; j < array.length; j++) {
                    array[j] = randomWithRange(-10, 10);
                    System.out.print("[" + array[j] + "]");
                }
                System.out.println("\nИщу максимальное и минимальное значение в массиве");
                int maxNumber = 0;
                int maxIndex = 0;
                int minNumber = 0;
                int minIndex = 0;
                for (i = 0; i < array.length; i++) {

                    if (maxNumber <= array[i]) {
                        maxNumber = array[i];
                        maxIndex = i;
                    }
                    if (minNumber >= array[i]) {
                        minNumber = array[i];
                        minIndex = i;
                    }
                }
                System.out.println("Минимальный: " + minNumber + " и его индекс в массиве = " + (minIndex + 1) + "\nМаксимальное: " + maxNumber + " и его индекс в массиве = " + (maxIndex + 1) + "\n \nМеняю их местами");
                array[maxIndex] = minNumber;
                array[minIndex] = maxNumber;
                System.out.println("Полученный результат:\n");
                for (int k = 0; k < array.length; k++) {
                    System.out.print("[" + array[k] + "]");
                }
                break;
            case (4):
                System.out.println("Создали подарок вместительностью в 3 сладости");
                Sweets[] gift = new Sweets[3];

                Sweets cake = new Sweets(12, 31, "Печенье");
                Sweets Candy = new Sweets(2, 1, "Конфета");
                Sweets Jellybean = new Sweets(10, 8, "Мармелад");
                gift[0] = cake;
                gift[1] = Candy;
                gift[2] = Jellybean;
                System.out.println("Добавили в него " + cake.name + " , " + Candy.name + " , " + Jellybean.name + "\n А теперь посчитаем чтолько он стоит и сколько весит...");
                System.out.println("Вес подарка составляет: " + (cake.weight + Candy.weight + Jellybean.weight) + " грамма. \n Его стоимость = " + (cake.price + Candy.price + Jellybean.price) + " деревенных. \n В нем лежит: " + cake.name + ", " + Candy.name + ", " + Jellybean.name
                );
                break;


        }
    }
}
