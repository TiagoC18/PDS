package lab;

// Memento class
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// Originator class
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}

// Caretaker class
class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}

public class Mementoo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Set and save the state
        originator.setState("State 1");
        caretaker.setMemento(originator.saveStateToMemento());

        // Change the state
        originator.setState("State 2");

        // Restore the previous state
        originator.restoreStateFromMemento(caretaker.getMemento());

        System.out.println("Current State: " + originator.getState());
    }
}
p