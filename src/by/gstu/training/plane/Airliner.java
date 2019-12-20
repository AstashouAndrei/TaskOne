package by.gstu.training.plane;

import by.gstu.training.exception.IncorrectAircraftTypeException;

/**
 * Class with common airliner description
 */

public class Airliner extends Plane {

    private static final String AIRLINER = "Airliner";

    private int seatingCapacity;

    public Airliner(Aircraft aircraft, int flightRange, int fuelConsumption, int seatingCapacity) throws IncorrectAircraftTypeException {
        super(aircraft, flightRange, fuelConsumption);
        this.seatingCapacity = seatingCapacity;
    }

    /**
     * Method returns Airliner type
     *
     * @return type "Airliner"
     */
    @Override
    public String getType() {
        return AIRLINER;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Airliner airliner = (Airliner) obj;
        return seatingCapacity == airliner.seatingCapacity;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}
