package hexlet.code.schemas;

public abstract class BaseSchema {
    private int requiredState;
    private int checkState;

    /**
     * @return Aaaa
     */
    public int getRequiredState() {
        return requiredState;
    }

    /**
     * @return Aaaa
     */
    public int getCheckState() {
        return checkState;
    }

    /**
     * @param i
     */
    public void setRequiredState(int i) {
        this.requiredState = i;
    }

    /**
     * @param i
     */
    public void setCheckState(int i) {
        this.checkState = i;
    }

    protected abstract boolean isValidRequired(Object o);

    /**
     * @param o input value
     * @return result of check
     */
    public boolean isValid(Object o) {
        if (requiredState == 0 && checkState == 0) {
            return true;
        } else {
            return isValidRequired(o);
        }
    }
}
