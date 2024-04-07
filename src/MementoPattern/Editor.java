package MementoPattern;

import java.util.Deque;
import java.util.LinkedList;

// this class will keep the history of the TextArea class
class Editor {
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public void write(String text) {
        textArea.set(text);
        stateHistory.add(textArea.takeSnapShot());
    }

    public void undo() {
        textArea.restore(stateHistory.pop());
    }

}
