package ObserverPattern;

public class Store {
    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomer();
    }

    public NotificationService getService() {
        return notificationService;
    }

}
