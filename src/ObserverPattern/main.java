package ObserverPattern;

import ObserverPattern.MobileExtention.MobileAppListener;

public class main {
    public static void main(String[] args) {
        Store store = new Store();
        store.getService().subscribe(
            new EmailMsgListener("Dimitar123@abv.bg")
        );
        store.getService().subscribe(
            new MobileAppListener("Jorkojo")
        );
    }
}
