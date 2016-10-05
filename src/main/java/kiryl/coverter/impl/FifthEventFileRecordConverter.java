package kiryl.coverter.impl;

import kiryl.coverter.FileRecordConverter;
import kiryl.event.Event;
import kiryl.event.impl.FifthEvent;
import kiryl.mark.impl.IntegerMark100;
import kiryl.util.Constants;

public class FifthEventFileRecordConverter implements FileRecordConverter {

    @Override
    public Event convert(final String record) {
        String[] parameters = record.split(Constants.RECORD_DATA_SEPARATOR);
        boolean mark1 = Boolean.valueOf(parameters[1]);
        boolean mark2 = Boolean.valueOf(parameters[2]);
        IntegerMark100<Integer> mark3 = new IntegerMark100<>(Integer.valueOf(parameters[3]));
        return new FifthEvent(mark1, mark2, mark3);
    }
}