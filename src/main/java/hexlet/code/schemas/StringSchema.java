package hexlet.code.schemas;

import java.util.function.Predicate;

public class StringSchema extends BaseSchema {
    /**
     * @param s is searching String
     * @return StringSchema
     */
    public StringSchema contains(String s) {
        Predicate<Object> contain = p -> p.toString().contains(s);
        super.addPredicate(contain);
        return this;
    }

    /**
     * @param i is required minimum length
     * @return StringSchema
     */
    public StringSchema minLength(int i) {
        Predicate<Object> isLongerThan = p -> p.toString().length() >= i;
        super.addPredicate(isLongerThan);
        return this;
    }

    /**
     * @return StringSchema
     */
    public StringSchema required() {
        Predicate<Object> notNullNorEmpty = p -> p != null && !p.toString().isEmpty();
        super.addPredicate(notNullNorEmpty);
        return this;
    }
}
