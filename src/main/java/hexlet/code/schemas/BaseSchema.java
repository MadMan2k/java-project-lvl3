package hexlet.code.schemas;

import java.util.function.Predicate;

public abstract class BaseSchema {
    private Predicate<Object> mainPredicate = p -> true;
    private boolean requiredState;
    private boolean checkState;

    /**
     * @param predicate is a check condition
     */
    protected void addPredicate(Predicate<Object> predicate) {
        mainPredicate = mainPredicate.and(predicate);
    }

//    /**
//     * @param b is a required state flag
//     */
//    public void setRequiredState(boolean b) {
//        this.requiredState = b;
//    }

//    /**
//     * @param b is a check state flag
//     */
//    public void setCheckState(boolean b) {
//        this.checkState = b;
//    }

    /**
     * @param o is an input value
     * @return result of check
     */
    public boolean isValid(Object o) {
//        if (!requiredState && !checkState) {
//            return true;
//        } else {
//            return mainPredicate.test(o);
//        }

        return mainPredicate.test(o);
    }
}
