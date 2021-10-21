package hexlet.code;

import java.util.function.Predicate;

public class NumberSchema {
    private static int requiredState = 0;
    private static int positiveState = 0;
    private static int rangeState = 0;
    private static int lowerBoundOfRange = 0;
    private static int upperBoundOfRange = 0;

    /**
     * turn on notNullNorEmpty check.
     */
    public void required() {
        requiredState = 1;
    }

    /**
     * @return NumberSchema
     */
    public NumberSchema positive() {
        positiveState = 1;
        return this;
    }

    /**
     * @param firstInt lower bound of range
     * @param secondInt upper bound of range
     * @return NumberSchema
     */
    public NumberSchema range(int firstInt, int secondInt) {
        rangeState = 1;
        lowerBoundOfRange = firstInt;
        upperBoundOfRange = secondInt;
        return this;
    }

    /**
     * @param i input int
     * @return check result
     */
    public boolean isValid(int i) {
        if (requiredState != 0 && positiveState == 0 && rangeState == 0) {
            return true;
        }

        if (positiveState != 0 && rangeState == 0) {
            return i > 0;
        }

        if (rangeState != 0) {
            Predicate<Integer> range = p -> p >= lowerBoundOfRange && p <= upperBoundOfRange;
            return range.test(i);
        }

        return false;
    }

    /**
     * @param o input object
     * @return return true if no any checks added
     */
    public boolean isValid(Object o) {
        return requiredState == 0;
    }

}