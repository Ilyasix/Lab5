package org.example;

/**
 * Клас, що представляє елемент у зв'язаному списку текстових рядків.
 */
public class Text {
    private String value; // Значення елемента
    private Text next;    // Посилання на наступний елемент
    private Text prev;    // Посилання на попередній елемент

    // Геттер і сеттер для значення
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    // Геттер і сеттер для наступного елемента
    public Text getNext() {
        return next;
    }
    public void setNext(Text next) {
        this.next = next;
    }

    // Геттер і сеттер для попереднього елемента
    public Text getPrev() {
        return prev;
    }
    public void setPrev(Text prev) {
        this.prev = prev;
    }
}
