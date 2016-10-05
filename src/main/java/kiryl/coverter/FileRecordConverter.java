package kiryl.coverter;

import kiryl.event.Event;

public interface FileRecordConverter {

    Event convert(String record);
}
