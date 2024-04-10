package ObserverPattern;

import ObserverPattern.MobileExtention.MobileAppListener;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<EmailMsgListener> customers;
    private final List<MobileAppListener> users;

    public NotificationService() {
        customers = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void subscribe(EmailMsgListener listener) {
        customers.add(listener);
    }
    public void subscribe(MobileAppListener listener) {
        users.add(listener);
    }
    public void unsubscribe(EmailMsgListener listener) {
        customers.remove(listener);
    }
    public void notifyCustomer() {
        customers.forEach(listener -> listener.update());
    }

}
