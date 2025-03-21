public class UtilityLine extends MapElement {
    String name;
    String utility;

    public UtilityLine(String label, String markerIcon, String utility) {
        super(label, Geometry.LINE, markerIcon);
        this.name = label;
        this.utility = "FIBER OPTIC";
    }

    @Override
    public String toString() {
        return String.format("""
                "name": "%s", "utility": "%s"
                """, name, utility);
    }
}
