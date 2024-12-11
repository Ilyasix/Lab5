package org.example;

/**
 * Клас, що реалізує інтерфейс Aggregate для створення ітераторів.
 */
public class ConcreteAggregate implements Aggregate {
    private Text firstElement; // Посилання на перший елемент списку

    /**
     * Додає новий елемент до списку.
     *
     * @param value Значення нового елемента.
     */
    public void add(String value) {
        if (firstElement == null) {
            firstElement = new Text();
            firstElement.setValue(value);
        } else {
            Text current = firstElement;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            Text newElement = new Text();
            newElement.setValue(value);
            current.setNext(newElement);
            newElement.setPrev(current);
        }
    }

    public Text getFirstElement() {
        return firstElement;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Iterator createIteratorByLength() {
        return new ConcreteIterator2(this);
    }

    @Override
    public Iterator createIteratorByFirstLetter() {
        return new ConcreteIterator3(this);
    }
}
