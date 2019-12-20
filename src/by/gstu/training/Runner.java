package by.gstu.training;

import by.gstu.training.airline.Airline;
import by.gstu.training.airline.AirlinePresentation;
import by.gstu.training.airline.AirlineSorter;
import by.gstu.training.exception.IncorrectAircraftTypeException;
import by.gstu.training.fleet.Fleet;
import by.gstu.training.fleet.FleetModifier;
import by.gstu.training.plane.Aircraft;
import by.gstu.training.plane.Airliner;
import by.gstu.training.plane.Freighter;

/**
 * Class for running application
 */

public class Runner {
    public static void main(String[] args) throws IncorrectAircraftTypeException {

        Fleet fleet = new Fleet();
        fleet.addPlane(new Airliner(Aircraft.AIRBUS_A320, 10000, 4000, 260));
        fleet.addPlane(new Airliner(Aircraft.AIRBUS_A321, 12000,4500,280));
        fleet.addPlane(new Airliner(Aircraft.BOEING_737_800, 9000, 3800,220));
        fleet.addPlane(new Airliner(Aircraft.SUKHOI_SJ100, 7500, 4300,210));
        fleet.addPlane(new Airliner(Aircraft.BOEING_737_200ER, 8000, 4700, 220));
        fleet.addPlane(new Freighter(Aircraft.ANTONOV_AN_225, 5000, 7200, 200));
        fleet.addPlane(new Airliner(Aircraft.AIRBUS_A330, 13000,5700, 300));


        fleet.addPlane(new Freighter(Aircraft.BOEING_747F, 8500, 6800, 110));
        fleet.addPlane(new Freighter(Aircraft.BOEING_777F, 14500, 6000,135));
        fleet.addPlane(new Freighter(Aircraft.AIRBUS_A380F, 11000, 7200, 145));


        Airline aeroflot = new Airline("Aeroflot",fleet);

        AirlineSorter airlineSorter = new AirlineSorter();
        airlineSorter.sortPlanesByFlightRange(aeroflot);

        AirlinePresentation presentation = new AirlinePresentation();
        presentation.printAirlinePresentation(aeroflot);

        FleetModifier fleetModifier = new FleetModifier();
        Fleet lowCostFleet = fleetModifier.addPlanesByFuelConsumptionRange(fleet, 4000, 5000);

        Airline lowCoaster = new Airline("Low Cost", lowCostFleet);

        presentation.printAirlinePresentation(lowCoaster);

    }
}
