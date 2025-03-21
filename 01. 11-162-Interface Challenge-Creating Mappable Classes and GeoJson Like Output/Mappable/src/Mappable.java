public interface Mappable {
    String JSON_PROPERTY = """
            "properties": {%s}
            """;

    String getLabel();
    String getGeometryType();
    String getIconType();

    default String toJSON() {
        return String.format("""
                "type": "%s", "label": "%s", "marker": "%s" """, getGeometryType(), getLabel(), getIconType());
    }

    // When defining a toString method in each Concrete Class to take care of just the additional elements
    // static String setProperties(Mappable mapElement) {
    // return String.format(JSON_PROPERTY, mapElement.toJSON()+", "+mapElement.toString());
    // }

    // When Extending the default toJson() method in each concrete class
    static String setProperties(Mappable mapElement) {
        return JSON_PROPERTY.formatted(mapElement.toJSON());
    }
}
