package Task6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScanFile {
    public static String scanFile(String path) throws IOException {
        StringBuilder str = new StringBuilder();

        FileReader fr = new FileReader(path);
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            str.append(scan.nextLine());
        }

        fr.close();
        return str.toString();
    }

    public static String[] splitStringToList(String str) {
        String[] strings;
        strings = str.split(" ");

        return strings;
    }

    public static Map<String, Integer> countingWords(String[] array) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = array.length - 1; i >= 0; i--) {
            String a = array[i];
            int scour = 0;

            for (int j = 0; j < array.length; j++) {

                if (a.equals(array[j])) {
                    scour++;
                }
            }
            map.put(a, scour);
            scour = 0;
        }
        return map;
    }

    public static Map<String, Integer> wordMaxRepeat(Map<String, Integer> map) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        int maxValueInMap = (Collections.max(map.values()));
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(maxValueInMap)) {
                map1.put((String) entry.getKey(), (Integer) entry.getValue());

            }
        }
        return map1;
    }
}
