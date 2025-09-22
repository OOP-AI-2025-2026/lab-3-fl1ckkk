package org.example.task2;

/**
 * Клас IntStack реалізує стек цілих чисел за допомогою внутрішнього масиву.
 * Клас фінальний, щоб уникнути неправильного розширення.
 */
public final class IntStack {

    /** Внутрішній масив для зберігання елементів стеку. */
    private int[] elements;

    /** Поточна кількість елементів у стеку. */
    private int size;

    /** Початковий розмір масиву. */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Конструктор створює порожній стек з початковим розміром масиву.
     */
    public IntStack() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Додає елемент у верхівку стеку.
     *
     * @param value доданий елемент.
     */
    public void push(final int value) {
        if (size == elements.length) {
            expandCapacity();
        }
        elements[size] = value;
        size++;
    }

    /**
     * Видаляє і повертає верхній елемент стеку.
     *
     * @return верхній елемент або 0, якщо стек порожній.
     */
    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        size--;
        return elements[size];
    }

    /**
     * Повертає верхній елемент стеку без видалення.
     *
     * @return верхній елемент або 0, якщо стек порожній.
     */
    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        return elements[size - 1];
    }

    /**
     * Повертає кількість елементів у стеку.
     *
     * @return кількість елементів.
     */
    public int size() {
        return size;
    }

    /**
     * Перевіряє, чи порожній стек.
     *
     * @return true, якщо стек порожній, інакше false.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Очищає стек.
     */
    public void clear() {
        size = 0;
    }

    /**
     * Розширює внутрішній масив у два рази.
     */
    private void expandCapacity() {
        int[] newArray = new int[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }
}
