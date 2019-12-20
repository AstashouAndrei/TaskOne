package by.gstu.training.fleet;

import by.gstu.training.plane.Plane;

import java.util.ArrayList;

/**
 * Class with common description of fleet
 */

public class Fleet {

    private ArrayList<Plane> planes;

    public Fleet() {
        planes = new ArrayList<Plane>();
    }

    public Fleet(ArrayList<Plane> planes) {
        this.planes = planes;
    }

    /**
     * Method adds plane to the fleet
     *
     * @param plane plane which had to been added to fleet
     * @return new ArrayList with added plane
     */
    public ArrayList<Plane> addPlane(Plane plane) {
        planes.add(plane);
        return planes;
    }

    /**
     * Method remove plane from the fleet
     *
     * @param plane plane which had to been removed from fleet
     * @return new ArrayList with added plane
     */
    public ArrayList<Plane> removePlane(Plane plane) {
        planes.remove(plane);
        return planes;
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<Plane> planes) {
        this.planes = planes;
    }
}
