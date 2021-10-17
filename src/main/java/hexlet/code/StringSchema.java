package hexlet.code;

public class StringSchema {
    private static int requiredState = 0;
    private static String containsState;
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
        if (requiredState == 0 && containsState == null) {
            return true;
        }
        if (requiredState == 1 && s != null && containsState == null) {
            return s.length() > 0;
        }
        if (containsState != null) {
            return s.contains(containsState);
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
}
