package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
        public static void main(String[] args) throws FileNotFoundException {
            File file = new File("src/main/resources/dushi.txt");
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!„«»<>…\"\\s–]+");

            Map<String, Integer> map = new HashMap<>();

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!map.containsKey(word))
                    map.put(word, 1);
                else
                    map.put(word, map.get(word) + 1);
            }

            int i = 0;
            map = Sort.sortByValues(map);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (i < 100) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());          // Чичиков - 608
                    i++;
                }
                else return;
            }
        }
    }
    class CustomComparator<String, Integer extends Comparable> implements Comparator<String> {
        private Map<String, Integer> map;

        public CustomComparator(Map<String, Integer> map) {
            this.map = new HashMap<>(map);
        }

        @Override
        public int compare(String s1, String s2) {
            return map.get(s2).compareTo(map.get(s1));
        }
    }

    class Sort {
        public static <String, Integer> Map<String, Integer> sortByValues(Map<String, Integer> map)
        {
            Comparator<String> comparator = new CustomComparator(map);

            Map<String, Integer> sortedMap = new TreeMap<>(comparator);
            sortedMap.putAll(map);

            return sortedMap;
        }
    }
