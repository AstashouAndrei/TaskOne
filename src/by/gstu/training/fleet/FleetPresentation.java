package by.gstu.training.fleet;

/**
 * Class for printing to console detailed fleet information
 */

public class FleetPresentation {

    public void printFleetDetailedPresentation(Fleet fleet) {
        printPlanesNumberAndType(fleet);
        printTotalSeatingCapacityAndPayLoad(fleet);
    }

    /**
     * Method prints to console total number of planes, and separately
     * number of airliners and freighters.
     *
     * @param fleet fleet
     */
    public void printPlanesNumberAndType(Fleet fleet) {

        FleetTotalsCounter counter = new FleetTotalsCounter();

        System.out.println("Fleet: " + counter.getNumberOfAllPlanes(fleet) +
                " planes: " + counter.getNumberOfAirliners(fleet) + " airliners / " +
                counter.getNumberOfFreighters(fleet) + " freighters.\n\r");
    }

    /**
     * Method prints to console total seating capacity of all airliners,
     * total payload of all freighters in the fleet.
     *
     * @param fleet fleet
     */
    public void printTotalSeatingCapacityAndPayLoad(Fleet fleet) {

        FleetTotalsCounter counter = new FleetTotalsCounter();

        System.out.println("Fleet specifications: total seating capacity - " +
                counter.getTotalSeatingCapacity(fleet) + " / total payload - " +
                counter.getTotalPayLoad(fleet));
    }
}
