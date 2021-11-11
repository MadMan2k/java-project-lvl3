package hexlet.code.schemas;

import java.util.function.Predicate;

public abstract class BaseSchema {
    private Predicate<Object> mainPredicate = p -> true;

    /**
     * @param predicate is a check condition
     */
    protected void addPredicate(Predicate<Object> predicate) {
        mainPredicate = mainPredicate.and(predicate);
    }

    /**
     * @param o is an input value
     * @return result of check
     */
    public boolean isValid(Object o) {
        return mainPredicate.test(o);
    }
}
