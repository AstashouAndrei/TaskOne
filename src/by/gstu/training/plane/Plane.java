package by.gstu.training.plane;

import by.gstu.training.exception.IncorrectAircraftTypeException;

/**
 * Class with common plane description
 */

public abstract class Plane {

    private Aircraft aircraft;
    private int flightRange;
    private int fuelConsumption;

    Plane(Aircraft aircraft, int flightRange, int fuelConsumption) throws IncorrectAircraftTypeException {
        this.aircraft = setAircraftType(aircraft);
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Method returns type of aircraft
     *
     * @return aircraft type
     */
    public abstract String getType();

    /**
     * Method checks and returns aircraft types (Freighter / Airliner)
     * by calling getType() method. Throws IncorrectAircraftTypeException
     * if types is incorrect.
     *
     * @param aircraft aircraft
     * @return aircraft with Freighter type
     * @throws IncorrectAircraftTypeException
     */
    public Aircraft setAircraftType(Aircraft aircraft) throws IncorrectAircraftTypeException {
        if (aircraft.getType().equals(getType())) {
            return aircraft;
        } else {
            throw new IncorrectAircraftTypeException(aircraft.getType(), getType());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Plane plane = (Plane) obj;
        return flightRange == plane.flightRange &&
                fuelConsumption == plane.fuelConsumption &&
                aircraft == plane.aircraft;
    }

    @Override
    public int hashCode() {
        final int hash = 13;
        int result = hash + flightRange * hash;
        return result + fuelConsumption * hash;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
