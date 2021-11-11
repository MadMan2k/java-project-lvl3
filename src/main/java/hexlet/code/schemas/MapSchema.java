package hexlet.code.schemas;

import java.util.Map;
import java.util.function.Predicate;

public class MapSchema extends BaseSchema {
    /**
     * @return MapSchema
     */
    public MapSchema required() {
        Predicate<Object> isMap = p -> p instanceof Map;
        super.addPredicate(isMap);
        return this;
    }

    /**
     * @param i is the required size of Map
     * @return MapSchema
     */
    public MapSchema sizeof(int i) {
        Predicate<Object> sizeIsEqual = p -> ((Map) p).size() == i;
        super.addPredicate(sizeIsEqual);
        return this;
    }

    /**
     * @param map String - name of BaseSchema, BaseSchema - set of checks
     * @return MapSchema
     */
    public MapSchema shape(Map<String, BaseSchema> map) {
        Predicate<Object> isShape = p -> {
            for (Map.Entry<Object, Object> entry
                    : ((Map<Object, Object>) p).entrySet()) {
                if (!map.get(entry.getKey()).isValid(entry.getValue())) {
                    return false;
                }
            }
            return true;
        };
        super.addPredicate(isShape);
        return this;
    }
}
