public class Lab1 {

    // Задание 1

    public double fraction(double x) {
        return x - (int) x;
    }

    public int charToNum(char x) {
        return x - '0';
    }

    public boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }

    public boolean isInRange(int a, int b, int num) {
        int min;
        int max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        return num >= min && num <= max;
    }

    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Задание 2

    public int abs(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    public boolean is35(int x) {
        boolean div3 = (x % 3 == 0);
        boolean div5 = (x % 5 == 0);
        if (div3 && div5) {
            return false;
        }
        if (div3 || div5) {
            return true;
        }
        return false;
    }

    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public String day(int x) {
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Это не день недели";
        }
    }

    // Задание 3

    public String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x; i++) {
            res = res + i + " ";
        }
        return res;
    }

    public String chet(int x) {
        String res = "";
        for (int i = 0; i <= x; i += 2) {
            res = res + i + " ";
        }
        return res;
    }

    public int numLen(long x) {
        if (x == 0) {
            return 1;
        }
        if (x < 0) {
            x = -x;
        }
        int count = 0;
        while (x > 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j >= (x - 1 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Задание 4

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int max = arr[0];
        int maxAbsVal = abs(max);
        for (int i = 1; i < arr.length; i++) {
            int currentAbs = abs(arr[i]);
            if (currentAbs > maxAbsVal) {
                max = arr[i];
                maxAbsVal = currentAbs;
            }
        }
        return max;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        int index = 0;
        for (int i = 0; i < pos; i++) {
            result[index] = arr[i];
            index++;
        }
        for (int i = 0; i < ins.length; i++) {
            result[index] = ins[i];
            index++;
        }
        for (int i = pos; i < arr.length; i++) {
            result[index] = arr[i];
            index++;
        }
        return result;
    }

    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
}