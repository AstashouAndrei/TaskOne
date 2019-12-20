package by.gstu.training.plane;

/**
 * Class for printing to console detailed plane information
 */

public class PlanePresentation {

    /**
     * Method prints to console details information about plane considering
     * with it's type
     *
     * @param plane plane
     */
    public void printPlanePresentation(Plane plane) {

        if (plane instanceof Airliner) {
            System.out.printf("\t%-14s%-29s%-22s%-22s%-25s%n", plane.getAircraft().getType(),
                    plane.getAircraft().getModel(), ((Airliner) plane).getSeatingCapacity(),
                    plane.getFlightRange(), plane.getFuelConsumption());

        } else if (plane instanceof Freighter) {
            System.out.printf("\t%-14s%-29s%-22s%-22s%-25s%n", plane.getAircraft().getType(),
                    plane.getAircraft().getModel(), ((Freighter) plane).getPayLoad() + "*",
                    plane.getFlightRange(), plane.getFuelConsumption());
        }
    }
}
