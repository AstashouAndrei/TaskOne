package by.gstu.training.plane;

import by.gstu.training.exception.IncorrectAircraftTypeException;

/**
 * Class with common freighter description
 */

public class Freighter extends Plane {

    private static final String FREIGHTER = "Freighter";

    private int payLoad;

    public Freighter(Aircraft aircraft, int flightRange, int fuelConsumption, int payLoad) throws IncorrectAircraftTypeException {
        super(aircraft, flightRange, fuelConsumption);
        this.payLoad = payLoad;
    }

    @Override
    public String getType() {
        return FREIGHTER;
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
        Freighter freighter = (Freighter) obj;
        return payLoad == freighter.payLoad;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + payLoad;
    }

    public int getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(int payLoad) {
        this.payLoad = payLoad;
    }
}
