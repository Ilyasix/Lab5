package org.example;

/**
 * Простий ітератор для послідовного доступу до елементів.
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private Text current;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.current = aggregate.getFirstElement();
    }

    @Override
    public void First() {
        current = aggregate.getFirstElement();
    }

    @Override
    public void Next() {
        if (current != null) {
            current = current.getNext();
        }
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
