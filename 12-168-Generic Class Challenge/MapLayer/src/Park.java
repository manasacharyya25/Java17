import java.util.List;

public class Park extends Point {
    public Park(String name, String geoLocation) {
        this.name = name;
        this.type = "NATIONAL PARK";
        this.geoLocation = geoLocation;
    }
}
