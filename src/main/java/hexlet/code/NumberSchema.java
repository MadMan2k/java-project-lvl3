package hexlet.code;

import java.util.function.Predicate;

public class NumberSchema extends BaseSchema {
    private static int positiveState;
    private static int rangeState;
    private static int lowerBoundOfRange;
    private static int upperBoundOfRange;

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
     * @param o is input
     * @return  check result
     */
    public boolean isValid(Object o) {
        Predicate<Object> isInteger = p -> p instanceof Integer;
        Predicate<Object> isPositive = p -> (Integer) p > 0;
        Predicate<Object> isInRange = p -> (Integer) p >= lowerBoundOfRange && (Integer) p <= upperBoundOfRange;

        if (super.getRequiredState() == 1) {
            Predicate<Object> result = isInteger;

            if (!result.test(o)) {
                return false;
            }

            if (positiveState != 0) {
                result = result.and(isPositive);
            }

            if (rangeState != 0) {
                result = result.and(isInRange);
            }

            return result.test(o);
        }
        return true;
    }
}
