package org.example;

/**
 * Головний клас для демонстрації використання шаблону проектування "Ітератор"
 * з різними механізмами фільтрації.
 */
public class Main {
    public static void main(String[] args) {
        // Створення нового агрегату
        ConcreteAggregate list = new ConcreteAggregate();

        // Заповнення списку елементами
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.add("sixth");
        list.add("seventh");
        list.add("eighth");
        list.add("ninth");

        // Простий ітератор для послідовного доступу
        ConcreteIterator iter = new ConcreteIterator(list);
        iter.First();
        iter.Next();
        iter.Next();
        System.out.println("Елемент: " + iter.CurrentItem());

        // Ітератор із фільтрацією за довжиною рядка
        ConcreteIterator2 iter2 = new ConcreteIterator2(list);
        iter2.setLength(7);
        iter2.First();
        System.out.println("Фільтрований за довжиною: " + iter2.CurrentItem());

        // Ітератор із фільтрацією за першою літерою
        ConcreteIterator3 iter3 = new ConcreteIterator3(list);
        iter3.setLetter('s');
        iter3.First();
        System.out.println("Фільтрований за першою літерою: " + iter3.CurrentItem());
    }
}
