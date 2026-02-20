package ru.chepovetskiy.geometry;

import java.util.List;
import java.util.stream.Collectors;

// Задание 7.1
public class Polyline {
    private List<Point> points;

    public Polyline(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        String pts = points.stream()
                .map(Point::toString)
                .collect(Collectors.joining(","));
        return "Линия [" + pts + "]";
    }
}