package cz.fi.muni.pa036.listennotify.api;
import cz.fi.muni.pa036.listennotify.api.event.Event;
import java.util.List;

/**
 * Note: it is user's responsibility to ensure that ids are all valid, i.e. when
 * inserting, id is not already present in the table and when updating or
 * inserting, the id exists.
 *
 * @author Miloslav Zezulka
 */
public interface ListenNotifyClient {

    /**
     * Return next event from the text database.
     */
    Event nextText();

    /**
     * Return next {@code noElements} events from the text database.
     *
     * @throws IllegalArgumentException the backing queue has less than
     * {@code noElements} items in it.
     */
    List<Event> nextText(int noelements);

    /**
     * Return next event from the binary database.
     */
    Event nextBinary();

    /**
     * Return next {@code noElements} events from the binary database.
     *
     * @throws IllegalArgumentException the backing queue has less than
     * {@code noElements} items in it.
     */
    List<Event> nextBinary(int noelements);
}
