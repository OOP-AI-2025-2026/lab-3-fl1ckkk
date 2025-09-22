package org.example.task2;

/**
 * Головний клас для демонстрації роботи Box, Item, Cart, Order та IntStack.
 * Виконує завдання 1–3.
 */
public final class Main {

    // ===== Константи для Box =====
    /** Ширина першої коробки. */
    private static final int BOX1_WIDTH = 2;
    /** Висота першої коробки. */
    private static final int BOX1_HEIGHT = 3;
    /** Глибина першої коробки. */
    private static final int BOX1_DEPTH = 4;

    /** Ширина другої коробки. */
    private static final int BOX2_WIDTH = 5;
    /** Висота другої коробки. */
    private static final int BOX2_HEIGHT = 2;
    /** Глибина другої коробки. */
    private static final int BOX2_DEPTH = 2;

    // ===== Константи для Item/Cart =====
    /** Максимальна кількість елементів у кошику. */
    private static final int CART_CAPACITY = 10;

    // ===== Item 1 =====
    /** ID першого товару. */
    private static final int ITEM1_ID = 1;
    /** Назва першого товару. */
    private static final String ITEM1_NAME = "Samsung Galaxy S23";
    /** Ціна першого товару у гривнях. */
    private static final int ITEM1_PRICE = 27999;

// ===== Item 2 =====
    /** ID другого товару. */
    private static final int ITEM2_ID = 2;
    /** Назва другого товару. */
    private static final String ITEM2_NAME = "Lenovo IdeaPad 3";
    /** Ціна другого товару у гривнях. */
    private static final int ITEM2_PRICE = 19499;

// ===== Item 3 =====
    /** ID третього товару. */
    private static final int ITEM3_ID = 3;
    /** Назва третього товару. */
    private static final String ITEM3_NAME = "LG 55\" 4K Smart TV";
    /** Ціна третього товару у гривнях. */
    private static final int ITEM3_PRICE = 15999;

// ===== Item 4 =====
    /** ID четвертого товару. */
    private static final int ITEM4_ID = 4;
    /** Назва четвертого товару. */
    private static final String ITEM4_NAME = "Bosch Serie 6 Пральна машина";
    /** Ціна четвертого товару у гривнях. */
    private static final int ITEM4_PRICE = 14799;

// ===== Item 5 =====
    /** ID п'ятого товару. */
    private static final int ITEM5_ID = 5;
    /** Назва п'ятого товару. */
    private static final String ITEM5_NAME = "Samsung RB34 Холодильник";
    /** Ціна п'ятого товару у гривнях. */
    private static final int ITEM5_PRICE = 22399;

// ===== Item 6 =====
    /** ID шостого товару. */
    private static final int ITEM6_ID = 6;
    /** Назва шостого товару. */
    private static final String ITEM6_NAME = "De'Longhi Magnifica S Кавоварка";
    /** Ціна шостого товару у гривнях. */
    private static final int ITEM6_PRICE = 10599;

// ===== Item 7 =====
    /** ID сьомого товару. */
    private static final int ITEM7_ID = 7;
    /** Назва сьомого товару. */
    private static final String ITEM7_NAME = "Gorenje Електрична плита";
    /** Ціна сьомого товару у гривнях. */
    private static final int ITEM7_PRICE = 9999;

// ===== Item 8 =====
    /** ID восьмого товару. */
    private static final int ITEM8_ID = 8;
    /** Назва восьмого товару. */
    private static final String ITEM8_NAME = "Dyson V11 Пилосос";
    /** Ціна восьмого товару у гривнях. */
    private static final int ITEM8_PRICE = 16499;

// ===== Item 9 =====
    /** ID дев'ятого товару. */
    private static final int ITEM9_ID = 9;
    /** Назва дев'ятого товару. */
    private static final String ITEM9_NAME = "Samsung ME83K Мікрохвильова піч";
    /** Ціна дев'ятого товару у гривнях. */
    private static final int ITEM9_PRICE = 3199;

// ===== Item 10 =====
    /** ID десятого товару. */
    private static final int ITEM10_ID = 10;
    /** Назва десятого товару. */
    private static final String ITEM10_NAME = "Philips DryCare Фен";
    /** Ціна десятого товару у гривнях. */
    private static final int ITEM10_PRICE = 1499;

