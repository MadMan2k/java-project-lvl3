package hexlet.code;

import hexlet.code.schemas.BaseSchema;
import hexlet.code.schemas.MapSchema;
import hexlet.code.schemas.NumberSchema;
import hexlet.code.schemas.StringSchema;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidatorTest {
    private static final int MINUS_TEN = -10;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SEVEN = 7;
    private static final int TEN = 10;
    private static final int ELEVEN = 11;
    private static final int FIFTEEN = 15;



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

    @Test
    void mapSchemaTest() {
        Validator v = new Validator();
        MapSchema schema = v.map();

        assertThat(schema.isValid(null)).isEqualTo(true);

        schema.required();

        assertThat(schema.isValid(null)).isEqualTo(false);
        assertThat(schema.isValid(new HashMap())).isEqualTo(true);

        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        assertThat(schema.isValid(data)).isEqualTo(true);

        schema.sizeof(2);

        assertThat(schema.isValid(data)).isEqualTo(false);
        data.put("key2", "value2");
        assertThat(schema.isValid(data)).isEqualTo(true);

        Map<String, BaseSchema> schemas = new HashMap<>();
        schemas.put("name", v.string().required());
        schemas.put("age", v.number().positive());
        schema.shape(schemas);

        Map<String, Object> human1 = new HashMap<>();
        human1.put("name", "Kolya");
        human1.put("age", 1);
        assertThat(schema.isValid(human1)).isEqualTo(true);

        Map<String, Object> human2 = new HashMap<>();
        human2.put("name", "Maya");
        human2.put("age", null);
        assertThat(schema.isValid(human2)).isEqualTo(true);

        Map<String, Object> human3 = new HashMap<>();
        human3.put("name", "");
        human3.put("age", null);
        assertThat(schema.isValid(human3)).isEqualTo(false);

        Map<String, Object> human4 = new HashMap<>();
        human4.put("name", "Valya");
        human4.put("age", -1);
        assertThat(schema.isValid(human4)).isEqualTo(false);
    }

    @Test
    void hexletTest() {
        Validator v = new Validator();
        StringSchema stringSchema = v.string();

        stringSchema.required();
        stringSchema.minLength(SEVEN);
        assertThat(stringSchema.isValid("hexlet")).isFalse();
        assertThat(stringSchema.isValid("hexlet")).isFalse();

        NumberSchema numberSchema = v.number();
        numberSchema.required();
        assertThat(numberSchema.isValid(null)).isFalse();

        MapSchema mapSchema = v.map();

        mapSchema.required();
        mapSchema.sizeof(2);

        Map<String, BaseSchema> schemas = new HashMap<>();
        schemas.put("name", v.string().required().contains("ya"));
        schemas.put("age", v.number().positive());

        mapSchema.shape(schemas);

        Map<String, Object> actual6 = new HashMap<>();
        actual6.put("name", "Ada");
        actual6.put("age", FIFTEEN);
        assertThat(mapSchema.isValid(actual6)).isFalse();
    }
}
