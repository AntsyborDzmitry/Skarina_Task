package kiryl;

import kiryl.event.Event;
import kiryl.util.Constants;
import kiryl.util.EventFileReader;
import kiryl.util.Writer;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class EventsTest {

    public static void main(String[] args) throws IOException {
        //i.e. args[0] = src/main/java/kiryl/test
        List<Event> events = EventFileReader.readPassedRecords(args[0]);
        Writer writer = new Writer(System.out);
        writer.printEvents("Collection from file", events);
        events.sort(Constants.EVENT_COMPARATOR);
        writer.printEvents("Sorted collection", events);
        Event min = events.stream()
                .filter(event -> event.getMaxMark() > Constants.FILTER_BOUNDS)
                .min(Collections.reverseOrder(Constants.EVENT_COMPARATOR))
                .orElse(null);
        writer.printEvent("Event with minimum mark from maximum marks", min,
                "Event with minimum mark from maximum marks not found");
    }
}
