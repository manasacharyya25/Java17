import java.util.List;

public class Point extends GeoLocation {
    String geoLocation;

    @Override
    public String render() {
        return "%s as %s (%s)".formatted(name, type, geoLocation);
    }
}
