package kiryl.event.impl;

import kiryl.eums.EventConverterEnum;
import kiryl.mark.impl.IntegerMark10;
import kiryl.util.Constants;
import kiryl.util.Writer;

public class FirstEvent extends AbstractTwoExamEvent {

    public FirstEvent(final IntegerMark10<Integer> firstExamMark, final IntegerMark10<Integer> secondExamMark) {
        super(firstExamMark, secondExamMark);
    }

    @Override
    public boolean isPassed() {
        return firstParamExamMark.getValue().intValue() + secondParamExamMark.getValue().intValue()
                >= Constants.PASSED_SUM;
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
