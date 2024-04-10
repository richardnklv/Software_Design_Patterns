package ObserverPattern.MoreComplexity;

import java.util.*;

public class NotificationService {
    private final Map<Event, List<EventListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event ->
                customers.put(event, new ArrayList<>())
                );
    }

    public void subscribe(Event eventType, ObserverPattern.EventListener listener) {
        customers.get(eventType).add((EventListener) listener);
    }
    public void unsubscribe(Event eventType, ObserverPattern.EventListener listener) {
        customers.get(eventType).remove((EventListener) listener);
    }
    public void notifyUser(Event eventType) {
        customers.get(eventType).forEach(listener ->
                listener.update(eventType)
                );
    }
}
