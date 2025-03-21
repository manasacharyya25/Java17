public class Building extends MapElement {
    String name;
    String usage;

    public Building(String label, String markerIcon, String usage) {
        super(label, Geometry.POINT, markerIcon);
        this.name = label;
        this.usage = usage;
    }

    @Override
    public String toJSON() {
        return super.toJSON() + """
                , "name": "%s", "usage": "%s" """.
                formatted(name, usage);
    }
}