    // ===== Константи для IntStack =====
    /** Перший елемент стеку. */
    private static final int STACK_VALUE1 = 10;
    /** Другий елемент стеку. */
    private static final int STACK_VALUE2 = 20;
    /** Третій елемент стеку. */
    private static final int STACK_VALUE3 = 30;

    /**
     * Головний метод програми.
     *
     * @param args параметри командного рядка
     */
    public static void main(final String[] args) {

        // ===== Завдання 1: Box =====
        System.out.println("=== Завдання 1: Box ===");
        Box box1 = new Box(BOX1_WIDTH, BOX1_HEIGHT, BOX1_DEPTH);
        Box box2 = new Box(BOX2_WIDTH, BOX2_HEIGHT, BOX2_DEPTH);

        System.out.println("Box1 volume: " + box1.getVolume());
        System.out.println("Box2 volume: " + box2.getVolume());

        Box biggerBox = box1.compare(box2);
        System.out.println("Більший об’єм має: " + biggerBox);

        // ===== Завдання 2: Item, Cart, Order =====
        System.out.println("\n=== Завдання 2: Item, Cart, Order ===");
        Cart cart = new Cart(CART_CAPACITY);

        cart.add(new Item(ITEM1_ID, ITEM1_NAME, ITEM1_PRICE));
        cart.add(new Item(ITEM2_ID, ITEM2_NAME, ITEM2_PRICE));
        cart.add(new Item(ITEM3_ID, ITEM3_NAME, ITEM3_PRICE));
        cart.add(new Item(ITEM4_ID, ITEM4_NAME, ITEM4_PRICE));
        cart.add(new Item(ITEM5_ID, ITEM5_NAME, ITEM5_PRICE));
        cart.add(new Item(ITEM6_ID, ITEM6_NAME, ITEM6_PRICE));
        cart.add(new Item(ITEM7_ID, ITEM7_NAME, ITEM7_PRICE));
        cart.add(new Item(ITEM8_ID, ITEM8_NAME, ITEM8_PRICE));
        cart.add(new Item(ITEM9_ID, ITEM9_NAME, ITEM9_PRICE));
        cart.add(new Item(ITEM10_ID, ITEM10_NAME, ITEM10_PRICE));

        System.out.println(cart);

        System.out.println("Чи кошик порожній? " + cart.isEmpty());
        System.out.println("Загальна вартість кошика: " + cart.getTotalPrice());

        cart.removeById(ITEM9_ID);
        System.out.println("Після видалення елемента з id=" + ITEM9_ID + ":");
        System.out.println(cart);

        Order order = new Order(1, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        // ===== Завдання 3: IntStack =====
        System.out.println("\n=== Завдання 3: IntStack ===");
        IntStack stack = new IntStack(); // можна без параметра

        stack.push(STACK_VALUE1);
        stack.push(STACK_VALUE2);
        stack.push(STACK_VALUE3);

        System.out.println("Верхній елемент: " + stack.peek()); // 30
        System.out.println("Видалено: " + stack.pop());         // 30
        System.out.println("Новий верх: " + stack.peek());      // 20
        System.out.println("Розмір стеку: " + stack.size());    // 2

        System.out.println("Чи порожній? " + stack.isEmpty()); // false
        stack.clear();
        System.out.println("Після clear() - чи порожній? "
                + stack.isEmpty()); // true
    }

    /**
     * Приватний конструктор, щоб приховати конструктор утиліти.
     */
    private Main() {
        throw new UnsupportedOperationException(
                "This is a utility class and cannot be instantiated");
    }
}
