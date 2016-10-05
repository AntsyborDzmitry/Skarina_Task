package kiryl.coverter.impl;

import kiryl.coverter.FileRecordConverter;
import kiryl.event.Event;
import kiryl.event.impl.ThirdEvent;
import kiryl.mark.impl.DoubleMark10;
import kiryl.util.Constants;

public class ThirdEventFileRecordConverter implements FileRecordConverter {

    @Override
    public Event convert(final String record) {
        String[] parameters = record.split(Constants.RECORD_DATA_SEPARATOR);
        DoubleMark10<Double> mark1 = new DoubleMark10<>(Double.valueOf(parameters[1]));
        DoubleMark10<Double> mark2 = new DoubleMark10<>(Double.valueOf(parameters[2]));
        boolean mark3 = Boolean.valueOf(parameters[3]);
        return new ThirdEvent(mark1, mark2, mark3);
    }
}