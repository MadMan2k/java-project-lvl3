package hexlet.code.schemas;

import java.util.function.Predicate;

public abstract class BaseSchema {
    private Predicate<Object> mainPredicate = p -> true;
    private boolean requiredState;
    private boolean checkState;

    /**
     * @param predicate is check condition
     */
    protected void addPredicate(Predicate<Object> predicate) {
        mainPredicate = mainPredicate.and(predicate);
    }

//    /**
//     * @return Aaaa
//     */
//    public int getCheckState() {
//        return checkState;
//    }

    /**
     * @param b
     */
    public void setRequiredState(boolean b) {
        this.requiredState = b;
    }

    /**
     * @param b
     */
    public void setCheckState(boolean b) {
        this.checkState = b;
    }

//    protected abstract boolean isValidRequired(Object o);

    /**
     * @param o input value
     * @return result of check
     */
    public boolean isValid(Object o) {
        if (!requiredState && !checkState) {
            return true;
        } else {
            return mainPredicate.test(o);
//            return isValidRequired(o);
        }
    }
}
