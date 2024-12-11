package org.example;

/**
 * Інтерфейс для створення різних типів ітераторів.
 */
public interface Aggregate {
    Iterator createIterator();             // Простий ітератор
    Iterator createIteratorByLength();     // Ітератор із фільтрацією за довжиною
    Iterator createIteratorByFirstLetter();// Ітератор із фільтрацією за першою літерою
}
