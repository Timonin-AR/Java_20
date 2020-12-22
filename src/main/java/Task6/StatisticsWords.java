package Task6;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class StatisticsWords {
    public static void main(String[] args) throws IOException {
        System.out.println("Считываем файл...");
        String b = ScanFile.scanFile("C:\\Users\\TIMONIN\\IdeaProjects\\Java 2.0\\src\\main\\java\\Task6\\text.txt");
        System.out.println("Файл считан. В нем лежат слова: \n" + b);
        String[] a = ScanFile.splitStringToList(b);
        System.out.println("Разделяю слова, чтобы их подсчитать:");
        for (String strings : a) {
            System.out.println(strings);
        }
        Arrays.sort(a);
        System.out.println("Сортирую данный список слов по алфавиту\n");
        for (String strings : a) {
            System.out.println(strings);
        }
        System.out.println("Вывожу статистику повторов:\n");
        Map<String, Integer> maps = ScanFile.countingWords(a);
        for (Map.Entry entry : maps.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + " "
                    + entry.getValue() + " раз повторилось. ");
        }
        System.out.println("Ищу самое повторяемое слово:\n\n");
        maps = ScanFile.wordMaxRepeat(maps);
        for (Map.Entry entry : maps.entrySet()) {
            System.out.println("Больше всего повторилось слово: " + entry.getKey() + " "
                    + entry.getValue() + " раз! ");
        }

    }


}

