import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab1 lab = new Lab1();

        while (true) {
            System.out.println();
            System.out.println("Выберите задание (1-4) или 0 для выхода:");

            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int part = scanner.nextInt();

            if (part == 0) {
                break;
            }

            System.out.println("Выберите номер задачи (1, 3, 5, 7, 9):");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int task = scanner.nextInt();

            switch (part) {
                case 1:
                    runPart1(lab, task, scanner);
                    break;
                case 2:
                    runPart2(lab, task, scanner);
                    break;
                case 3:
                    runPart3(lab, task, scanner);
                    break;
                case 4:
                    runPart4(lab, task, scanner);
                    break;
                default:
                    System.out.println("Неверный номер задания.");
            }
        }
    }

    private static void runPart1(Lab1 lab, int task, Scanner scanner) {
        switch (task) {
            case 1:
                System.out.println("Введите дробное число:");
                double x1 = scanner.nextDouble();
                System.out.println("Результат: " + lab.fraction(x1));
                break;
            case 3:
                System.out.println("Введите символ (0-9):");
                String s = scanner.next();
                char c = s.charAt(0);
                System.out.println("Результат: " + lab.charToNum(c));
                break;
            case 5:
                System.out.println("Введите число:");
                int x5 = scanner.nextInt();
                System.out.println("Результат: " + lab.is2Digits(x5));
                break;
            case 7:
                System.out.println("Введите границы диапазона и число (a b num):");
                int a7 = scanner.nextInt();
                int b7 = scanner.nextInt();
                int num7 = scanner.nextInt();
                System.out.println("Результат: " + lab.isInRange(a7, b7, num7));
                break;
            case 9:
                System.out.println("Введите три числа (a b c):");
                int a9 = scanner.nextInt();
                int b9 = scanner.nextInt();
                int c9 = scanner.nextInt();
                System.out.println("Результат: " + lab.isEqual(a9, b9, c9));
                break;
        }
    }

    private static void runPart2(Lab1 lab, int task, Scanner scanner) {
        switch (task) {
            case 1:
                System.out.println("Введите число:");
                int x1 = scanner.nextInt();
                System.out.println("Модуль: " + lab.abs(x1));
                break;
            case 3:
                System.out.println("Введите число:");
                int x3 = scanner.nextInt();
                System.out.println("Делится на 3 или 5: " + lab.is35(x3));
                break;
            case 5:
                System.out.println("Введите 3 числа:");
                int m1 = scanner.nextInt();
                int m2 = scanner.nextInt();
                int m3 = scanner.nextInt();
                System.out.println("Максимум: " + lab.max3(m1, m2, m3));
                break;
            case 7:
                System.out.println("Введите 2 числа:");
                int s1 = scanner.nextInt();
                int s2 = scanner.nextInt();
                System.out.println("Сумма: " + lab.sum2(s1, s2));
                break;
            case 9:
                System.out.println("Введите день недели (1-7):");
                int d = scanner.nextInt();
                System.out.println("День: " + lab.day(d));
                break;
        }
    }

    private static void runPart3(Lab1 lab, int task, Scanner scanner) {
        switch (task) {
            case 1:
                System.out.println("Введите число x:");
                int x1 = scanner.nextInt();
                System.out.println("Строка чисел: " + lab.listNums(x1));
                break;
            case 3:
                System.out.println("Введите число x:");
                int x3 = scanner.nextInt();
                System.out.println("Четные числа: " + lab.chet(x3));
                break;
            case 5:
                System.out.println("Введите число:");
                long x5 = scanner.nextLong();
                System.out.println("Количество цифр: " + lab.numLen(x5));
                break;
            case 7:
                System.out.println("Введите размер квадрата:");
                int x7 = scanner.nextInt();
                lab.square(x7);
                break;
            case 9:
                System.out.println("Введите высоту треугольника:");
                int x9 = scanner.nextInt();
                lab.rightTriangle(x9);
                break;
        }
    }

    private static void runPart4(Lab1 lab, int task, Scanner scanner) {
        if (task == 5) {
            System.out.println("Размер массива 1:");
            int s1 = scanner.nextInt();
            int[] arr1 = new int[s1];
            System.out.println("Элементы массива 1:");
            for (int i = 0; i < s1; i++) {
                arr1[i] = scanner.nextInt();
            }

            System.out.println("Размер массива 2:");
            int s2 = scanner.nextInt();
            int[] arr2 = new int[s2];
            System.out.println("Элементы массива 2:");
            for (int i = 0; i < s2; i++) {
                arr2[i] = scanner.nextInt();
            }

            System.out.println("Позиция для вставки:");
            int pos = scanner.nextInt();

            System.out.println("Результат: " + Arrays.toString(lab.add(arr1, arr2, pos)));
            return;
        }

        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        switch (task) {
            case 1:
                System.out.println("Число для поиска:");
                int x = scanner.nextInt();
                System.out.println("Индекс: " + lab.findFirst(arr, x));
                break;
            case 3:
                System.out.println("Максимальное по модулю: " + lab.maxAbs(arr));
                break;
            case 7:
                System.out.println("Перевернутый массив: " + Arrays.toString(lab.reverseBack(arr)));
                break;
            case 9:
                System.out.println("Число для поиска:");
                int x9 = scanner.nextInt();
                System.out.println("Индексы: " + Arrays.toString(lab.findAll(arr, x9)));
                break;
        }
    }
}