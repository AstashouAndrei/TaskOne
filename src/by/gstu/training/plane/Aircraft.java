package by.gstu.training.plane;

/**
 * Enumeration of aircraft's. Each aircraft got personal model and type
 */

public enum Aircraft {

    BOEING_747F("Boeing 747-8F", "Freighter"),
    BOEING_777F("Boeing 777F", "Freighter"),
    AIRBUS_A380F("Airbus A380F", "Freighter"),
    ANTONOV_AN_225("Antonov An-225", "Freighter"),

    BOEING_737_200ER("Boeing 777-200ER", "Airliner"),
    BOEING_737_800("Boeing 777-800", "Airliner"),
    AIRBUS_A320("Airbus A320-100", "Airliner"),
    AIRBUS_A321("Airbus A321-200", "Airliner"),
    AIRBUS_A330("Airbus A330-300", "Airliner"),
    SUKHOI_SJ100("Sukhoi SSJ 100", "Airliner");

    private String model;
    private String type;

    Aircraft(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
