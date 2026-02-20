package task3;

import java.util.ArrayList;
import java.util.List;

public class City {
    public String name;
    public List<Path> paths;

    public City(String name) {
        this.name = name;
        this.paths = new ArrayList<>();
    }

    public void addPath(City city, int cost) {
        this.paths.add(new Path(city, cost));
    }

    public String toString() {
        String res = name + ": ";
        for (Path p : paths) {
            res += p.toString() + " ";
        }
        return res.trim();
    }
}