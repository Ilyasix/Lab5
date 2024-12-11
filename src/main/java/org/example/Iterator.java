package org.example;

/**
 * Інтерфейс для ітерації елементів у списку.
 */
public interface Iterator {
    void First();            // Переходить на перший елемент
    void Next();             // Переходить до наступного елемента
    boolean isDone();        // Перевіряє, чи досягнуто кінця списку
    String CurrentItem();    // Повертає поточний елемент
}
