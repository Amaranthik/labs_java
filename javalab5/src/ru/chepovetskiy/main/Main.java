package ru.chepovetskiy.main;

import ru.chepovetskiy.cats.*;
import ru.chepovetskiy.fraction.*;
import ru.chepovetskiy.geometry.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Задание 1");
        Fraction f = new Fraction(1, 2);
        System.out.println(f + " = " + f.getDecimalValue());

        CachedFraction cf = new CachedFraction(1, 4);
        System.out.println(cf + " = " + cf.getDecimalValue());
        cf.setNumerator(3);
        System.out.println(cf + " = " + cf.getDecimalValue());

        System.out.println();
        System.out.println("Задание 2");
        Cat originalCat = new Cat("Барсик");
        MeowCounter counter = new MeowCounter(originalCat);
        makeMeows(Arrays.asList(counter));
        System.out.println("Количество мяуканий: " + counter.getCount());

        System.out.println();
        System.out.println("Задание 3");
        List<String> listL = new ArrayList<>(Arrays.asList("A", "A", "B", "C", "C", "A"));
        System.out.println("Исходный: " + listL);
        removeConsecutiveDuplicates(listL);
        System.out.println("Результат: " + listL);

        System.out.println();
        System.out.println("Задание 4");
        createSmetanaFile();
        solveSmetanaTask("smetana.txt");

        System.out.println();
        System.out.println("Задание 5");
        createTextField();
        solveSetTask("text.txt");

        System.out.println();
        System.out.println("Задание 6");
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 1));
        System.out.println("Очередь: " + queue);
        System.out.println("Есть совпадение с соседом (по кругу): " + checkQueueCircle(queue));

        Queue<Integer> queue2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Очередь 2: " + queue2);
        System.out.println("Есть совпадение с соседом (по кругу): " + checkQueueCircle(queue2));

        System.out.println();
        System.out.println("Задание 7.1");
        List<Point> points = Arrays.asList(
                new Point(1, 2), new Point(1, 2),
                new Point(3, -5),
                new Point(3, 3),
                new Point(5, 4)
        );
        Polyline polyline = processPoints(points);
        System.out.println(polyline);

        System.out.println();
        System.out.println("Задание 7.2");
        createPeopleFile();
        processPeopleFile("people.txt");
    }

    // Задание 2
    public static void makeMeows(List<Meowable> meowables) {
        for (Meowable m : meowables) {
            m.meow();
            m.meow();
        }
    }

    // Задание 3
    public static <T> void removeConsecutiveDuplicates(List<T> list) {
        if (list.isEmpty()) return;
        Iterator<T> iterator = list.iterator();
        T prev = iterator.next();
        while (iterator.hasNext()) {
            T current = iterator.next();
            if (Objects.equals(prev, current)) {
                iterator.remove();
            } else {
                prev = current;
            }
        }
    }

    // Задание 4
    public static void solveSmetanaTask(String filename) throws IOException {
        Map<Integer, Integer> minPrices = new HashMap<>();
        Map<Integer, Integer> counts = new HashMap<>();

        List<String> lines = Files.readAllLines(Paths.get(filename));
        int n = Integer.parseInt(lines.get(0));

        for (int i = 1; i <= n; i++) {
            String[] parts = lines.get(i).split(" ");
            if (parts.length < 4) continue;

            int fat = Integer.parseInt(parts[2]);
            int price = Integer.parseInt(parts[3]);

            if (!minPrices.containsKey(fat) || price < minPrices.get(fat)) {
                minPrices.put(fat, price);
                counts.put(fat, 1);
            } else if (price == minPrices.get(fat)) {
                counts.put(fat, counts.get(fat) + 1);
            }
        }

        System.out.println(counts.getOrDefault(15, 0) + " " +
                counts.getOrDefault(20, 0) + " " +
                counts.getOrDefault(25, 0));
    }

    // Задание 4
    public static void createSmetanaFile() throws IOException {
        List<String> lines = Arrays.asList(
                "4",
                "Domik Derevnya 15 100",
                "Prostokvashino Street 20 150",
                "Burka Polyana 25 120",
                "Perekrestok Korolenko 25 120"
        );
        Files.write(Paths.get("smetana.txt"), lines);
    }

    // Задание 5
    public static void solveSetTask(String filename) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get(filename)), "UTF-8");
        Set<Character> digits = new HashSet<>();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            }
        }
        System.out.println("Цифры в тексте: " + digits);
    }

    // Задание 5
    public static void createTextField() throws IOException {
        Files.write(Paths.get("text.txt"), "Привет 123, это текст с цифрами 5 и 1.".getBytes("UTF-8"));
    }

    // Задание 6
    public static <T> boolean checkQueueCircle(Queue<T> queue) {
        if (queue.isEmpty()) return false;

        List<T> list = new ArrayList<>(queue);
        for (int i = 0; i < list.size(); i++) {
            T current = list.get(i);
            T next = list.get((i + 1) % list.size());
            if (Objects.equals(current, next)) {
                return true;
            }
        }
        return false;
    }

    // Задание 7.1
    public static Polyline processPoints(List<Point> points) {
        List<Point> processed = points.stream()
                .distinct()
                .sorted(Comparator.comparingInt(Point::getX))
                .map(p -> new Point(p.getX(), Math.abs(p.getY())))
                .collect(Collectors.toList());
        return new Polyline(processed);
    }

    // Задание 7.2
    public static void processPeopleFile(String filename) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            Map<Integer, List<String>> grouped = lines
                    .map(line -> line.split(":"))
                    .filter(arr -> arr.length == 2 && !arr[1].isEmpty())
                    .collect(Collectors.groupingBy(
                            arr -> Integer.parseInt(arr[1]),
                            Collectors.mapping(
                                    arr -> {
                                        String name = arr[0].toLowerCase();
                                        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
                                    },
                                    Collectors.toList()
                            )
                    ));
            System.out.println(grouped);
        }
    }

    // Задание 7.2
    public static void createPeopleFile() throws IOException {
        List<String> lines = Arrays.asList(
                "Вася:5",
                "Петя:3",
                "Аня:5",
                "Бомж:",
                "ИГОРЬ:3"
        );
        Files.write(Paths.get("people.txt"), lines);
    }
}