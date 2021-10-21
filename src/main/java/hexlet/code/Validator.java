package hexlet.code;


import lombok.Data;

@Data
public class Validator {
    /**
     * @return StringSchema
     */
    public StringSchema string() {
        return new StringSchema();
    }

    public NumberSchema number() {
        return new NumberSchema();
    }
}
