package by.gstu.training.airline;

import by.gstu.training.fleet.FleetPresentation;
import by.gstu.training.plane.Plane;
import by.gstu.training.plane.PlanePresentation;

/**
 * Class for printing to console detailed airline information
 */

public class AirlinePresentation {

    /**
     * Method prints to console detailed information about Airline:
     * airline name, fleet information, detailed information about all planes.
     *
     * @param airline airline
     */
    public void printAirlinePresentation(Airline airline) {

        printShortAirlinePresentation(airline);

        System.out.println("Planes detailed specifications:");
        System.out.printf("\t%-16s%-17s%-30s%-20s%-20s%n", "Plane type",
                "Plane model", "Seating capacity / Payload*", "Flight range", "Fuel consumption");

        for (Plane plane : airline.getFleet().getPlanes()) {
            PlanePresentation presentation = new PlanePresentation();
            presentation.printPlanePresentation(plane);
        }
    }

    /**
     * Method prints to console main information about Airline: airline name,
     * number and types planes in fleet
     *
     * @param airline airline
     */
    public void printShortAirlinePresentation(Airline airline) {

        FleetPresentation fleetPresentation = new FleetPresentation();

        System.out.println("***  AIRLINE: " + airline.getName() + " *** \n\r");

        fleetPresentation.printPlanesNumberAndType(airline.getFleet());
    }
}
