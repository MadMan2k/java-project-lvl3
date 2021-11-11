package hexlet.code.schemas;

import java.util.function.Predicate;

public class NumberSchema extends BaseSchema {
    /**
     * @return NumberSchema
     */
    public NumberSchema positive() {
        Predicate<Object> isPositive = p -> p == null || Integer.parseInt(p.toString()) > 0;
        super.addPredicate(isPositive);
        return this;
    }

    /**
     * @param firstInt is the lowest number required
     * @param secondInt is the largest number required
     * @return NumberSchema
     */
    public NumberSchema range(int firstInt, int secondInt) {
        Predicate<Object> isInRange = p -> (Integer) p >= firstInt && (Integer) p <= secondInt;
        super.addPredicate(isInRange);
        return this;
    }

    /**
     * @return NumberSchema
     */
    public NumberSchema required() {
        Predicate<Object> isInteger = p -> p instanceof Integer;
        super.addPredicate(isInteger);
        return this;
    }
}
