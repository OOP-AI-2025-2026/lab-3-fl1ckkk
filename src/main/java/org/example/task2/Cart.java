package org.example.task2;

import java.util.Arrays;

/**
 * Клас Cart представляє корзину товарів.
 * Використовується для зберігання об'єктів Item.
 */
public final class Cart {

    /** Массив товарів у корзині. */
    private final Item[] contents;

    /** Індекс наступного вільного місця. */
    private int index;

    /**
     * Конструктор створює корзину з певною ємністю.
     *
     * @param capacity ємність корзини.
     */
    public Cart(final int capacity) {
        this.contents = new Item[capacity];
        this.index = 0;
    }

    /**
     * Додає товар у корзину.
     *
     * @param item товар для додавання.
     */
    public void add(final Item item) {
        if (isFull()) {
            return;
        }
        contents[index++] = item;
    }

    /**
     * Видаляє товар за індексом у масиві.
     *
     * @param itemId індекс товару для видалення.
     */
    public void removeById(final int itemId) {
        if (index == 0) {
            return;
        }

        final int foundItemIndex = findItemIndex(itemId);
        if (foundItemIndex == -1) {
            return;
        }

        shiftArray(foundItemIndex);
    }

    /**
     * Перевіряє, чи корзина повна.
     *
     * @return true, якщо корзина заповнена.
     */
    private boolean isFull() {
        return index == contents.length;
    }

    /**
     * Зсуває елементи після видалення.
     *
     * @param itemIndex індекс елемента для видалення.
     */
    private void shiftArray(final int itemIndex) {
        for (int i = itemIndex; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index - 1] = null;
        index--;
    }

    /**
     * Шукає індекс товару за itemId.
     *
     * @param itemId id товару.
     * @return індекс у масиві або -1.
     */
    private int findItemIndex(final int itemId) {
        for (int i = 0; i < index; i++) {
            if (contents[i].getId() == itemId) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Повертає true, якщо корзина порожня.
     *
     * @return true, якщо порожня.
     */
    public boolean isEmpty() {
        return index == 0;
    }

    /**
     * Обчислює сумарну вартість товарів у корзині.
     *
     * @return сума цін товарів.
     */
    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < index; i++) {
            sum += contents[i].getPrice();
        }
        return sum;
    }

    /**
     * Повертає масив товарів.
     *
     * @return масив Item.
     */
    public Item[] getItems() {
        return Arrays.copyOf(contents, index);
    }

    /**
     * Повертає рядкове представлення корзини.
     *
     * @return рядок з усіма товарами.
     */
    @Override
    public String toString() {
        return "Cart{"
                + "contents=" + Arrays.toString(contents)
                + "}"
                + "\n";
    }
}
