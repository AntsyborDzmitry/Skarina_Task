package kiryl.event.impl;

import kiryl.eums.EventConverterEnum;
import kiryl.mark.impl.IntegerMark100;
import kiryl.util.Constants;
import kiryl.util.Writer;

public class FifthEvent extends AbstractOneExamEvent {

    private boolean firstTest;

    private boolean secondTest;

    public FifthEvent(final boolean firstTest, final boolean secondTest, final IntegerMark100<Integer> thirdExamMark) {
        super(thirdExamMark);
        this.firstTest = firstTest;
        this.secondTest = secondTest;
    }

    @Override
    public boolean isPassed() {
        return firstTest && secondTest && firstParamExamMark.getValue().intValue()
                >= Constants.PASSED_MARK_BOUNDS_100;
    }

    @Override
    public Double getMaxMark() {
        return firstParamExamMark.getValue().doubleValue();
    }

    @Override
    public String toString() {
        return new Writer(System.out).buildEventToString(EventConverterEnum.E5.getType(), firstTest, secondTest,
                firstParamExamMark.getValue());
    }
}
