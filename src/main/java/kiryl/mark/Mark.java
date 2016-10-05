package kiryl.mark;

import kiryl.mark.exception.InvalidMarkValueException;

public interface Mark<T extends Number> {
    T getValue() throws InvalidMarkValueException;
}
