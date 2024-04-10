package ObserverPattern.MobileExtention;

import ObserverPattern.EventListener;

public class MobileAppListener implements EventListener {

    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update() {
        // actually send the push notification
    }
}
