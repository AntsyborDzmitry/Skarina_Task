package kiryl.event.impl;

import kiryl.eums.EventConverterEnum;
import kiryl.mark.impl.DoubleMark10;
import kiryl.util.Constants;
import kiryl.util.Writer;

public class ThirdEvent extends AbstractTwoExamEvent {

    private boolean thirdTest;

    public ThirdEvent(final DoubleMark10 firstExamMark, final DoubleMark10 secondExamMark, final boolean thirdTest) {
        super(firstExamMark, secondExamMark);
        this.thirdTest = thirdTest;
    }

    @Override
    public boolean isPassed() {
        return firstParamExamMark.getValue().intValue() >= Constants.PASSED_MARK
                && secondParamExamMark.getValue().intValue() >= Constants.PASSED_MARK
                && thirdTest;
    }

    @Override
    public Double getMaxMark() {
        return firstParamExamMark.getValue().intValue() > secondParamExamMark.getValue().intValue()
                ? firstParamExamMark.getValue().doubleValue()
                : secondParamExamMark.getValue().doubleValue();
    }


    @Override
    public String toString() {
        return new Writer(System.out).buildEventToString(EventConverterEnum.E1.getType(), firstParamExamMark.getValue(),
                secondParamExamMark.getValue());
    }
}
