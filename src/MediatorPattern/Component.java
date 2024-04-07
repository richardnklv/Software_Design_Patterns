package MediatorPattern;


// this is the interface for a component, such as a button
// this will interact with the other interface - the Mediator
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
