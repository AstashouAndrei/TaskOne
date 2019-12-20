package by.gstu.training.fleet;

import by.gstu.training.plane.Plane;

import java.util.ArrayList;

/**
 * Class with common logic of fleet modifications
 */

public class FleetModifier {

    /**
     * Method checks all planes in the fleet and returns new fleet with planes
     * which fuel consumption satisfy specified parameters.
     *
     * @param fleet    fleet
     * @param minValue - minimum value of fuel consumption
     * @param maxValue - maximum value of fuel consumption
     * @return modified fleet
     */
    public Fleet addPlanesByFuelConsumptionRange(Fleet fleet, int minValue, int maxValue) {

        ArrayList<Plane> properPlanes = new ArrayList<Plane>();

        for (int i = 0; i < fleet.getPlanes().size(); i++) {
            int fuelConsumption = fleet.getPlanes().get(i).getFuelConsumption();
            if (fuelConsumption > minValue && fuelConsumption < maxValue) {
                properPlanes.add(fleet.getPlanes().get(i));
            }
        }
        return new Fleet(properPlanes);
    }
}
