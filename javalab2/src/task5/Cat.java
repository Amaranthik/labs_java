package task5;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String toString() {
        return "кот: " + name;
    }

    public void meow() {
        System.out.println(name + ": мяу!");
    }

    public void meow(int n) {
        System.out.print(name + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print("мяу");
            if (i < n - 1) {
                System.out.print("-");
            }
        }
        System.out.println("!");
    }
}