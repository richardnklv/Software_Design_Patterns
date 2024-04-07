package MementoPattern;


// instead of having other classes invade the personal space everywhere
// and do far more than needed
// we will delegate the memory storage to the same class
class TextArea {
    private String text;

    public void set(String text) {
        this.text = text;
    }

    public Memento takeSnapShot() {
        return new Memento(this.text);
    }
    public void restore(Memento memento) {
        this.text = memento.getSavedText();
    }

    public static class Memento {
        private final String text;

        private Memento(String textToSave) {
            text = textToSave;
        }

        private String getSavedText() {
            return text;
        }
    }

}

