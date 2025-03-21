import java.util.List;

public class River extends Line{
    public River(String name, List<String> geoLocation) {
        this.name = name;
        this.type = "RIVER";
        this.geoLocation = geoLocation;
    }
}
