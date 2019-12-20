package by.gstu.training.airline;

import by.gstu.training.plane.Plane;

import java.util.Collections;
import java.util.Comparator;

/**
 * Class with common logic of airline fleet sorting
 */

public class AirlineSorter {

    /**
     * Method sorting planes in airline fleet by it's flight range: put's the plane with lowest
     * flight range parameter to the begging of airline planes list,
     * plane with highest flight range to the end of airline planes list.
     *
     * @param airline airline
     */
    public void sortPlanesByFlightRange(Airline airline) {

        Comparator<Plane> comparator = new Comparator<Plane>() {

            @Override
            public int compare(Plane o1, Plane o2) {
                if (o1.getFlightRange() - o2.getFlightRange() > 1) {
                    return 1;
                } else if (o1.getFlightRange() - o2.getFlightRange() < 1) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(airline.getFleet().getPlanes(), comparator);
    }
}
