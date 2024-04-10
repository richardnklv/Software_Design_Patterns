package StatePattern;


// The state pattern would mean that
// we can have only several states in which
// in this case the phone can be
// it can either be off, in lock screen, or in the home screen
public abstract class State {
    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();

    public abstract String onOffOn();
}
