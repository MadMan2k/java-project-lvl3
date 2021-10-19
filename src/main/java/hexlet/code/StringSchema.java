package hexlet.code;

public class StringSchema {
    private static int requiredState = 0;
    private static String containsState;
    private static int minLengthState = 0;
    /**
     *
     */
    public void required() {
        requiredState = 1;
    }
    /**
     * @return Boolean
     * @param s is input String
     */
    public boolean isValid(String s) {
        if (requiredState == 0 && containsState == null && minLengthState == 0) {
            return true;
        }
        if (requiredState == 1 && s != null && containsState == null && minLengthState == 0) {
            return s.length() > 0;
        }
        if (containsState != null && s != null) {
            if (s.contains(containsState)) {
                containsState = null;
                return true;
            } else {
                containsState = null;
                return false;
            }
        }
        if (minLengthState != 0 && s != null) {
            if (s.length() >= minLengthState) {
                minLengthState = 0;
                return true;
            } else {
                minLengthState = 0;
                return false;
            }
        }
        return false;
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
