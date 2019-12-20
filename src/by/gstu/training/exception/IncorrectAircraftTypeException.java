package by.gstu.training.exception;

/**
 * Class with description of Exceptions which throws in case of incorrect
 * type while plane creating
 */

public class IncorrectAircraftTypeException extends Exception {

    private String passedType;
    private String actualType;

    public IncorrectAircraftTypeException(String passedType, String actualType) {
        this.passedType = passedType;
        this.actualType = actualType;
    }

    public String toString() {
        return "Error! Type " + passedType + " is incorrect for this plane model (" + actualType + ")";
    }


}
