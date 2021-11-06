package hexlet.code.schemas;

import java.util.function.Predicate;

public class StringSchema extends BaseSchema {
    private int containsState;
    private String contains;
    private int minLengthState;
    private int minLength;

    /**
     * @return Boolean
     * @param o is input String
     */
    @Override
    protected boolean isValidRequired(Object o) {
        Predicate<Object> notNullNorEmpty = p -> p != null && !p.toString().isEmpty();
        Predicate<Object> isLongerThan = p -> p.toString().length() >= minLength;
        Predicate<Object> contain = p -> p.toString().contains(contains);

        Predicate<Object> result = notNullNorEmpty;

        if (!result.test(o)) {
            return false;
        }

        if (containsState == 1) {
            result = result.and(contain);
        }

        if (minLengthState == 1) {
            result = result.and(isLongerThan);
        }

        return result.test(o);
    }

    /**
     * @return StringSchema
     * @param s is input String
     */
    public StringSchema contains(String s) {
        containsState = 1;
        contains = s;
        return this;
    }

    /**
     *
     * @param i is input minimum of String length
     * @return StringSchema
     */
    public StringSchema minLength(int i) {
        minLength = i;
        minLengthState = 1;
        return this;
    }
    /**
     * @return StringSchema
     */
    public StringSchema required() {
        super.setRequiredState(1);
        return this;
    }
}
