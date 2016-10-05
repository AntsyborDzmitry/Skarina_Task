package kiryl.coverter.impl;

import kiryl.coverter.FileRecordConverter;
import kiryl.event.Event;
import kiryl.event.impl.FourthEvent;
import kiryl.mark.impl.DoubleMark20;
import kiryl.mark.impl.IntegerMark10;
import kiryl.util.Constants;

public class FourthEventFileRecordConverter implements FileRecordConverter {

    @Override
    public Event convert(final String record) {
        String[] parameters = record.split(Constants.RECORD_DATA_SEPARATOR);
        IntegerMark10<Integer> mark1 = new IntegerMark10<>(Integer.valueOf(parameters[1]));
        IntegerMark10<Integer> mark2 = new IntegerMark10<>(Integer.valueOf(parameters[2]));
        DoubleMark20<Double> mark3 = new DoubleMark20<>(Double.valueOf(parameters[3]));
        return new FourthEvent(mark1, mark2, mark3);
    }
}