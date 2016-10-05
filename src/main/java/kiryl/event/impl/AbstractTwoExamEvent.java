package kiryl.event.impl;

import kiryl.event.Event;
import kiryl.mark.Mark;

public abstract class AbstractTwoExamEvent implements Event {

    Mark firstParamExamMark;

    Mark secondParamExamMark;

    public AbstractTwoExamEvent(final Mark firstParamExamMark, final Mark secondParamExamMark) {
        this.firstParamExamMark = firstParamExamMark;
        this.secondParamExamMark = secondParamExamMark;
    }
}
