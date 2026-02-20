package task3;

public class Path {
    public City city;
    public int cost;

    public Path(City city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    public String toString() {
        return city.name + ":" + cost;
    }
}