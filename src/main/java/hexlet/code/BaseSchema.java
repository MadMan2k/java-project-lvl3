package hexlet.code;

import lombok.Data;

@Data
public abstract class BaseSchema {
    private int requiredState;

//    public abstract boolean isValid(Object o);

    /**
     * turn on required.
     */
    public void required() {
        this.setRequiredState(1);
    }
}
