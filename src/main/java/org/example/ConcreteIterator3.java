package org.example;

/**
 * Ітератор із фільтрацією за першою літерою.
 */
public class ConcreteIterator3 implements Iterator {
    private ConcreteAggregate aggregate;
    private Text current;
    private char letter;

    public ConcreteIterator3(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.current = aggregate.getFirstElement();
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public void First() {
        current = aggregate.getFirstElement();
        while (current != null && current.getValue().charAt(0) != letter) {
            current = current.getNext();
        }
    }

    @Override
    public void Next() {
        do {
            current = current.getNext();
        } while (current != null && current.getValue().charAt(0) != letter);
    }

    @Override
    public boolean isDone() {
        return current == null;
    }

    @Override
    public String CurrentItem() {
        return current != null ? current.getValue() : null;
    }
}
