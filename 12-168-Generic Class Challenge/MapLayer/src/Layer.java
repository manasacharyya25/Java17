import java.util.ArrayList;
import java.util.List;

public class Layer<T extends GeoLocation> {
    List<T> items = new ArrayList<>();

    void addItems(T item) {
        items.add(item);
    }

    void renderOutput() {
        for(var item: items) {
            System.out.println(item.render());
        }
    }
}
