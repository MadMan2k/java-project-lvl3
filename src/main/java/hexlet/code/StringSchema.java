package hexlet.code;

import java.util.function.Predicate;

public class StringSchema {
    private static int requiredState = 0;
    private static String containsState;
    private static int minLengthState = 0;

    /**
     * turn on notNullNorEmpty check
     */
    public void required() {
        requiredState = 1;
    }

    /**
     * @return Boolean
     * @param s is input String
     */
    public boolean isValid(String s) {
        if (requiredState != 0 && containsState == null && minLengthState == 0) {
            Predicate<String> notNullNorEmpty = p -> p != null && !p.isEmpty();
            return notNullNorEmpty.test(s);
        }

        if (containsState != null) {
            Predicate<String> contain = p -> p.contains(containsState);
            boolean containResult = contain.test(s);
            containsState = null;
            return containResult;
        }

        if (minLengthState != 0) {
            Predicate<Integer> minLength = p -> p >= minLengthState;
            boolean minLengthResult = minLength.test(s.length());
            minLengthState = 0;
            return minLengthResult;
        }
        return true;
    }

    /**
     * @return StringSchema
     * @param s is input String
     */
    public StringSchema contains(String s) {
        containsState = s;
        return this;
    }

    /**
     *
     * @param i is input minimum of String length
     * @return StringSchema
     */
    public StringSchema minLength(int i) {
        minLengthState = i;
        return this;
    }
}
