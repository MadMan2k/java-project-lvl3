package hexlet.code;

import lombok.Data;

@Data
public abstract class BaseSchema {
    private int requiredState;

    public abstract boolean isValidRequired(Object o);

    /**
     * @param o input value
     * @return result of check
     */
    public boolean isValid(Object o) {
        if (requiredState == 0) {
            return true;
        } else {
            return isValidRequired(o);
        }
    }

    /**
     * turn on required.
     */
    public void required() {
        this.setRequiredState(1);
    }
}
