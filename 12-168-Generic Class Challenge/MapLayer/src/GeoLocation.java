public class GeoLocation implements Mappable {
    String name;
    String type;

    @Override
    public String render() {
        return "%s as %s".formatted(name, type);
    }
}
