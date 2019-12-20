package by.gstu.training.airline;

import by.gstu.training.fleet.Fleet;

/**
 * Class with common description of airline
 */

public class Airline {

    private String name;
    private Fleet fleet;

    public Airline(String name, Fleet fleet) {
        this.name = name;
        this.fleet = fleet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

}
