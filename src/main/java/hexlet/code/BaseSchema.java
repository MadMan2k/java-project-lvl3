package hexlet.code;

import lombok.Data;

@Data
public abstract class BaseSchema {
    private int requiredState;

    public void required() {
        this.setRequiredState(1);
    }
}
