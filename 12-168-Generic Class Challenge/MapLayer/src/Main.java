import java.util.List;

public class Main {
    public static void main(String[] args) {
        Park p1 = new Park("Grand Canyon", "{40.1021, -75.4231}");
        Park p2 = new Park("Grand Canyon", "{40.1021, -75.4231}");
        Park p3 = new Park("Grand Canyon", "{40.1021, -75.4231}");

        River r1 = new River("Mississippi", List.of(new String[]{"{40.1021, -75.4231}", "{46.216, 095.2348}"}));

        Layer<Park> l1 = new Layer<>();
        l1.addItems(p1);
        l1.addItems(p2);
        l1.renderOutput();

    }
}