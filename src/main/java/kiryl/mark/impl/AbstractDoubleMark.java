package kiryl.mark.impl;

import kiryl.mark.Mark;
import kiryl.mark.exception.InvalidMarkValueException;

public abstract class AbstractDoubleMark<T extends Double> implements Mark<T> {

    protected final T mark;

    public AbstractDoubleMark(final T mark) {
        this.mark = mark;
    }

    @Override
    public T getValue() throws InvalidMarkValueException {
        isValid();
        return mark;
    }

    abstract void isValid() throws InvalidMarkValueException;

    boolean isWholeOrHalf() {
        return tenTimesMultiple() % 5 == 0;
    }

    private int tenTimesMultiple() {
        return (int) Math.round(mark.doubleValue() * 10);
    }
}
