package kiryl.event.impl;

import kiryl.event.Event;
import kiryl.mark.Mark;

public abstract class AbstractThreeExamsEvent implements Event {

    Mark firstParamExamMark;

    Mark secondParamExamMark;

    Mark thirdParamExamMark;

    public AbstractThreeExamsEvent(final Mark firstParamExamMark, final Mark secondParamExamMark, final Mark thirdParamExamMark) {
        this.firstParamExamMark = firstParamExamMark;
        this.secondParamExamMark = secondParamExamMark;
        this.thirdParamExamMark = thirdParamExamMark;
    }
}
