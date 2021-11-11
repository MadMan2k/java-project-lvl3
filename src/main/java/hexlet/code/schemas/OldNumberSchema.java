//package hexlet.code.schemas;
//
//import java.util.function.Predicate;
//
//public class NumberSchema extends BaseSchema {
//    private int positiveState;
//    private int rangeState;
//    private int lowerBoundOfRange;
//    private int upperBoundOfRange;
//
//    /**
//     * @param o is input
//     * @return check result
//     */
//    @Override
//    protected boolean isValidRequired(Object o) {
//        Predicate<Object> isInteger = p -> p instanceof Integer;
//        Predicate<Object> isPositive = p -> p == null || (Integer) p > 0;
//        Predicate<Object> isInRange = p -> (Integer) p >= lowerBoundOfRange && (Integer) p <= upperBoundOfRange;
//
//        Predicate<Object> result = p -> true;
//
//        if (!isInteger.test(o) && super.getCheckState() == 0) {
//            return false;
//        }
//
//
//        if (positiveState == 1) {
//            result = result.and(isPositive);
//        }
//
//        if (rangeState == 1) {
//            result = result.and(isInRange);
//        }
//
//        return result.test(o);
//    }
//
//    /**
//     * @return NumberSchema
//     */
//    public NumberSchema positive() {
//        positiveState = 1;
//        super.setCheckState(1);
//        return this;
//    }
//
//    /**
//     * @param firstInt lower bound of range
//     * @param secondInt upper bound of range
//     * @return NumberSchema
//     */
//    public NumberSchema range(int firstInt, int secondInt) {
//        rangeState = 1;
//        lowerBoundOfRange = firstInt;
//        upperBoundOfRange = secondInt;
//        return this;
//    }
//    /**
//     * @return NumberSchema
//     */
//    public NumberSchema required() {
//        super.setRequiredState(true);
//        super.setCheckState(0);
//        return this;
//    }
//}