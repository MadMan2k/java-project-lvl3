package hexlet.code.schemas;

import lombok.Data;

@Data
public abstract class BaseSchema {
    private int requiredState;
    private int checkState;

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

    /**
     * turn on required.
     * @return BaseSchema
     */
    public BaseSchema required() {
        requiredState = 1;
        return this;
    }
}
