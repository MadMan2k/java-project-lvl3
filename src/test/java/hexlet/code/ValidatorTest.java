package hexlet.code;

import hexlet.code.schemas.NumberSchema;
import hexlet.code.schemas.StringSchema;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidatorTest {
    private static final int MINUS_TEN = -10;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int TEN = 10;
    private static final int ELEVEN = 11;



    @Test
    void stringSchemaTest() {
        Validator v = new Validator();
        StringSchema schema = v.string();

        assertThat(schema.isValid("")).isEqualTo(true);
        assertThat(schema.isValid(null)).isEqualTo(true);

        schema.required();

        assertThat(schema.isValid("what does the fox say")).isEqualTo(true);
        assertThat(schema.isValid("hexlet")).isEqualTo(true);
        assertThat(schema.isValid(null)).isEqualTo(false);
        assertThat(schema.isValid("")).isEqualTo(false);

        assertThat(schema.contains("what").isValid("what does the fox say")).isEqualTo(true);
        assertThat(schema.contains("whatthe").isValid("what does the fox say")).isEqualTo(false);
        assertThat(schema.minLength(2).isValid("ol")).isEqualTo(true);
        assertThat(schema.minLength(2).isValid("o")).isEqualTo(false);
    }

    @Test
    void numberSchemaTest() {
        Validator v = new Validator();
        NumberSchema schema = v.number();

        assertThat(schema.isValid(null)).isEqualTo(true);
        schema.required();
        assertThat(schema.isValid(null)).isEqualTo(false);
        assertThat(schema.isValid(TEN)).isEqualTo(true);
        assertThat(schema.isValid("5")).isEqualTo(false);
        assertThat(schema.positive().isValid(TEN)).isEqualTo(true);
        assertThat(schema.isValid(MINUS_TEN)).isEqualTo(false);
        schema.range(FIVE, TEN);
        assertThat(schema.isValid(FIVE)).isEqualTo(true);
        assertThat(schema.isValid(TEN)).isEqualTo(true);
        assertThat(schema.isValid(FOUR)).isEqualTo(false);
        assertThat(schema.isValid(ELEVEN)).isEqualTo(false);
    }
}
