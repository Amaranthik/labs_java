package ru.chepovetskiy.geometry;

// Задание 3.5: Трехмерная точка (Наследование)
public class Point3D extends Point {
    public int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + ";" + z + "}";
    }

    // Переопределяем equals, чтобы учитывать Z (для 6.2)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Point3D point3D = (Point3D) obj;
        return z == point3D.z;
    }
}