package cz.fi.muni.pa036.listennotify.api.event;

import cz.fi.muni.pa036.listennotify.api.DataRow;
import java.util.Objects;

/**
 *
 * Immutable object representing a new event received from LISTEN.
 *
 * @author Miloslav Zezulka
 */
public class Event {

    private final String table;
    private final EventType action;
    private final DataRow data;

    public Event(String table, EventType action, DataRow data) {
        Objects.requireNonNull(table);
        Objects.requireNonNull(action);
        Objects.requireNonNull(data);
        this.table = table;
        this.action = action;
        this.data = data;
    }

    public String getTable() {
        return table;
    }

    public EventType getAction() {
        return action;
    }

    public DataRow getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ListenNotifyEvent{" + "table=" + table + ", action=" + action + ", data=" + data + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.table);
        hash = 59 * hash + Objects.hashCode(this.action);
        hash = 59 * hash + Objects.hashCode(this.data);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        final Event other = (Event) obj;
        return table.equals(other.table) && action.equals(other.action) && data.equals(other.data);
    }

}
