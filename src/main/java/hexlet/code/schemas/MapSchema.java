package hexlet.code.schemas;

import java.util.Map;
import java.util.function.Predicate;

public class MapSchema extends BaseSchema {
    private static int sizeOfState;
    private static int sizeOfTheMap;

    /**
     * @param o input object
     * @return check result
     */
    @Override
    protected boolean isValidRequired(Object o) {
        Predicate<Object> isMap = p -> p instanceof Map;
        Predicate<Object> sizeIsEqual = p -> ((Map) o).size() == sizeOfTheMap;

        Predicate<Object> result = isMap;

        if (!result.test(o)) {
            return false;
        }

        if (sizeOfState == 1) {
            result = result.and(sizeIsEqual);
        }

        return result.test(o);
    }

    /**
     * @param i input size of Map
     * @return MapSchema
     */
    public MapSchema sizeof(int i) {
        sizeOfState = 1;
        sizeOfTheMap = i;
        return this;
    }
}
