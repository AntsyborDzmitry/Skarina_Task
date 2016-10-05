package kiryl.event.impl;

import kiryl.event.Event;
import kiryl.mark.Mark;

public abstract class AbstractOneExamEvent implements Event {

    Mark firstParamExamMark;

    public AbstractOneExamEvent(final Mark firstParamExamMark) {
        this.firstParamExamMark = firstParamExamMark;
    }
}
