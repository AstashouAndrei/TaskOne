package by.gstu.training.fleet;

import by.gstu.training.plane.Plane;
import by.gstu.training.plane.Airliner;
import by.gstu.training.plane.Freighter;

import java.util.ArrayList;

/**
 * Class with common logic of calculating total's characteristics of the fleet
 */

public class FleetTotalsCounter {

    /**
     * Method calculate and returns total seating capacity of all fleet airliners
     * if the fleet
     *
     * @param fleet fleet
     * @return total value of fleet seating capacity
     */
    public int getTotalSeatingCapacity(Fleet fleet) {
        int totalSeating = 0;
        for (int i = 0; i < getNumberOfAllPlanes(fleet); i++) {
            if (getAllPlanes(fleet).get(i) instanceof Airliner) {
                totalSeating += ((Airliner) getAllPlanes(fleet).get(i)).getSeatingCapacity();
            }
        }
        return totalSeating;
    }

    /**
     * Method calculate and returns total payload of all freighters
     * in the fleet
     *
     * @param fleet fleet
     * @return total value of fleet payload
     */
    public int getTotalPayLoad(Fleet fleet) {
        int totalPayLoad = 0;
        for (int i = 0; i < getNumberOfAllPlanes(fleet); i++) {
            if (getAllPlanes(fleet).get(i) instanceof Freighter) {
                totalPayLoad += ((Freighter) getAllPlanes(fleet).get(i)).getPayLoad();
            }
        }
        return totalPayLoad;
    }

    /**
     * Method calculate and returns total number of planes
     *
     * @param fleet fleet
     * @return total numbers of fleet planes
     */
    public int getNumberOfAllPlanes(Fleet fleet) {
        return getAllPlanes(fleet).size();
    }

    /**
     * Method calculate and returns total number of airliners
     *
     * @param fleet fleet
     * @return total number of fleet airliners
     */
    public int getNumberOfAirliners(Fleet fleet) {
        int totalAirliners = 0;
        for (int i = 0; i < fleet.getPlanes().size(); i++) {
            if (getAllPlanes(fleet).get(i) instanceof Airliner) {
                totalAirliners++;
            }
        }
        return totalAirliners;
    }

    /**
     * Method calculate and returns total number of freighters
     *
     * @param fleet fleet
     * @return total number of fleet freighters
     */
    public int getNumberOfFreighters(Fleet fleet) {
        int totalFreighters = 0;
        for (int i = 0; i < fleet.getPlanes().size(); i++) {
            if (getAllPlanes(fleet).get(i) instanceof Freighter) {
                totalFreighters++;
            }
        }
        return totalFreighters;
    }

    /**
     * Method returns ArrayList of fleet planes
     *
     * @param fleet fleet
     * @return total number of fleet planes
     */
    private ArrayList<Plane> getAllPlanes(Fleet fleet) {
        return fleet.getPlanes();
    }
}

