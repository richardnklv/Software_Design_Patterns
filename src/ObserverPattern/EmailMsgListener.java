package ObserverPattern;

public class EmailMsgListener implements EventListener {
    private final String email;


    public EmailMsgListener(String email) {
        this.email = email;
    }


    public void update() {
        // actually send email
    }
}
