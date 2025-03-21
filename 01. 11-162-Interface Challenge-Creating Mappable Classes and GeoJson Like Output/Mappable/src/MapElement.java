public class MapElement implements Mappable {
    String label;
    Geometry geometryType;
    String markerIcon;

    public MapElement(String label, Geometry gType, String markerIcon) {
        this.label = label;
        this.geometryType = gType;
        this.markerIcon = markerIcon;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getGeometryType() {
        return geometryType.name();
    }

    @Override
    public String getIconType() {
        return markerIcon;
    }
}
