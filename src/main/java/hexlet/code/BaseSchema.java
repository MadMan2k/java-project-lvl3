package hexlet.code;

import lombok.Data;

@Data
public abstract class BaseSchema {
    private int requiredState;

    /**
     * turn on required.
     */
    public void required() {
        this.setRequiredState(1);
    }
}
