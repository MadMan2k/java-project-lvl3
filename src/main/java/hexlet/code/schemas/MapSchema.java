package hexlet.code.schemas;

import java.util.Map;
import java.util.function.Predicate;

public class MapSchema extends BaseSchema {
    private int sizeOfState;
    private int sizeOfTheMap;
    private int shapeState;
    private Map<String, BaseSchema> shape;

    /**
     * @param o input object
     * @return check result
     */
    @Override
    protected boolean isValidRequired(Object o) {
        Predicate<Object> isMap = p -> p instanceof Map;
        Predicate<Object> sizeIsEqual = p -> ((Map) o).size() == sizeOfTheMap;
        Predicate<Object> isShape = p -> {
            for (Map.Entry<Object, Object> entry
                    : ((Map<Object, Object>) o).entrySet()) {
                if (!shape.get(entry.getKey()).isValid(entry.getValue())) {
                    return false;
                }
            }
            return true;
        };


        Predicate<Object> result = isMap;

        if (!result.test(o)) {
            return false;
        }

        if (sizeOfState == 1) {
            result = result.and(sizeIsEqual);
        }

        if (shapeState == 1) {
//            for (Map.Entry<Object, Object> entry : ((Map<Object, Object>) o).entrySet()) {
//
//                Object key = entry.getKey();
//                Object value = entry.getValue();
//
//                boolean bs = shape.get(key).isValid(value);
//
//                if (!bs) {
//                    System.out.print("* we are in false * ");
//                    return false;
//                }
//            }

            result = result.and(isShape);
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

    /**
     * @param map input map
     * @return MapSchema
     */
    public MapSchema shape(Map<String, BaseSchema> map) {
        shapeState = 1;
        super.setRequiredState(1);
        shape = Map.copyOf(map);
        return this;
    }

    /**
     * @return MapSchema
     */
    public MapSchema required() {
        super.setRequiredState(1);
        return this;
    }
}
