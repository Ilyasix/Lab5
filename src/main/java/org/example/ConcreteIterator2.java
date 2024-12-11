package org.example;

/**
 * Ітератор із фільтрацією за довжиною рядка.
 */
public class ConcreteIterator2 implements Iterator {
    private ConcreteAggregate aggregate;
    private Text current;
    private int length;

    public ConcreteIterator2(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.current = aggregate.getFirstElement();
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void First() {
        current = aggregate.getFirstElement();
        while (current != null && current.getValue().length() != length) {
            current = current.getNext();
        }
    }

    @Override
    public void Next() {
        do {
            current = current.getNext();
        } while (current != null && current.getValue().length() != length);
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
