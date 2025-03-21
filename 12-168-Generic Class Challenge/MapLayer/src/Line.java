import java.util.List;

public class Line extends GeoLocation {
    List<String> geoLocation;

    @Override
    public String render() {
        return "%s as %s (%s)".formatted(name, type, geoLocation.toString());
    }
}
